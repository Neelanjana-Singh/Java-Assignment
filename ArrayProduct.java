package com.techlabs.array;

import java.util.Scanner;

public class ArrayProduct{

	 public static int[] calculateProductArray(int[] array) {
	        int n = array.length;
	        int[] prod = new int[n];
	        int[] left = new int[n];
	        int[] right = new int[n];

	        left[0] = 1;
	        for (int i = 1; i < n; i++) {
	            left[i] = array[i - 1] * left[i - 1];
	        }

	        right[n - 1] = 1;
	        for (int j = n - 2; j >= 0; j--) {
	            right[j] = array[j + 1] * right[j + 1];
	        }

	        for (int i = 0; i < n; i++) {
	            prod[i] = left[i] * right[i];
	        }

	        return prod;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];
	        if (n <= 1) {
	            System.out.println("Enter valid array size");
	        } else {
	            System.out.println("Enter the elements of the array:");
	            for (int i = 0; i < n; i++) {
	                array[i] = scanner.nextInt();
	            }

	            int[] prod = calculateProductArray(array);

	            System.out.println("The product array is:");
	            for (int value : prod) {
	                System.out.print(value + " ");
	            }
	        }
	        scanner.close();
    }
}
