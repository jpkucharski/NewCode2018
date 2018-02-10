package com.jpk.interfaces;

class Printer implements InterfaceAble {

    private static final String TEXT_FROM_PRINTER = "Text From Printer";

    @Override
    public void print(String string) {
        System.out.println(TEXT_FROM_PRINTER);
    }

    protected String someAnotherMethodJustForThisPackage(){
        return " Added inner generated text. ";
    }
}
