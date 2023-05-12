package week3.day2.assignment;

import java.util.Arrays;
import java.util.TreeSet;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		Integer [] arr1 = {3,2,11,4,6,7};
		Integer [] arr2 = {1,2,8,4,9,7};
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(arr1));
		TreeSet<Integer> set2 = new TreeSet<Integer>(Arrays.asList(arr2));
		set1.retainAll(set2);
		System.out.println("Intersection of Array1 & Array2 : " +set1);
              
              
	}

}


/*
 * int[] value1= {3,2,11,4,6,7};
              int[] value2= {1,2,8,4,9,7};
              for (int i = 0; i < value2.length; i++) {
				for (int j = 0; j < value2.length; j++) {
					if ((value1[i])==(value2[j])) {
						System.out.println("The first match item both arrays is :" +value1[i]);
						
					}
					
					
					
				}
				
			}*/
 