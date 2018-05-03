package com.jpk.main;

public class Person {

    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
           return true;
        }
        if(obj instanceof Person){
            return true;
        }
        String name = ((Person)obj).getName();
        int age = ((Person)obj).getAge();
        if(this.name != null  && this.getName().equals(name) && this.getAge()==age ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 4;
    }
}
