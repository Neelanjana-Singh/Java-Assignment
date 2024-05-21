package com.techlabs.assignment;

import java.util.Random;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Name of player1 -> ");
        String player1 = scanner.nextLine();
        System.out.print("Enter Name of player2 -> ");
        String player2 = scanner.nextLine();

        int[] result1 = playGame(player1, scanner, random);
        int[] result2 = playGame(player2, scanner, random);

        System.out.println(player1 + " Total Score: " + result1[0] + " in " + result1[1] + " turns");
        System.out.println(player2 + " Total Score: " + result2[0] + " in " + result2[1] + " turns");

        if (result1[0] > result2[0]) {
            System.out.println(player1 + " is the winner.");
        } else if (result2[0] > result1[0]) {
            System.out.println(player2 + " is the winner.");
        } else {
            if (result1[1] < result2[1]) {
                System.out.println(player1 + " is the winner.");
            } else if (result2[1] < result1[1]) {
                System.out.println(player2 + " is the winner.");
            } else {
                System.out.println("The game is a draw.");
            }
        }

        scanner.close();
    }

    private static int[] playGame(String player, Scanner scanner, Random random) {
        int score = 0;
        int turns = 0;
        boolean stop = false;

        System.out.println(player + " Starts playing ->");

        while (!stop && turns < 300) {
            turns++;
            int pageNumber = random.nextInt(300) + 1;
            int turnScore = pageNumber % 7;

            System.out.println("Turn -> " + turns);
            System.out.println("Page Number Generated -> " + pageNumber);
            System.out.println("Score : " + turnScore);
            score += turnScore;
            System.out.println("Total Score : " + score);

            if (pageNumber % 7 == 0) {
                stop = true;
            } else {
                System.out.print("Continue playing -> y/n -> ");
                String continuePlaying = scanner.next();
                if (continuePlaying.equals("n")) {
                    stop = true;
                }
            }
        }

        System.out.println(player + " Total Score: " + score + " in " + turns + " turns\n");
        return new int[] {score, turns};
    }
}
