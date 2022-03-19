package ru.javarush.komlev.cryptoanalizer.exception;

public class AppException extends RuntimeException {
    //сюда можно положить резалткод с сообщением и кодом ошибки
    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

}
