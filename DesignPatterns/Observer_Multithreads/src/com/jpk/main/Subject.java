package com.jpk.main;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();

}
