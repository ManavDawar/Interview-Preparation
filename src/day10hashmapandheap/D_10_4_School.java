package day10hashmapandheap;

import java.util.*;

public class D_10_4_School {
	public static void minTransfer(int[] heights) {
		// Write your code here
		int[] dp = new int[heights.length + 1];
		int max = 0;

		for (int val : heights) {
			dp[val] = dp[val - 1] + 1;
			max = Math.max(max, dp[val]);
		}

		System.out.println(heights.length - max);
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] heights = new int[n];
		for (int i = 0; i < n; i++) {
			heights[i] = scn.nextInt();
		}
		minTransfer(heights);
	}

}
