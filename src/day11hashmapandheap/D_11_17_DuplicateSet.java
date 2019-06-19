package day11hashmapandheap;
import java.util.*;

public class D_11_17_DuplicateSet {
	
	 	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input the head of the linked list.
	 	 // It should return the head of the modified list.
	 	 public static boolean containsDuplicate(int[] nums) {
	 	 	  //write your code here
	 	 	  HashSet<Integer> set = new HashSet<>();
	 	 	  for(int val:nums) {
	 	 		  if(set.contains(val)) {
	 	 			  return true;
	 	 		  }else {
	 	 			  set.add(val);
	 	 		  }
	 	 	  }
	 	 	  return false;
	 	 }
	 	 // -----------------------------------------------------
	 
	 	 public static void main(String[] args) {
	 	 	 Scanner sc = new Scanner(System.in);
	 
	 	 	 int n = sc.nextInt();
	 
	 	 	 int[] arr = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 arr[i] = sc.nextInt();
	 	 	 }
	 
	 	 	 System.out.println(containsDuplicate(arr));
	 
	 	 }
	 
	 
}
