package week3.day2.assignment;


import java.util.TreeSet;



public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
				TreeSet<Integer> set=new TreeSet<Integer>();
				
				for (Integer num : data) {
					
					set.add(num);
					//System.out.println(set.add(num));
				}
				
				set.remove(set.last());
				System.out.println("The Second Largest Number is :" +set.last());
				
				
				
               /* int len = data.length;
				Arrays.sort(data);
				System.out.println(Arrays.toString(data));
				
				System.out.println("The 2nd element from the last is  :" +data[len-2]);
					
				
			
				/* Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
	}

}
