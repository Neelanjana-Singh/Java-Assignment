package com.techlabs.array2d;

import java.util.Scanner;

public class SecondLargest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scanner.nextInt();
		int array[];
		array=new int[n];
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		if(n<=1 )
		{
			System.out.println("Enter valid size:");
		}
		else
		{
		System.out.println("Enter Array element:");
		for(int i=0;i<n;i++)
		  {
		    array[i]=scanner.nextInt();
			if(array[i]>largest)
			 {
				 secondlargest=largest;
			     largest=array[i];
              }
			 else if(array[i]>secondlargest && array[i]<largest )
				    {
					secondlargest=array[i];
				    }
			     }
		
		System.out.println("second largest number is:"+secondlargest);
		
	}
		scanner.close();
	}

	}


