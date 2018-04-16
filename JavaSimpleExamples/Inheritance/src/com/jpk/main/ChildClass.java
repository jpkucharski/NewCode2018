package com.jpk.main;

public class ChildClass extends ParentClass{

    private int age = 5;

    @Override
    public void  makeNoise(){
        System.out.println("Age of childClass: " + age + " IS DECLARED IN CHILD CLASS, SO WAS OVERRIDE");
        System.out.println("ID number from childClass: " + idNumber + " IS NOT DECLARED ID CHILD CLASS BUT PUBLIC " +
                "IN PARENT CLASS SO IT WILL BE TUK FROM PARENT");
        System.out.println("Driving License from parent: " + "IS PRIVATE IN PARENT CLASS, NO ACCESS FROM CHILD CLASS");
    }
}
