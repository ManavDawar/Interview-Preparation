package day16ArraysAndStrings;

public class ThreeSum {
	import java.util.*;
	 
	 class Main{
	     public static void main(String[] args){
	         Scanner scn=new Scanner(System.in);
	         int n=scn.nextInt();
	         int[] nums=new int[n];
	         for(int i=0;i<n;i++){
	             nums[i]=scn.nextInt();
	         }
	         System.out.print(threeSum(nums));
	     }
	 
	     // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input an array
	 	 // It should return an required output
	 	 public static List<List<Integer>> threeSum(int[] nums) {
	 	      List<List<Integer>> res = new ArrayList<>();
	    Arrays.sort(nums);
	    for (int i = 0; i + 2 < nums.length; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
	            continue;
	        }
	        int j = i + 1, k = nums.length - 1;  
	        int target = -nums[i];
	        while (j < k) {
	            if (nums[j] + nums[k] == target) {
	                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                j++;
	                k--;
	                while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
	                while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
	            } else if (nums[j] + nums[k] > target) {
	                k--;
	            } else {
	                j++;
	            }
	        }
	    }
	    return res;
	 	 }
	 }
}
