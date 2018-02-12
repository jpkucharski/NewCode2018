package com.jpk.main;

import com.jpk.exceptions.ValidationException;
import com.jpk.interfaces.validable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Validator implements validable
{
    @Override
    public boolean validation( String stringMessage ) throws ValidationException
    {
        boolean isValid = false;

        if( stringMessage.length() == 4 )
        {
            isValid = true;
        }
        else
        {
            throw new ValidationException();

        }
        return isValid;
    }
    @Override
    public File gettingFile(String path) throws FileNotFoundException {
        File file = null;
        try {
        file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        }
        catch (ValidationException e){

        }
        return file;
    }

}
