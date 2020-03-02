package com.tao.yeblog.exception;

import io.jsonwebtoken.Claims;

public class UserLoginInvalidException extends Exception {

    public UserLoginInvalidException() {
        super();
    }

    public UserLoginInvalidException(String message) {
        super(message);
    }
}
