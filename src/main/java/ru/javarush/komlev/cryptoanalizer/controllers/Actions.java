package ru.javarush.komlev.cryptoanalizer.controllers;


import ru.javarush.komlev.cryptoanalizer.commands.Action;
import ru.javarush.komlev.cryptoanalizer.commands.BruteForce;
import ru.javarush.komlev.cryptoanalizer.commands.Decoder;
import ru.javarush.komlev.cryptoanalizer.commands.Encoder;
import ru.javarush.komlev.cryptoanalizer.exception.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTEFORCE (new BruteForce());

    private final Action action;


    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
       try {

        Actions value = Actions.valueOf(actionName.toUpperCase());
        return value.action;
    } catch (IllegalArgumentException e){
           throw new AppException("not found" + actionName, e);
       }
    }

}





