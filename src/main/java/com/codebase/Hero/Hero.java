package com.codebase.Hero;

public class Hero {
    private String className;
    private int hp;

    public Hero(String className, int hp) {
        this.className = className;
        this.hp = hp;
    }

    public String getClassName() {
        return className;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hpChange) {
        this.hp += hpChange;
    }
}
