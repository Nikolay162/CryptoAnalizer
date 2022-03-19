package ru.javarush.komlev.cryptoanalizer.constants;

import java.io.File;
import java.nio.file.Files;

public class Constants {
    private static final String rus = "русские буквы";
    private static final String eng = "english letters";
    private static final String cypher = "0123456789";
    private static final String z = "!%@#^&*(){}[]";
    public static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + z;
    public static final String TXT_FOLDER=System.getProperty("user.dir")+
            File.separator+
            "text"+
            File.separator;
}
