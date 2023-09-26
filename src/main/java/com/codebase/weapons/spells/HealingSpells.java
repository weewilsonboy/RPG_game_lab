package com.codebase.weapons.spells;

public enum HealingSpells implements Spell{
    LAYONHANDS(-25),
    HEALINGWORD(-15),
    HEALTHPOTION(-50),
    GOODBERRY(-1);
    private int healing;

    HealingSpells(int healing) {
        this.healing = healing;
    }

    public int hpChange() {
        return healing;
    }
}
