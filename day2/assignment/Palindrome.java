package week3.day2.assignment;



public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not	     
		/*
		 * Pseudo Code		
		 * a) Declare A String value as"madam"		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
           String text="madam";
           String rev="";
           char[] cary= text.toCharArray();
           
            for (int i =cary.length-1; i>=0; i--) {
            	rev=rev+text.charAt(i);
			}            
             if(text.equals(rev)) {
            	 System.out.println("The String  " +text +"  is Palindrome");
	}
             else {
            	 System.out.println("The String  :" +text +" is  not Palindrome");
             }
	}

}
