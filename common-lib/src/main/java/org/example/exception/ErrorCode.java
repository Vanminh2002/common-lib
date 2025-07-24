package org.example.exception;

public enum ErrorCode {
    UNKNOWN_ERROR(500, "Unknown error"),
    VALIDATION_ERROR(400, "Validation failed"),
    NOT_FOUND(404, "Resource not found");
    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
