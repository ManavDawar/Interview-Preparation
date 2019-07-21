package day21ArraysandStrings;

import java.util.*;

public class SubarrayProductLessThanK {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written
	// This function takes as input an array and integer k
	// It should return the required output

	public static int numSubarrayProductLessThanK(int[] arr, int k) {
		// Write your code here
		int start = 0;
		int end = 0;
		int prod = 1;
		int count = 0;
		for(end=0;end<arr.length;end++) {
			prod = prod * arr[end];
			
			while (start < end && prod >= k) {
				prod /= arr[start++];

			}
			if (prod < k) {
				count += (end - start + 1);
			}
		}
		return count;

//	    int n = a.size();  
//	    long p = 1; 
//	    int res = 0; 
//	    for (int start = 0, end = 0; end < n; end++) { 
//	  
//	        p *= a.get(end); 
//	          
//	        // Move left bound so guarantee that 
//	        // p is again less than k. 
//	        while (start < end && p >= k)  
//	            p /= a.get(start++);      
//	          
//	        // If p is less than k, update the counter. 
//	        // Note that this is working even for  
//	        // (start == end): it means that the  
//	        // previous window cannot grow anymore  
//	        // and a single array element is the only 
//	        // addendum. 
//	        if (p < k) { 
//	            int len = end - start + 1; 
//	            res += len; 
//	        } 
//	    } 
//	  
//	    return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = scn.nextInt();
		int k = scn.nextInt();
		System.out.println(numSubarrayProductLessThanK(nums, k));
	}

}
