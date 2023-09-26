package com.codebase.weapons;

import com.codebase.Hero.Classes.Archer;
import com.codebase.Hero.Classes.Barbarian;
import com.codebase.Hero.Classes.Fighter;
import com.codebase.Hero.Hero;
import com.codebase.Hero.Races.Dwarf;
import com.codebase.Hero.Races.Elf;
import com.codebase.Hero.Races.Human;

public enum Weapons {
    SWORD("",20,new Fighter(new Human())),
    CLUB("",12,new Barbarian(new Dwarf())),
    BOW("",15,new Archer(new Elf()));
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
        if(givenClass.equals("Barbarian") && bestClass.getClassName().equals("Barbarian")){
            return damage+20;
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
