package com.codebase;

import java.util.Scanner;

public class PickDifficulty {
    public static int pickDifficulty(){
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
}
