package com.techlabs.assignment;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");
        System.out.println("Left or right?");
        String str = scanner.nextLine();

        if (str.equals("Left")) {
            System.out.println("Swim or wait?");
            str = scanner.nextLine();

            if (str.equals("wait")) {
                System.out.println("Which door?");
                System.out.println("1)Red 2)Blue 3)Yellow 4)Anything else");
                str = scanner.nextLine();

                if (str.equals("Yellow"))
                {
                    System.out.println("You win!");
                } 
                else if (str.equals("Blue")) 
                {
                    System.out.println("Eaten by beasts. Game over.");
                }
                else if (str.equals("Red")) 
                {
                    System.out.println("Burned by fire. Game over.");
                } 
                else 
                {
                    System.out.println("Game over.");
                }
            } 
            else
            {
                System.out.println("Attacked by trout. Game over.");
            }
        } 
        else
        {
            System.out.println("Fall into a hole. Game over.");
        }

        scanner.close();
    	   
       }
	}


