package day14hashmapandheap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestSubarrayWithSum0 {

	static int maxLen(int arr[], int n) {
		// Write your code here
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, -1);
		int ans=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(map.containsKey(sum)) {
				ans=Math.max(ans, i-map.get(sum));
			}else {
				map.put(sum, i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxLen(arr, n));
	}

}
