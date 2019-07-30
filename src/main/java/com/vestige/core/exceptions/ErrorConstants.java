package com.vestige.core.exceptions;

import java.net.URI;

public final class ErrorConstants {

	public static final String MESSAGE = "message";
	public static final String PATH = "path";
	public static final String VIOLATIONS = "violations";
	public static final String ERROR_HTTP = "error.http.";
	public static final String METHOD_ARGUMENT_NOT_VALID = "Method argument not valid";
	public static final String FIELD_ERRORS = "fieldErrors";
    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final String NOT_FOUND = "not_found";
    public static final String PROBLEM_BASE_URL = "https://www.jhipster.tech/problem";
    public static final String WRAPPER_BASE_URL = "https://www.wrapper.com/problem";
    public static final URI DEFAULT_TYPE = URI.create(PROBLEM_BASE_URL + "/problem-with-message");
    public static final URI WRAPPER_TYPE = URI.create(WRAPPER_BASE_URL + "/problem-with-message");
    public static final URI CONSTRAINT_VIOLATION_TYPE = URI.create(PROBLEM_BASE_URL + "/constraint-violation");
    public static final URI PARAMETERIZED_TYPE = URI.create(PROBLEM_BASE_URL + "/parameterized");
    public static final URI ENTITY_NOT_FOUND_TYPE = URI.create(PROBLEM_BASE_URL + "/entity-not-found");
    public static final URI INVALID_PASSWORD_TYPE = URI.create(PROBLEM_BASE_URL + "/invalid-password");
    public static final URI INVALID_USERNAME_PASSWORD_TYPE = URI.create(PROBLEM_BASE_URL + "/invalid-username-password");
    public static final URI EMAIL_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/email-already-used");
    public static final URI LOGIN_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/login-already-used");
    public static final URI EMAIL_NOT_FOUND_TYPE = URI.create(PROBLEM_BASE_URL + "/email-not-found");

    private ErrorConstants() {
    }
}
