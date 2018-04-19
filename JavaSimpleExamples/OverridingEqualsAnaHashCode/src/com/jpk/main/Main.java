package com.jpk.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Student student1 = new Student("H234");
        Student student2 = new Student("H234");
        System.out.println(student1.equals(student2));
         Map<Student, RapportCard> studentsRapport = new HashMap<Student, RapportCard>();

         studentsRapport.put(student1,new RapportCard());
         studentsRapport.put(student2,new RapportCard());

        System.out.println(studentsRapport.size());


        Set<Student> setOfStudents = new HashSet<>();
        for(int i = 0 ; i<100; i++){
            setOfStudents.add(new Student("H"+i));
        }

        System.out.println("Size of setOfStudents: " + setOfStudents.size());

        long startTime = System.nanoTime();
        System.out.println("setOfStudents contains Student H4? " + setOfStudents.contains( new Student("H4")));
        System.out.println("Elapsed time: " + (System.nanoTime()-startTime));



    }
}
