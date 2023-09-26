package com.codebase.Hero.Classes;

import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Fighter extends WeaponUser {
    public Fighter(Heritage givenHeritage) {
        super(ClassNames.FIGHTER,100, givenHeritage);
    }
}
