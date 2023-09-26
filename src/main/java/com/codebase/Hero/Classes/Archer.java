package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Archer extends WeaponUser {
    public Archer(Heritage givenHeritage) {
        super(ClassNames.ARCHER,75, givenHeritage);
    }
}
