package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.constants.Constants;
import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.entity.ResultCode;
import ru.javarush.komlev.cryptoanalizer.exception.AppException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BruteForce implements Action {

    @Override
    public Result execute(String[] parameters) {
        String textForBF = parameters[0];
        String textDecodeBF = parameters[1];
        List<Character> abc = new ArrayList<>();
        Collections.addAll(abc, Constants.ALPHABET);
        int result = Integer.MIN_VALUE;
        int bestKey = Integer.MIN_VALUE;
        for (int keyBF = 0; keyBF < abc.size(); keyBF++) {
            int space = 0;
            try (FileReader reader = new FileReader(textForBF);
                 FileWriter writer = new FileWriter(textDecodeBF)) {
                int count;
                while ((count = reader.read()) != -1) {
                    int index = abc.indexOf((char) count);
                    int nextIndex = index - keyBF;
                    if (nextIndex < 0) {
                        nextIndex = nextIndex + abc.size();
                    }
                    if (abc.get(nextIndex).equals(' ')) {
                        space++;
                    }
                }
                if (space > result) {
                    result = space;
                    bestKey = keyBF;
                }
                writer.write(Integer.toString(bestKey));

            } catch (IOException e) {
                throw new AppException(e);
            }

        }
        try (FileReader reader = new FileReader(textForBF);
             FileWriter writer = new FileWriter(textDecodeBF)) {
            int count;
            while ((count = reader.read()) != -1) {
                int index = abc.indexOf((char) count);
                int nextIndex = index - bestKey;
                if (nextIndex < 0) {
                    nextIndex = nextIndex + abc.size();
                }

                writer.write(abc.get(nextIndex));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Result("bruteforce complete", ResultCode.OK);
    }
}
