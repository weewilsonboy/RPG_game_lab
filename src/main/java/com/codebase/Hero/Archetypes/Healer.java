package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;
import com.codebase.weapons.spells.HealingSpells;
import com.codebase.weapons.spells.OffensiveSpells;

public class Healer extends SpellUser{
    public Healer(ClassNames classGiven, int hp, Heritage givenHeritage) {
        super(classGiven, hp, givenHeritage);
        this.spellArrayList.add(OffensiveSpells.SMITE);
        this.healingArrayList.add(HealingSpells.HEALINGWORD);
        this.healingArrayList.add(HealingSpells.LAYONHANDS);
        this.healingArrayList.add(HealingSpells.HEALTHPOTION);
        this.healingArrayList.add(HealingSpells.GOODBERRY);

    }
}
