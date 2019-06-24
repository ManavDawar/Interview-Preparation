package day14hashmapandheap;

import java.util.*;
import java.io.*;

public class LongestSubarrayWithSumK {

	public static void print(int n, int[] arr, int k) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int sum = 0;
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum-k)) {
				ans = Math.max(ans, i - map.get(sum-k));
			} else {
				map.put(sum, i);
			}
		}
		
		System.out.println(ans);
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		print(n, num, k);
	}

}
