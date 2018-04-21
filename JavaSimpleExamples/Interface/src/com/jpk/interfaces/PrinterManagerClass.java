package com.jpk.interfaces;

public class PrinterManagerClass extends Printer{

    private static final String TEXT_FROM_PRINTER_MANAGER_CLASS = "Print from Printing Manager Class.";

    @Override
    public void print(String string) {
        System.out.println(TEXT_FROM_PRINTER_MANAGER_CLASS + super.someAnotherMethodJustForThisPackage() + x);
    }
}
