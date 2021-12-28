package com.company;

public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    Level(int num) {
        this.lvlNum = num;
    }

    int getLvl() {
       return this.lvlNum;
    }

    public void setLvl(int num) {
         this.lvlNum = num;
    }

}
