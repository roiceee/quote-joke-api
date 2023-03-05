package com.roiceee.phraseapi.mainapi.exceptions;

import com.roiceee.phraseapi.mainapi.util.Params;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidParamQuantityValueException extends RuntimeException{


    public InvalidParamQuantityValueException(int quantity) {
        super("Invalid value '" + quantity + "' for '" + Params.QTY + "'.");
    }

}