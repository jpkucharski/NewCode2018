package com.jpk.main;

public class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void fallowHeroShi(){
        System.out.println(getName() + "is fallowing the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and dos damage " + getDamage());
    }


}
