package day15ArraysAndStrings;

import java.util.Scanner;

public class MaxChunks {
	public static int maxchunks(int[] arr) {
		int[] minimum=new int[arr.length];
		int[] maximum=new int[arr.length];
 		maximum[0]=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			maximum[i]=Math.max(arr[i-1],maximum[i-1]);
		}

		minimum[arr.length-1]=arr[arr.length-1];
		int count=0;
		if(minimum[arr.length-1]>=maximum[arr.length-1]) {
			count++;
		}
		for(int i=arr.length-2;i>=0;i--) {
			minimum[i]=Math.min(arr[i], minimum[i+1]);
			if(minimum[i]>=maximum[i]) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,1,2,4,9,7,10,11,14,12};
		System.out.println(maxchunks(arr));
	}
}
