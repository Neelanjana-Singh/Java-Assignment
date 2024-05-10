package com.techlabs.assignment;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of units consumed :");
		int number=scan.nextInt();
		int Metre=75;
		int charge,Total;
		if(number<=100)
		{
			charge=number*5;
		}
		else
		{
			if(number<=250)
			{
				charge=number*10;
			}
			else
			{
				charge=number*20;
			}
		}
		Total=charge+Metre;
		System.out.println("Total_water_bill="+Total);
	}

}
