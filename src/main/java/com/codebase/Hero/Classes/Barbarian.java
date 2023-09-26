package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Barbarian extends WeaponUser {
    public Barbarian(Heritage givenHeritage) {
        super(ClassNames.BARBARIAN,150,givenHeritage);
    }
}
