package com.vestige.core.exceptions;

import java.net.URI;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class ServerExceptionHandler extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    private final String entityName;

    private final String errorKey;

    public ServerExceptionHandler(String defaultMessage, String entityName, String errorKey) {
        this(ErrorConstants.WRAPPER_TYPE, defaultMessage, entityName, errorKey);
    }

    public ServerExceptionHandler(URI type, String defaultMessage, String entityName, String errorKey) {
        super(type, defaultMessage, Status.INTERNAL_SERVER_ERROR, null, null, null, null);
        this.entityName = entityName;
        this.errorKey = errorKey;
    }
    
    
    public ServerExceptionHandler(String defaultMessage, Status status, String entityName, String errorKey) {
        super(ErrorConstants.WRAPPER_TYPE, defaultMessage, status, defaultMessage, null, null, null);
        this.entityName = entityName;
        this.errorKey = errorKey;
    }
    
    public ServerExceptionHandler(String defaultMessage) {
        this(defaultMessage, null, null);
    }
    
    public String getEntityName() {
        return entityName;
    }

    public String getErrorKey() {
        return errorKey;
    }
}
