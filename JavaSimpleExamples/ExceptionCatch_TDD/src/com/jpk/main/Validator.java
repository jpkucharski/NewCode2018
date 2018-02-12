package com.jpk.main;

import com.jpk.exceptions.ValidationException;
import com.jpk.interfaces.validable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Validator implements validable {

    private static final String INVALID_STRING_LENGTH_ERROR_MESSAGE = "String length is not equal to 4";
    private static final int EXPECTED_STRING_LENGTH = 4;

    @Override
    public boolean validation(String stringMessage){
        boolean isValid = false;
        if (stringMessage.length() == EXPECTED_STRING_LENGTH) {
            isValid = true;
        } else {
            throw new ValidationException(INVALID_STRING_LENGTH_ERROR_MESSAGE);
        }
        return isValid;
    }

    @Override
    public File gettingFile(String path) {
        File file = null;
        try {
            file = new File(path);
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new ValidationException(e.getMessage());
        }
        return file;
    }

}
