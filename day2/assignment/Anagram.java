package week3.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		
		String text2 = "potss";
		int len = text1.length();
		int length = text2.length();
		if (len==length) {
			System.out.println("Length of the text1 : "+len);
			System.out.println("Length of the text2 : "+length);
		}
		char[] chary = text1.toCharArray();
		char[] charArray = text2.toCharArray();
		
		Arrays.sort(chary);
		System.out.println(chary);
		
		Arrays.sort(charArray);		
		System.out.println(charArray);
		if (Arrays.equals(chary, charArray)) {
			System.out.println("Both the Arrays has same value");
			
		}
		else {
			System.out.println("Both the Arrays has not same value");
		}
	}

}
