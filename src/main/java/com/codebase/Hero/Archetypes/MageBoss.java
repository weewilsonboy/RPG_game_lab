package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Races.Elf;
import com.codebase.weapons.spells.OffensiveSpells;

public class MageBoss extends SpellUser {
    public MageBoss() {
        super(ClassNames.WIZARD, 220, new Elf());
        this.spellArrayList.add(OffensiveSpells.FIREBALL);
        setChosenSpell(0);
    }
    @Override
    public int castSpell(){
        return (chosenSpell.hpChange()*2)+heritageBonus;
    }


}
