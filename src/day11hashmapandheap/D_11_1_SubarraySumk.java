package day11hashmapandheap;

import java.util.*;
import java.io.*;

public class D_11_1_SubarraySumk {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.

	static int subArraySum(int A[], int n, int S) {

		// write your code here
		int sum = 0;
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);

		for (int val : A) {
			sum += val;
			ans += map.getOrDefault(sum - S, 0);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return ans;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = scn.nextInt();
		int[] arr = new int[n];
		for (int z = 0; z < n; z++) {
			arr[z] = scn.nextInt();
		}
		System.out.println(subArraySum(arr, n, sum));
	}

}
