package com.codebase.Hero.Archetypes;

import com.codebase.Hero.ClassNames;
import com.codebase.Hero.Hero;
import com.codebase.Hero.IConsoleFighter;
import com.codebase.Hero.Races.Heritage;
import com.codebase.weapons.spells.HealingSpells;
import com.codebase.weapons.spells.ISpell;

import java.util.ArrayList;
import java.util.Scanner;

public class SpellUser extends Hero implements IConsoleFighter {
    ArrayList<ISpell> spellArrayList;
    ArrayList<ISpell> healingArrayList;
    ISpell chosenSpell;
    ISpell chosenHeal;
    int heritageBonus;
    public SpellUser(ClassNames classGiven, int hp, Heritage givenHeritage) {
        super(classGiven, hp, givenHeritage);
        spellArrayList = new ArrayList<>();
        chosenSpell = HealingSpells.GOODBERRY;
        chosenHeal = HealingSpells.GOODBERRY;
        heritageBonus=givenHeritage.getSpellBuff();
        healingArrayList = new ArrayList<>();
    }
    public int castSpell(){
        return chosenSpell.hpChange()+heritageBonus;
    }

    public ArrayList<ISpell> getHealingArrayList(){
        return healingArrayList;
    }
    public void setChosenHeal(int i) {
        this.chosenHeal = healingArrayList.get(i);
    }

    public void castHeal(Hero hero){
        hero.setHp(chosenHeal.hpChange());
    }

    public ISpell getChosenSpell() {
        return chosenSpell;
    }

    public void setChosenSpell(int givenIndex) {
        this.chosenSpell = spellArrayList.get(givenIndex);
    }

    @Override
    public int dealDamage() {
        return castSpell();
    }

    @Override
    public void takeDamage(int damageTake) {
        this.setHp(-damageTake);
    }
    public static void chooseYourSpell(SpellUser spellUser) {
        System.out.println("Choose your Spell");
        Scanner S = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 || choice > spellUser.spellArrayList.size()) {
            for (int i = 0;i<spellUser.spellArrayList.size();i++) {
                Integer next = i+1;
                String spellNumber = next.toString();
                System.out.println(spellNumber+ spellUser.spellArrayList.get(i));
            }
            choice = S.nextInt();

            if (choice < 1 || choice > spellUser.spellArrayList.size()) {
                System.out.println("Please pick between 1 and "+ spellUser.spellArrayList.size());
            } else {
                spellUser.setChosenSpell(choice - 1);
                System.out.println(spellUser.getChosenSpell());
            }
        }
    }
}
