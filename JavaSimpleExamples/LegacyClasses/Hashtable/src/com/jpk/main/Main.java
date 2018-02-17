package com.jpk.main;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    private Hashtable ht;
    public static final int NUMBER_OF_ELEMENTS = 10;

    public static void main(String[] args){
        Main mainObject = new Main();
        mainObject.task();
    }

    private void task(){
       ht = createHashTable();
       for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
           addToHashTable(i,"Value"+i);
        }
        printContentOfHashTable(ht);
    }

    private Hashtable createHashTable(){
        ht = new Hashtable();
        return ht;
    }

    private void addToHashTable(Object key, Object value){
        ht.put(key,value);
    }

    private Set getEntrySetFromHashTable(Hashtable hashTable){
        return hashTable.entrySet();
    }

    private void printContentOfHashTable(Hashtable hashTable){
        if(!hashTable.isEmpty()) {
            Iterator itr = getEntrySetFromHashTable(hashTable).iterator();
            while (itr.hasNext()) {
                Map.Entry me = (Map.Entry) itr.next();
                System.out.println(me.getKey() + "/" + me.getValue());
            }
        }
        else{
            System.out.println("HashTable is empty!!");
        }
    }
}