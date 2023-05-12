package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		//String replace="";
		
		String[] array =text.split(" ");		
		Set<String> output=new LinkedHashSet<String>();
				
		for (int i = 0; i<array.length; i++) {
			
			/*for (int j = 0; j < array.length; j++) {				
				if(array[i]==array[j]) {					
					count++;				   
				}
				output.add(array[j])
				}
		}	*/ 
			
			     count++;
			     output.add(array[i]);			
		         }		
		
                 if (count>1) {				
        	
				   System.out.print(output); 
 	   }
		
    }
}	                   //or
	
	/*String text = "We learn java basics as part of java sessions in java week1";
		//int count=0;
		String replace="";
		
		String[] array =text.split(" ");		
		
		for (int i = 0; i<array.length; i++) {								
					count++;					
	    }			
            if (count>1) {
				
				replace = text.replace("java", "");
				System.out.print(replace); 
           
	   }
		
    }*/


	
