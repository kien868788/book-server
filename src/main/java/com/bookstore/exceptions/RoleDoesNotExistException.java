package com.bookstore.exceptions;

public class RoleDoesNotExistException extends RuntimeException {

    public RoleDoesNotExistException() {
    }

    public RoleDoesNotExistException(String message) {
        super(message);
    }
}
