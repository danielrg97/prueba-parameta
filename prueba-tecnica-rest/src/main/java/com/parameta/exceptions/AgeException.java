package com.parameta.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AgeException extends ApplicationException{
    public AgeException(String message, boolean suppressStacktrace) {
        super(message, suppressStacktrace);
    }
}
