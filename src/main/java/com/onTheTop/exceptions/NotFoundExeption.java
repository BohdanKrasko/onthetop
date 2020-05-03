package com.onTheTop.exceptions;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption() {
        super("Not found");
    }
}
