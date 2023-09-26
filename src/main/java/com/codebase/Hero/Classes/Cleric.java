package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.Healer;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Cleric extends Healer {
    public Cleric(Heritage givenHeritage) {
        super(ClassNames.CLERIC, 100,givenHeritage);
    }
}
