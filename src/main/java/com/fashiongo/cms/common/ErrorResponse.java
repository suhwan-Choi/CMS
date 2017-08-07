package com.fashiongo.cms.common;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private final HttpStatus status;

    // General Error message
    private final String message;

    // Error code
    private final Integer errorCode;

    protected ErrorResponse(final String message, final Integer errorCode, HttpStatus status) {
        this.message = message;
        this.errorCode = errorCode;
        this.status = status;
    }

    public static ErrorResponse of(final String message, final Integer errorCode, HttpStatus status) {
        return new ErrorResponse(message, errorCode, status);
    }

    public Integer getStatus() {
        return status.value();
    }

    public String getMessage() {
        return message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
