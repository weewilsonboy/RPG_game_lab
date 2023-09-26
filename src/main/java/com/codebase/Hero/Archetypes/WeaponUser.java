package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Hero;
import com.codebase.weapons.Weapons;

public class WeaponUser extends Hero {
    Weapons[] weaponsToChoose = new Weapons[3];
    Weapons chosenWeapon;

    public WeaponUser(ClassNames classGiven, int hp) {
        super(classGiven, hp);
        weaponsToChoose[0] = Weapons.SWORD;
        weaponsToChoose[1] = Weapons.CLUB;
        weaponsToChoose[2] = Weapons.BOW;
        chosenWeapon = weaponsToChoose[0];
    }

    public Weapons[] getWeaponsToChoose() {
        return weaponsToChoose;
    }

    public Weapons getChosenWeapon() {
        return chosenWeapon;
    }

    public void setChosenWeapon(int choice) {
        this.chosenWeapon = weaponsToChoose[choice];
    }
}
