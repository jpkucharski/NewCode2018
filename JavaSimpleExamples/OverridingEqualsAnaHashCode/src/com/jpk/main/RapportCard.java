package com.jpk.main;

public class RapportCard {

    private int mathScore;

    public RapportCard(){
        this.mathScore = (int)((Math.random()*101)+1);
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}
