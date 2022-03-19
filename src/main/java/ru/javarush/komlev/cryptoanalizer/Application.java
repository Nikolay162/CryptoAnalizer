package ru.javarush.komlev.cryptoanalizer;

import ru.javarush.komlev.cryptoanalizer.controllers.MainController;
import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.exception.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        //encode text.txt encrypt.txt 12
        if (args.length > 0) {
            String action = args[0];//action == encode
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);//parameters== text.txt encrypt.txt 12

            return mainController.doAction(action, parameters);
        } else {
            throw new AppException("no args");
        }
    }
}
