package com.codebase.weapons.spells;

public enum OffensiveSpells implements ISpell {
    FIREBALL(25,"Fire",2),
    ICEBLAST(15,"Ice",4),
    BLADESTORM(20,"Slash",3),
    SMITE(25,"Holy",5),
    ELDRITCHBLAST(20,"Force",2);
    private int damage;
    private String damageType;
    private int multiplier;

    OffensiveSpells(int damage, String damageType, int multiplier) {
        this.damage = damage;
        this.damageType = damageType;
        this.multiplier = multiplier;
    }
    public int castSpellOnMonster(String weakness){
        if(weakness.equals(this.damageType)){
            return hpChange()*multiplier;
        }
        return hpChange();
    }
    public int hpChange() {

        return damage;
    }
}
