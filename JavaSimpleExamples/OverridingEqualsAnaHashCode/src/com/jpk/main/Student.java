package com.jpk.main;

public class Student {

    private String registrationNumber;

    public Student(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean equals(Object object){
//        System.out.println("From Map");
        if(object!= null && object instanceof Student){
            String regNumber = ((Student)object).getRegistrationNumber();
            if(regNumber!=null && regNumber.equals(this.getRegistrationNumber())){
            return true;
            }

        }
        return false;
    }
//
    public int hashCode(){
//        System.out.println("From map...");
        return this.registrationNumber.hashCode();
//        return 5;
    }

}
