package com.bookstore.exceptions;

public class NoTokenException extends RuntimeException{
    public NoTokenException() {
        super();
    }

    public NoTokenException(String message) {
        super(message);
    }
}
