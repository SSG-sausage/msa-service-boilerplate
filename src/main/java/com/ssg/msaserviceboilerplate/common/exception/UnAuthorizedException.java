package com.ssg.msaserviceboilerplate.common.exception;

public class UnAuthorizedException extends BusinessException {

    public UnAuthorizedException(String message) {
        super(message, ErrorCode.UNAUTHORIZED_EXCEPTION);
    }
}
