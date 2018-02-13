package com.jpk.main;

public enum SimpleEnum {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int levelCode;

    private SimpleEnum(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode(){
        return this.levelCode;
    }
}

