package com.blog.webSupport.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by minht on 6/30/2018.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DataExistsException extends RuntimeException {
    public DataExistsException() {
        super();
    }

    public DataExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataExistsException(String message) {
        super(message);
    }

    public DataExistsException(Throwable cause) {
        super(cause);
    }
    public DataExistsException(String field, String value){

        super(field+ " = "+value+" existed");

    }

}
