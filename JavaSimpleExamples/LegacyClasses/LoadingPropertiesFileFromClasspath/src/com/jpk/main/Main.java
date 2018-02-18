package com.jpk.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream input;

        String propertiesFileName = "configuration.properties";
        input = Main.class.getClassLoader().getResourceAsStream(propertiesFileName);
        if (input == null) {
            System.out.println("Can not found propertiesFile with name: " + propertiesFileName);
            return;
        }
        try {
            properties.load(input);
            System.out.println(properties.getProperty("url"));
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            throw new RuntimeException("Can not load properties form stream!!" + e.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    throw new RuntimeException("Cannot close the input stream!!" + e.getMessage());
                }
            }
        }
    }
}
