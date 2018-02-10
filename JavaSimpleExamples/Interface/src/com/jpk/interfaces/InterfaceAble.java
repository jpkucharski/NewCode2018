package com.jpk.interfaces;

public interface InterfaceAble {

    String staticValue = "Static value from interface";
    String TEXT_FROM_INTERFACE = "Text From Interface";


    default void print(String string){
        System.out.println(TEXT_FROM_INTERFACE);
    }


    static void printIt(){
        System.out.println(staticValue);
    }




}
