package com.jpk.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties properties = new Properties();
        FileOutputStream outputStream;

        try {
            outputStream = new FileOutputStream("./config/configuration.properties");

            properties.setProperty("url", "urlAddressOfDatabase");
            properties.setProperty("username", "databaseUsername");
            properties.setProperty("password", "databasePassword");

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Incorrect file path exception!!" + e.getMessage());
        }
        try {

            properties.store(outputStream, null);

        } catch
                (IOException e) {
            throw new RuntimeException("Output stream exception!!");
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Can not close the output stream!!");
            }
        }
    }
}