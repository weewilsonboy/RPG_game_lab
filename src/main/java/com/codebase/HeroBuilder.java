package com.codebase;

import com.codebase.Hero.Classes.*;
import com.codebase.Hero.Hero;
import com.codebase.Hero.Races.Dwarf;
import com.codebase.Hero.Races.Elf;
import com.codebase.Hero.Races.Heritage;
import com.codebase.Hero.Races.Human;

import java.util.Scanner;

public class HeroBuilder {
    public static Hero heroBuilder(){
        System.out.println("Choose your Heritage");
        Heritage[] availableHeritage = new Heritage[3];
        availableHeritage[0] = new Human();
        availableHeritage[1] = new Dwarf();
        availableHeritage[2] = new Elf();
        int chosenHeritage=0;

        for (int i = 0;i<availableHeritage.length;i++) {
            Integer next = i+1;
            String heritageNumber = next.toString();
            System.out.println(heritageNumber+": "+ availableHeritage[i].getHeritageName());
        }
        while (chosenHeritage < 1 || chosenHeritage > 3){
            Scanner S = new Scanner(System.in);
            chosenHeritage = S.nextInt();
            if (chosenHeritage < 1 || chosenHeritage > 5) {
                System.out.println("Please pick between 1 and 3");
            }
        }
        chosenHeritage -=1;
        System.out.println("Choose your Class");
        Hero[] availableClasses = new Hero[6];
        availableClasses[0] = new Archer(availableHeritage[chosenHeritage]);
        availableClasses[1] = new Barbarian(availableHeritage[chosenHeritage]);
        availableClasses[2] = new Cleric(availableHeritage[chosenHeritage]);
        availableClasses[3] = new Fighter(availableHeritage[chosenHeritage]);
        availableClasses[4] = new Warlock(availableHeritage[chosenHeritage]);
        availableClasses[5] = new Wizard(availableHeritage[chosenHeritage]);
        int chosenClass=0;
        for (int i = 0;i<availableClasses.length;i++) {
            Integer next = i+1;
            String classNumber = next.toString();
            System.out.println(classNumber+", "+ availableClasses[i].getClassName());
        }
        while (chosenClass < 1 || chosenClass > 6){
            Scanner S = new Scanner(System.in);
            chosenClass = S.nextInt();
            if (chosenClass < 1 || chosenClass > 6) {
                System.out.println("Please pick between 1 and 6");
            }
        }
        return availableClasses[chosenClass-1];

    }
}
