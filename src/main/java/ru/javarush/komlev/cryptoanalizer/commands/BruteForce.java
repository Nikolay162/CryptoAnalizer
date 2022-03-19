package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.entity.Result;
import ru.javarush.komlev.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action {

    @Override
    public Result execute(String[] parameters) {
        // TO DO something do
            return new Result("bruteforce complete", ResultCode.OK);
        }
    }

