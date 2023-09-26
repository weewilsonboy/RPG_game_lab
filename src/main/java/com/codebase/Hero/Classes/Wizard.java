package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.Mage;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Wizard extends Mage {
    public Wizard(Heritage givenHeritage) {
        super(ClassNames.WIZARD, 140,givenHeritage);
        setChosenSpell(1);
    }
}
