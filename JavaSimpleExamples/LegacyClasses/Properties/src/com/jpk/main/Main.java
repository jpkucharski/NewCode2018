package com.jpk.main;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

    private static final int NUMBER_OF_VALUES = 10;
    private Properties properties;
    private Properties defaultProperties;
    private Set setOfKeys;

    public static void main (String[] args){
        Main mainObject = new Main();
        mainObject.task();
    }

    private void task() {
        createDefaultProperties();
        createProperties();
        fillPropertiesWithData(NUMBER_OF_VALUES);
        createPropertiesOfKeys(properties);
        printContentOfProperties(properties);
        System.out.println(properties.getProperty("Key11"));
    }

    private void createDefaultProperties() {
        defaultProperties = new Properties();
        defaultProperties.put("Key11","defaultValue11");

    }

    private void printContentOfProperties(Properties properties) {
        Iterator iterator = setOfKeys.iterator();
        while(iterator.hasNext()){
           String str = (String)iterator.next();
           System.out.println(str + " / " + properties.getProperty(str));
        }

    }

    private Set createPropertiesOfKeys(Properties properties) {
        setOfKeys = properties.keySet();
        return setOfKeys;
    }


    private void fillPropertiesWithData(int numberOfValues) {
        for(int i=0; i< numberOfValues;i++){
                properties.put("Key"+i,"Value"+i);
        }
    }


    private Properties createProperties() {
        properties = new Properties(defaultProperties);
        return properties;
    }
}
