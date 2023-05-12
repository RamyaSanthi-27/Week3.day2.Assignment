package week3.day2.assignment;

//import java.util.LinkedHashSet;
import java.util.TreeSet;


public class PrintDuplicatesInArray {
	public static void main(String[] args) {
	
        int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};		

          TreeSet<Integer> set = new TreeSet<Integer>();
          //LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
          for(Integer num : arr) {
	
	           if (!set.add(num)) {
		             System.out.print(num+" ");
	                 //System.out.println(set.clone());
	                 }	
                }
	     }

}
