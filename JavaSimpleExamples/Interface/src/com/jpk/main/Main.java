package com.jpk.main;

import com.jpk.interfaces.InterfaceAble;
import com.jpk.interfaces.PrinterManagerClass;

public class Main {

    private static final String TEST_TEXT = "Test Text For Printing";

    public static void main(String[] args){
        InterfaceAble interPrinter = new PrinterManagerClass();
        InterfaceAble.printIt();
        interPrinter.print(TEST_TEXT);
    }
}
