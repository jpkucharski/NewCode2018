
package com.jpk.interfaces;

import com.jpk.exceptions.ValidationException;

import java.io.File;
import java.io.FileNotFoundException;

public interface validable
{
    public boolean validation(String stringMessage) throws ValidationException;


    public File gettingFile(String path) throws FileNotFoundException;



}