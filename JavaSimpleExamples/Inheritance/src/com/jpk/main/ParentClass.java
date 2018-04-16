package com.jpk.main;

public class ParentClass {

    private int age = 30;
    public String idNumber = "ABC123";
    private String drivingLicense = "123456";

    public void  makeNoise(){
        System.out.println("Age of parentClass: " + age);
        System.out.println("ID number from parent: " + idNumber);
        System.out.println("Driving License from parent: " + drivingLicense);

    }

}
