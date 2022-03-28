package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.constants.Constants;
import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.entity.ResultCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Decoder implements Action {

    @Override
    public Result execute(String[] parameters) {
        int key = Integer.parseInt(parameters[2]);
        String textEncode = parameters[0];
        String textEn = null;
        String textDecode = parameters[1];
        try {
            textEn = Files.readString(Paths.get(textEncode));
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] charTextEn = textEn.toCharArray();
        for (int i = 0; i < charTextEn.length; i++) {
            for (int j = 0; j < Constants.ALPHABET.length; j++) {
                if (charTextEn[i] == Constants.ALPHABET[j]) {
                    charTextEn[i] = Constants.ALPHABET[(Constants.ALPHABET.length + j - key) % Constants.ALPHABET.length];
                    break;
                }
            }
        }
        StringBuilder textDecodeBuilder = new StringBuilder().append(charTextEn);
        try {
            Files.writeString(Path.of(textDecode), textDecodeBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Result("decode all right", ResultCode.OK);
    }
}

