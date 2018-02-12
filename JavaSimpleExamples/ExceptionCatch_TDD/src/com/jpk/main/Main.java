package com.jpk.main;

import com.jpk.exceptions.ValidationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    static String path = "c:/NewFolder/xax.txt";


    public static void main(String[] args) throws FileNotFoundException {





        Main m = new Main();
        m.getFile(path);



    }

    public File getFile(String path) throws FileNotFoundException {
        File file = null;
        try {
            file = new File(path);
            FileInputStream fis = new FileInputStream(file);

        }
        catch (FileNotFoundException e){
            throw new ValidationException();
        }
        return file;
    }



}
