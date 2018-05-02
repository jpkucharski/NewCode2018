package com.jpk.main;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;


    public User(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof User) {
            return true;
        }

        User user = (User) obj;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
}