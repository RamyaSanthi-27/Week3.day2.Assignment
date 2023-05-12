package week3.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare String Input
		 String test = "changeme";
		// convert the string to Char array
		 char[] narray = test.toCharArray();
		//traverse through each character
		 for (int i = 0; i < narray.length; i++) {
			//find odd index
			if (i%2!=0) {
				//change odd char to UpperCase
				char charAt = test.charAt(i);
				
				System.out.print(Character.toUpperCase(charAt));
			}	
			//if not odd don't change
			else {
				System.out.print(narray[i]);
			}
		}
	}

}
