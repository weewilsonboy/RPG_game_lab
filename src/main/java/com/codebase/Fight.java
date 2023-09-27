package com.codebase;

import com.codebase.Hero.Archetypes.SpellUser;
import com.codebase.Hero.Archetypes.WeaponUser;
import com.codebase.Hero.Classes.*;
import com.codebase.Hero.Hero;
import com.codebase.Hero.Races.Dwarf;
import com.codebase.Hero.Races.Elf;
import com.codebase.Hero.Races.Heritage;
import com.codebase.Hero.Races.Human;

import java.util.Scanner;

import static com.codebase.PickDifficulty.pickDifficulty;
import static java.lang.Math.round;

public class Fight {
    public static void fight(SpellUser player, SpellUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            SpellUser.chooseYourSpell(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("You deal "+player.dealDamage()+" damage.");
            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You take " + enemy.dealDamage()+" damage.");

            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }
    public static void fight(SpellUser player, WeaponUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            SpellUser.chooseYourSpell(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("You deal "+player.dealDamage()+" damage.");

            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You take " + enemy.dealDamage()+" damage.");

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
            System.out.println("You deal "+player.dealDamage()+" damage.");

            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You take " + enemy.dealDamage()+" damage.");

            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
    }
    public static void fight(WeaponUser player, WeaponUser enemy){
        int difficulty = pickDifficulty();
        System.out.println("Enemy has "+enemy.getHp()+" health");
        while(enemy.getHp()>0){
            WeaponUser.chooseYourWeapon(player);
            enemy.takeDamage(player.dealDamage());
            System.out.println("You deal "+player.dealDamage()+" damage.");

            System.out.println("Enemy has "+enemy.getHp()+" health");
            if (enemy.getHp()<1){
                System.out.println("You Win");
                break;
            }
            player.takeDamage(round(enemy.dealDamage()/difficulty));
            System.out.println("You take " + enemy.dealDamage()+" damage.");
            System.out.println("You have "+player.getHp()+" health");
            if(player.getHp()<1){
                System.out.println("You have died");
                break;
            }
        }
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
}
