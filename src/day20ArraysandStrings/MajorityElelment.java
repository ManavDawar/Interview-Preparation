package day20ArraysandStrings;

import java.util.*;

public class MajorityElelment {

	public static int majorityElement(int[] arr) {
		// Write your code here
		
		int count=1;
		int majority=arr[0];
		//For Potential Majority Element
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==majority) {
				count++;
			}else {
				if(count>1) {
					count--;
				}else {
					majority=arr[i];
				}
			}
		}
		
		//For Confirmation
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==majority) {
				count++;
			}
		}
		
		if(count>=(arr.length/2)+1) {
			return majority;
		}else 
			return -1;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majorityElement(arr));
	}

}
