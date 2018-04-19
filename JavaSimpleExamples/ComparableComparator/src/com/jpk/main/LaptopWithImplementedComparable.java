package com.jpk.main;

public class LaptopWithImplementedComparable implements Comparable<LaptopWithImplementedComparable> {

    private String brand;
    private int ram, price;

    public LaptopWithImplementedComparable(String brand, int ram, int price) {
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


    @Override
    public int compareTo(LaptopWithImplementedComparable laptop2) {

        // this > laptop2 = +
        // this < laptop2 = -
        // this ==laptop2 = 0

        if (this.getRam() > laptop2.getRam()) {
            return 1;
        } else {
            return -1;
        }
    }
}
