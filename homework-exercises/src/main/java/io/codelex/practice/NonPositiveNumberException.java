package io.codelex.practice;

public class NonPositiveNumberException extends IllegalArgumentException {
    public NonPositiveNumberException() {
    }
    public NonPositiveNumberException(String message) {
        super(message);
    }
}
