package com.codebase.Hero;

public enum ClassNames {
    ARCHER("Archer"),
    BARBARIAN("Barbarian"),
    CLERIC("Cleric"),
    FIGHTER("Fighter"),
    WARLOCK("Warlock"),
    WIZARD("Wizard");
    private String className;
    ClassNames(String className){
        this.className=className;
    }

    public String getClassName() {
        return className;
    }
}
