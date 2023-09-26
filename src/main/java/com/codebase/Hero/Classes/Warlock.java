package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.Mage;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;
import com.codebase.weapons.spells.OffensiveSpells;

public class Warlock extends Mage {
    public Warlock(Heritage givenHeritage) {
        super(ClassNames.WARLOCK, 150,givenHeritage);
        setChosenSpell(3);
    }
}
