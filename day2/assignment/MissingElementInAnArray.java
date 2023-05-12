package week3.day2.assignment;

import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
				int[] arr = {1,2,3,4,7,6,8}; 
				int k=0;
				
				TreeSet<Integer> set = new TreeSet<Integer>();		
				
				for (Integer inte : arr) {					
					set.add(inte);
					k=k+1;
					if (k!=inte) {
						
						System.out.println("Missing number  : "+k);
						break;
					}
				}
	 }							
} 	 
		
			
	




/*	// Sort the array					

// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively
	
		// print the number
		
		// once printed break the iteration */				
				
				
				/*for (int i = 0; i < arr.length; i++) {
					
					result.add(arr[i]);	
					k=i+1;
					if (k!=arr[i]) {
						System.out.println("Missing number  : " +k);	
						break;
					}
				}
				*/	
								
				

