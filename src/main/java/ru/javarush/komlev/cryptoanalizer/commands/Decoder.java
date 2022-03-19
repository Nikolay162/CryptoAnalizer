package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action {

    @Override
    public Result execute(String[] parameters) {
            //TODO something do
            return new Result("decode all right", ResultCode.OK);
        }
    }

