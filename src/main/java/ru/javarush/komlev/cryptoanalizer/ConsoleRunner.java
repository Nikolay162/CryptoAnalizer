package ru.javarush.komlev.cryptoanalizer;

import ru.javarush.komlev.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {

        //encode text.txt encrypt.txt 12
        Application application = new Application();
        Result result=application.run(args);
        System.out.println(result);
    }
}

//int key = 123; //<<<< args
//String text = "Превед медвед!";//<<<< args
//String result = "........";//<<<< args