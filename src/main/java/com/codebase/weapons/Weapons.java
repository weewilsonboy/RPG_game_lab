package com.codebase.weapons;

import com.codebase.Hero.Archer;
import com.codebase.Hero.Barbarian;
import com.codebase.Hero.Fighter;
import com.codebase.Hero.Hero;

public enum Weapons {
    SWORD("",20,new Fighter("Fighter",100)),
    CLUB("",12,new Barbarian("Barbarian",150)),
    BOW("",15,new Archer("Archer",75));
    String strongAgainst;
    int damage;
    Hero bestClass;

    Weapons(String strongAgainst, int damage, Hero bestClass) {
        this.strongAgainst = strongAgainst;
        this.damage = damage;
        this.bestClass = bestClass;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public int getDamage(String givenClass) {
        if(givenClass.equals("Archer") && !bestClass.getClassName().equals("Archer")){
            return damage/2;
        }
        if (givenClass == bestClass.getClassName()){
            return damage*2;
        }
        return damage;
    }

    public Hero getBestClass() {
        return bestClass;
    }
}
