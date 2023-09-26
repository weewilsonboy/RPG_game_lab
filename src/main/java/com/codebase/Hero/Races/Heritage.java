package com.codebase.Hero.Races;

public abstract class Heritage {
    private int maxHpIncrease;
    private int damageBuff;
    private int spellBuff;
    private String heritageName;

    public Heritage(int maxHpIncrease, int damageBuff, int spellBuff, String heritageName) {
        this.maxHpIncrease = maxHpIncrease;
        this.damageBuff = damageBuff;
        this.spellBuff = spellBuff;
        this.heritageName=heritageName;
    }

    public String getHeritageName() {
        return heritageName;
    }

    public int getMaxHpIncrease() {
        return maxHpIncrease;
    }

    public int getDamageBuff() {
        return damageBuff;
    }

    public int getSpellBuff() {
        return spellBuff;
    }
}
