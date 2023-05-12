package week3.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Build a logic to reverse the even position words
		//(output: I ma a erawtfos tester)
		/* Pseudo Code:
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d)split the words and have it in an array
		e)print the even position words in reverse order 
		using another loop (nested loop)
		f) Convert words to character array if the position 
		is even else print the word as it is(concatenate space at the end).
		*/
		String test = "I am a software tester";
			
		String[] swords = test.split(" ");			
		
          for (int i = 0; i < swords.length; i++) {
						
			if (i%2!=0) {
				String Evanwords=swords[i];
				String Reverse= "";
				for (int j =Evanwords.length()-1 ; j>=0; j--) {
					char cha= Evanwords.charAt(j);					
					Reverse=Reverse+cha;
					        }
				swords[i]=Reverse;
				
			          }
                   }
          System.out.println("I am a software tester");
          System.out.println("======================");
          String RS=String.join(" ",swords);
          System.out.println(RS);
		}	
}



