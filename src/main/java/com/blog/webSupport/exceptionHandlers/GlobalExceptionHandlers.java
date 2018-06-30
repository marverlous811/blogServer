package com.blog.webSupport.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minht on 6/30/2018.
 */
public class GlobalExceptionHandlers {

    @ControllerAdvice
    @RestController
    public class GlobalExceptionHandler {

        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(value = IllegalArgumentException.class)
        public String handleBaseException(IllegalArgumentException e) {
            return e.getMessage();
        }

    }
}
