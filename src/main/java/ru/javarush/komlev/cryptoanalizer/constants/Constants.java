package ru.javarush.komlev.cryptoanalizer.constants;

import java.io.File;

public class Constants {
    public static final Character[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
            'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', '.', ',', '«', '»', '"', '/', ':', ';', '!', '?', '-', '_', ' ',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final String TXT_FOLDER=System.getProperty("user.dir")+
            File.separator+
            "text"+
            File.separator;
}
