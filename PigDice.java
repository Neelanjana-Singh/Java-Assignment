package com.techlabs.assignment;
import java.util.Scanner;
import java.util.Random;

public class PigDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int totalScore = 0;
        int turnScore;
        int turnCount = 1;
        int total=0;

        while (totalScore < 20) {
        	random.setSeed(System.currentTimeMillis());
            System.out.println("TURN " + turnCount);
            turnScore = 0;
            boolean turnOver = false;

            while (!turnOver && totalScore < 20) {
                System.out.print("Roll or hold? (r/h): ");
                String choice = scanner.next();

                if (choice.equals("r")) {
                    int die = random.nextInt(5)+ 1;
                    System.out.println("Die: " + die);
                    if (die == 1) {
                        turnScore = 0;
                        totalScore=0;
                        total=0;
                        turnOver = true;
                        System.out.println("Turn over. No score.");
                        
                    } else {
                    	turnScore+=die;
                    	totalScore += die;
                        if( totalScore>=20)
                        {
                        	turnOver=true;
                        }
                        
                    }
                } 
                else if (choice.equals("h")) {
                    total += turnScore;
                    turnOver = true;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + total);
                }
                else
                {
                	System.out.println("Invalid choice:");
                }
                
            }

            turnCount++;
        }

        System.out.println("You finished in " + (turnCount - 1) + " turns!");
        System.out.println("Game over!");

        scanner.close();
    }
}
