package day11hashmapandheap;

import java.util.*;

public class D_11_01b_SubarraySum0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();

		long[] arr = new long[size];

		for (int j = 0; j < size; j++) {
			arr[j] = scn.nextLong();
		}

		zerosumarr(arr);

	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array
	// Print required output
	static void zerosumarr(long[] arr) {
		// Write your code here
		int sum = 0;
		int ans = 0;
		int target = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (long val : arr) {
			sum += val;
			ans += map.getOrDefault(sum - target, 0);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		System.out.println(ans);
	}

}
