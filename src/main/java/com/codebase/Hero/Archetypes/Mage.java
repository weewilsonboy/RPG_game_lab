package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Hero;
import com.codebase.Hero.Races.Heritage;
import com.codebase.weapons.spells.OffensiveSpells;

public class Mage extends SpellUser{
    public Mage(ClassNames classGiven, int hp, Heritage givenHeritage) {
        super(classGiven, hp,givenHeritage);
        this.spellArrayList.add(OffensiveSpells.FIREBALL);
        this.spellArrayList.add(OffensiveSpells.ICEBLAST);
        this.spellArrayList.add(OffensiveSpells.BLADESTORM);
        if (classGiven.getClassName().equals("Warlock")){
            this.spellArrayList.add(OffensiveSpells.ELDRITCHBLAST);
        }
    }
}
