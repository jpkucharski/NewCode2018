package com.jpk.main;

public class Main {

    private static final int STRING_SIZE = 100000000;
    String string;
    StringBuffer stringBuffer;
    StringBuilder stringBuilder;

    public static void main(String[] args) {


        Main main = new Main();

        main.addInStringBuilder();
        main.addInString();
        main.addInStringBuffer();

    }

    private void addInStringBuffer() {
        stringBuffer=new StringBuffer();
        long timeStart = System.nanoTime();
        for (int i = 0; i < STRING_SIZE; i++) {
            stringBuffer = stringBuffer.append("");
        }
        long timeElapsed = System.nanoTime() - timeStart;
        System.out.println(timeElapsed / 1000000 + "ms for StringBuffer.append()");
        System.gc();
    }


    private void addInStringBuilder() {
        stringBuilder=new StringBuilder();
        long timeStart = System.nanoTime();
        for (int i = 0; i < STRING_SIZE; i++) {
            stringBuilder = stringBuilder.append("");
        }
        long timeElapsed = System.nanoTime() - timeStart;
        System.out.println(timeElapsed / 1000000 + "ms for StringBuilder.append()");
        System.gc();
    }

    private void addInString() {
        long timeStart = System.nanoTime();
        for (int i = 0; i < STRING_SIZE; i++) {
            string = string + "";
        }
        long timeElapsed = System.nanoTime() - timeStart;
        System.out.println(timeElapsed / 1000000 + "ms for String +");
        System.gc();
    }


}
