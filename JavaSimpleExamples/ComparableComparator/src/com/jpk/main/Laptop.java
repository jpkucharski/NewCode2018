package com.jpk.main;

public class Laptop {

    private String brand;
    private int ram, price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public int getRam() {
        return ram;
    }


    public int getPrice() {
        return price;
    }


}
