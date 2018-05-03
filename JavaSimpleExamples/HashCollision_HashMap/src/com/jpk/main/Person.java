package com.jpk.main;

import java.util.Objects;

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
        if(obj != null && obj instanceof Person) {

            String name = ((Person) obj).getName();
            int age = ((Person) obj).getAge();
            if (this.getName().equals(name) && this.getAge() == age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getAge());
    }
}
