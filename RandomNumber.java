package com.techlabs.assignment;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		String PlayAgain;
		do
		{
		 random.setSeed(System.currentTimeMillis());
		 int numberGuess=random.nextInt(100)+1;
		 int guess, attempts = 0;
	     boolean guessedCorrectly = false;
         while(attempts<5)
         {
        	 System.out.println("Random number generated:"+numberGuess);
        	 System.out.println("Guess a number?");
        	 guess=scanner.nextInt();
        	 attempts++;
        	 if (guess < numberGuess) 
        	 {
                 System.out.println("Sorry. Too Low.");
             } 
        	 else if (guess > numberGuess) 
        	 {
                 System.out.println("Sorry. Too High.");
             }
             else
             {
                 guessedCorrectly = true;
                 break;
             }
         }
        	 if(guessedCorrectly)
        	 {
        		 System.out.println("You won:In attempts: " + attempts );
        	 }
        	 else
        	 {
        		 System.out.println("You Loose. The number was: " + numberGuess);
        	 }
        	 System.out.print("Do you want to play the game again:yes/no->");
        	 scanner.nextLine();
        	 PlayAgain=scanner.nextLine();
		}while(PlayAgain.equals("yes"));
		
		System.out.println("Thanks for playing!");
        scanner.close();
        }
}
