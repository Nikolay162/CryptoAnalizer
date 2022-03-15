package ru.javarush.komlev.cryptoanalizer.commands;

import ru.javarush.komlev.cryptoanalizer.entity.Result;

public interface Action {
    Result execute (String[] parameters);
}
