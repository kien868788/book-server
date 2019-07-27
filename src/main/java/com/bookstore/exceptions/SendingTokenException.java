package com.bookstore.exceptions;

public class SendingTokenException extends RuntimeException {

    public SendingTokenException() {
    }

    public SendingTokenException(String message) {
        super(message);
    }
}
