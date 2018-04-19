package com.jpk.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String Args[]) {
        laptopImplementsComparable();
        System.out.println("---------------------");
        laptop();
    }

    private static void laptop() {
        List<Laptop> laptopList1 = new ArrayList<Laptop>();
        laptopList1.add(new Laptop("Dell", 16, 800));
        laptopList1.add(new Laptop("Apple", 8, 1200));
        laptopList1.add(new Laptop("Acer", 12, 700));

        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop laptop1, Laptop laptop2) {
                if (laptop1.getPrice() > laptop2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(laptopList1, comparator);

        for (Laptop laptop : laptopList1) {
            System.out.println(laptop.getBrand() + " / " + laptop.getRam() + " / " + laptop.getPrice());
        }
    }

    private static void laptopImplementsComparable() {
        List<LaptopWithImplementedComparable> laptopList = new ArrayList<LaptopWithImplementedComparable>();
        laptopList.add(new LaptopWithImplementedComparable("Dell", 16, 800));
        laptopList.add(new LaptopWithImplementedComparable("Apple", 8, 1200));
        laptopList.add(new LaptopWithImplementedComparable("Acer", 12, 700));
        Collections.sort(laptopList);
        for (LaptopWithImplementedComparable laptop : laptopList) {
            System.out.println(laptop.getBrand() + " / " + laptop.getRam() + " / " + laptop.getPrice());
        }
    }
}
