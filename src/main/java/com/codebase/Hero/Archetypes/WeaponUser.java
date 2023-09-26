package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Hero;
import com.codebase.Hero.IConsoleFighter;
import com.codebase.Hero.Races.Heritage;
import com.codebase.weapons.IAttack;
import com.codebase.weapons.Weapons;

import java.util.Scanner;

public class WeaponUser extends Hero implements IAttack, IConsoleFighter {
    private Weapons[] weaponsToChoose = new Weapons[3];
    private Weapons chosenWeapon;
    private int damageBonus;

    public WeaponUser(ClassNames classGiven, int hp, Heritage heritageGiven) {
        super(classGiven, hp, heritageGiven);
        weaponsToChoose[0] = Weapons.SWORD;
        weaponsToChoose[1] = Weapons.CLUB;
        weaponsToChoose[2] = Weapons.BOW;
        chosenWeapon = weaponsToChoose[0];
        this.damageBonus = heritageGiven.getDamageBuff();
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

    @Override
    public int attack() {
        return chosenWeapon.getDamage(this.getClassName())+damageBonus;
    }

    @Override
    public int dealDamage() {
        return attack();
    }

    @Override
    public void takeDamage(int damageTake) {
        this.setHp(-damageTake);
    }
    public static void chooseYourWeapon(WeaponUser weaponUser) {
        System.out.println("Choose your Weapon");
        Scanner S = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.println("1" + weaponUser.getWeaponsToChoose()[0].toString());
            System.out.println("2" + weaponUser.getWeaponsToChoose()[1].toString());
            System.out.println("3" + weaponUser.getWeaponsToChoose()[2].toString());
            choice = S.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Please pick between 1 and 3");
            } else {
                weaponUser.setChosenWeapon(choice - 1);
                System.out.println(weaponUser.getChosenWeapon());
            }
        }
    }
}
