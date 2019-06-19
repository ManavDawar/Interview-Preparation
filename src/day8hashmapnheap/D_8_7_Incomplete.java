package day8hashmapnheap;

import java.util.*;

public class D_8_7_Incomplete {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static int incomplete(int[] arr) {
		HashSet<Integer> freqmap = new HashSet<>();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			freqmap.add(arr[i]);
		}
		int ans = max - min - 1 - freqmap.size() + 2;
		if (ans < 0)
			return 0;
		else
			return ans;
	}
	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(incomplete(arr));
	}

}
