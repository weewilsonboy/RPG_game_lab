package com.codebase;

import com.codebase.Hero.Archetypes.SpellUser;
import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.Classes.*;
import com.codebase.Hero.Hero;
import com.codebase.Hero.IConsoleFighter;
import com.codebase.Hero.Races.Dwarf;
import com.codebase.Hero.Races.Elf;
import com.codebase.Hero.Races.Heritage;
import com.codebase.Hero.Races.Human;
import com.codebase.weapons.IAttack;

import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    static int pickDifficulty(){
        System.out.println("Choose your Difficulty, 5 is easy, 4 harder etc.");
        int choice=0;
        while (choice < 1 || choice > 5){
            Scanner S = new Scanner(System.in);
            choice = S.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Please pick between 1 and 5");
            }
        }
        return choice;

    }
    static void fight(SpellUser player, SpellUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            SpellUser.chooseYourSpell(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }
    static void fight(SpellUser player, WeaponUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            SpellUser.chooseYourSpell(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }
    static void fight(WeaponUser player, SpellUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            WeaponUser.chooseYourWeapon(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }
    static void fight(WeaponUser player, WeaponUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            WeaponUser.chooseYourWeapon(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }

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
    public static void fight(Hero player, Hero enemy){
        if(player.getClassName().equals("Cleric") || player.getClassName().equals("Warlock")||player.getClassName().equals("Wizard")){
            SpellUser newPlayer = (SpellUser)player;
            if(enemy.getClassName().equals("Cleric") || enemy.getClassName().equals("Warlock")||enemy.getClassName().equals("Wizard")){
                SpellUser newEnemy = (SpellUser)enemy;
                fight(newPlayer,newEnemy);
            } else{
                WeaponUser newEnemy = (WeaponUser)enemy;
                fight(newPlayer,newEnemy);
            }
        } else{
            WeaponUser newPlayer = (WeaponUser)player;
            if(enemy.getClassName().equals("Cleric") || enemy.getClassName().equals("Warlock")||enemy.getClassName().equals("Wizard")){
                SpellUser newEnemy = (SpellUser)enemy;
                fight(newPlayer,newEnemy);
            } else{
                WeaponUser newEnemy = (WeaponUser)enemy;
                fight(newPlayer,newEnemy);
            }
        }
    }

    public static void main(String[] args) {
        Fighter jim = new Fighter(new Dwarf());
        System.out.println(jim.getChosenWeapon());
        System.out.println(jim.attack());
        Warlock dave = new Warlock(new Human());
        System.out.println(dave.getChosenSpell());
        Barbarian enemy1 = new Barbarian(new Elf());
        enemy1.setChosenWeapon(1);
        Hero heroTest = heroBuilder();
        System.out.println(heroTest.getClassName());
//        fight(jim,enemy1);
        fight(heroTest,enemy1);




        //run a fight between enemy1 and jim
        //jim should choose weapon then attack, enemy1 just attacks



    }
}