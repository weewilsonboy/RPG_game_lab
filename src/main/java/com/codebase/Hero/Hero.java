package com.codebase.Hero;

import com.codebase.Hero.Races.Heritage;

public class Hero {
    private String className;
    private int hp;
    private int maxHp;
    private Heritage heritage;

    public Hero(ClassNames classGiven, int hp, Heritage heritage) {
        this.className = classGiven.getClassName();
        this.hp = hp+ heritage.getMaxHpIncrease();
        this.maxHp = hp+ heritage.getMaxHpIncrease();
        this.heritage=heritage;
    }

    public String getHeritage() {
        return heritage.getHeritageName();
    }

    public String getClassName() {
        return className;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setHp(int hpChange) {
        this.hp += hpChange;
        if(this.hp>this.maxHp){
            this.hp = this.maxHp;
        }
    }
}
