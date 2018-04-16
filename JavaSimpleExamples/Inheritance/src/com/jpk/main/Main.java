package com.jpk.main;

public class Main {

    public static void main (String[] args){

        Main main = new Main();
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        ParentClass upCasting = new ChildClass();

        System.out.println("----------------ParentClass parentClass = new ParentClass();-------------------------");
        parentClass.makeNoise();
        System.out.println("\n----------------ChildClass childClass = new ChildClass();-------------------------");
        childClass.makeNoise();
        System.out.println("\n----------------ParentClass upCasting = new ChildClass();-------------------------");
        upCasting.makeNoise();


    }
}
