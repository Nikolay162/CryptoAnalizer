package ru.javarush.komlev.cryptoanalizer.controllers;

import ru.javarush.komlev.cryptoanalizer.commands.Action;
import ru.javarush.komlev.cryptoanalizer.entity.Result;

public class MainController {
    public Result doAction(String actionName, String [] parameters){
        //action==encode
        //parameters == [text.txt encrypt.txt 12]
        Action action = Actions.find(actionName);
        return action.execute(parameters);
    }
}

