package com.techlabs.assignment;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter withdrawal amount:");
       int withdrawalAmount=scanner.nextInt();
       if(withdrawalAmount % 100!=0)
       {
    	   System.out.println("Amount should be in multiple of 100");
       }
       else if(withdrawalAmount>50000)
       {
    	   System.out.println("Amount exceeds withdrawal limit of 50000");
       }
       else
       {
    	   int amount1=withdrawalAmount/2000;
    	   withdrawalAmount%=2000;
    	   if(amount1>0)
    	    System.out.println("Two Thousand:"+amount1);
    	   
    	   int amount2=withdrawalAmount/500;
    	   withdrawalAmount%=500;
    	   if(amount2>0)
    	     System.out.println("Five Hundred:"+amount2);
    	   
    	  int amount3=withdrawalAmount/200;
    	  withdrawalAmount%=200;
    	   if(amount3>0)
    	     System.out.println("Two Hundred:"+amount3);
    	   
    	   int amount4=withdrawalAmount/100;
    	   withdrawalAmount%=100;
    	   if(amount4>0)
    	     System.out.println("One Hundred:"+amount4);
       }
       scanner.close();
       
	}

}
