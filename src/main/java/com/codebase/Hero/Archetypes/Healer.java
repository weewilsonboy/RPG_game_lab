package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Heritage;

public class Healer extends SpellUser{
    public Healer(ClassNames classGiven, int hp, Heritage givenHeritage) {
        super(classGiven, hp, givenHeritage);
    }
}
