package com.techlabs.string;

import java.util.Scanner;

public class Substring {

	 public static boolean isSubstring(String str1, String str2) {
	        int n = str1.length();
	        int m = str2.length();
	        int j;
            if (m > n) {
	            return false;
	        }

	        for (int i = 0; i <= n - m; i++) {
	            for (j = 0; j < m; j++) {
	                 if (str1.charAt(i + j) != str2.charAt(j))
	                 {
	                    break;
	                  }
	            }

	            // if str2 is empty then also it return true
	            if (j == m) {
	                return true;
	            }
	        }

	       
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
            System.out.println( isSubstring(str1, str2));
            scanner.close();

	}

}
