package com.exam.examservice.exception;

public class DataAlreadyExistException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DataAlreadyExistException() {

        super();
    }

    public DataAlreadyExistException(String message) {

        super(message);
    }
}
