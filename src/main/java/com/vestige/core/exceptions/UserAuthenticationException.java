package com.vestige.core.exceptions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import com.vestige.core.enumeration.Message;

public class UserAuthenticationException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;
    
    private String entityName;

    private String errorKey;

    public UserAuthenticationException() {
        super(ErrorConstants.INVALID_USERNAME_PASSWORD_TYPE, Message.INVALID_USER_OR_PASSWORD.getMessage(), Status.UNAUTHORIZED);
    }
    
    public UserAuthenticationException(String message, String entityName, String errorKey) {
        super(ErrorConstants.INVALID_USERNAME_PASSWORD_TYPE, message, Status.UNAUTHORIZED);
        this.entityName = entityName;
        this.errorKey = errorKey;
    }
    
    public String getEntityName() {
        return entityName;
    }

    public String getErrorKey() {
        return errorKey;
    }
}
