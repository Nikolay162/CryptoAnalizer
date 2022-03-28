package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.constants.Constants;
import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.entity.ResultCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Encoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        String text = parameters[0];
        String encodeText = parameters[1];
        int key = Integer.parseInt(parameters[2]);
        Path path = Path.of(text);
        String stringText = "";
        try {
            stringText = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] charText = stringText.toCharArray();
        for (int i = 0; i < charText.length; i++) {
            for (int j = 0; j < Constants.ALPHABET.length; j++) {
                if (charText[i] == Constants.ALPHABET[j]) {
                    charText[i] = Constants.ALPHABET[(j + key) % Constants.ALPHABET.length];
                    break;
                }
            }
        }
        StringBuilder textEncode = new StringBuilder().append(charText);
        try {
            Files.writeString(Path.of(encodeText), textEncode);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Result("encode all right", ResultCode.OK);
    }
}
