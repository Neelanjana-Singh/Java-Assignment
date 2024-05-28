package com.techlabs.model;

import java.util.Scanner;
import java.util.Random;

public class PigDice1 {
    public static void main(String[] args) {
        PigDice1 pigDice = new PigDice1();
        pigDice.playGame();
    }

    private void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turnCount = 1;
        int total = 0;
        System.out.println("Let's Play PIG!");

        while (totalScore < 20) {
            totalScore = takeTurn(scanner, random, totalScore, turnCount, total);
            turnCount++;
        }

        System.out.println("You finished in " + (turnCount - 1) + " turns!");
        System.out.println("Game over!");

        scanner.close();
    }
    
    private int takeTurn(Scanner scanner, Random random, int totalScore, int turnCount, int total) {
        random.setSeed(System.currentTimeMillis());
        System.out.println("TURN " + turnCount);
        int turnScore = 0;
        boolean turnOver = false;

        while (!turnOver && totalScore < 20) {
            System.out.print("Roll or hold? (r/h): ");
            String choice = scanner.next();

            if (choice.equals("r")) {
                int die = random.nextInt(6) + 1;
                System.out.println("Die: " + die);
                if (die == 1) {
                    turnScore = 0;
                    totalScore = 0;
                    total = 0;
                    turnOver = true;
                    System.out.println("Turn over. No score.");
                    return totalScore;
                }
                turnScore += die;
                totalScore += die;
                if (totalScore >= 20) {
                    turnOver = true;
                }
            }

            if (choice.equals("h")) {
                total += totalScore;
                turnOver = true;
                System.out.println("Score for turn: " + turnScore);
                System.out.println("Total score: " + total);
                return totalScore;
            }

            if (!choice.equals("r") && !choice.equals("h")) {
                System.out.println("Invalid choice:");
            }
        }

        return totalScore;
    }
}