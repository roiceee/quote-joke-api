package com.roiceee.phraseapi.mainapi.exceptions;

import com.roiceee.phraseapi.mainapi.util.Params;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidParamValueException extends RuntimeException{

    public InvalidParamValueException(int value, String paramName) {
        super("Invalid value '" + value + "' for parameter '" + paramName + "'.");
    }

    public InvalidParamValueException(String value, String paramName) {
        super("Invalid value '" + value + "' for parameter '" + paramName + "'.");
    }

}
