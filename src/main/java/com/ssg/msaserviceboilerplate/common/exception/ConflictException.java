package com.ssg.msaserviceboilerplate.common.exception;

public class ConflictException extends BusinessException {

    public ConflictException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public ConflictException(String message) {
        super(message, ErrorCode.CONFLICT_EXCEPTION);
    }
}
