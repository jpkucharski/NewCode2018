package com.jpk.main;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aapPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }



    @Override
    public void register(Observer newObserver) {
            observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
            int observerIndex = observers.indexOf(deleteObserver);
            observers.remove(observerIndex);
            System.out.println("Observer: " + observerIndex + "was deleted.");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(ibmPrice,aapPrice,googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAapPrice(double aapPrice) {
        this.aapPrice = aapPrice;
        notifyObserver();
    }

    public void setGoogPrce(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }



}

