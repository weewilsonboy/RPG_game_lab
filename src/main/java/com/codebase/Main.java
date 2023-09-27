package com.codebase;

import com.codebase.Hero.Archetypes.MageBoss;
import com.codebase.Hero.Archetypes.SpellUser;
import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.Classes.*;
import com.codebase.Hero.Hero;
import com.codebase.Hero.Races.Dwarf;
import com.codebase.Hero.Races.Elf;
import com.codebase.Hero.Races.Heritage;
import com.codebase.Hero.Races.Human;
import com.codebase.Fight.*;

import java.util.Scanner;

import static com.codebase.Fight.fight;
import static com.codebase.HeroBuilder.heroBuilder;
import static java.lang.Math.round;

public class Main {
        public static void healPlayer(Hero player){
            while(player.getHp()< player.getMaxHp()){
                Cleric clericBot = new Cleric(new Elf());
                clericBot.setChosenHeal(2);
                clericBot.castHeal(player);
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
        Hero playerHero = heroBuilder();
        System.out.println(playerHero.getHeritage());
        System.out.println(playerHero.getClassName());
//        fight(jim,enemy1);
        fight(playerHero,enemy1);
        healPlayer(playerHero);
        Warlock enemy3 = new Warlock(new Dwarf());
        fight(playerHero,enemy3);
        healPlayer(playerHero);
        System.out.println("Now for the boss-fight");
        System.out.println("You are facing an Elf Wizard");
        System.out.println("DPR: 95");
        System.out.println("HP: 200");
        MageBoss boss = new MageBoss();
        fight(playerHero,boss);



        //run a fight between enemy1 and jim
        //jim should choose weapon then attack, enemy1 just attacks



    }
}