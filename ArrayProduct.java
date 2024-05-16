package com.techlabs.array;

import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=scanner.nextInt();
		int array[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		int prod[]=new int[n];
		int product=1;
		for(int i=0;i<n;i++)
		{
			product=product*array[i];
		}
		for(int j=0;j<n;j++)
		{
			prod[j]=product/array[j];
		}
		 System.out.print("Product array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(prod[i] + " ");
	        }
	        System.out.println();
	        scanner.close();

		

	}

}
