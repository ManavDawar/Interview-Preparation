package test;

import java.util.Scanner;

public class rain {

	public static int grain(int arr[]) {
		int result = 0;

		int left = 0, right = 0;

		int lo = 0, hi = arr.length - 1;

		while (lo <= hi) {
			if (arr[lo] < arr[hi]) {
				if (arr[lo] > left)
					left = arr[lo];
				else
					result += left - arr[lo];
				lo++;
			} else {
				if (arr[hi] > right)
					right = arr[hi];
				else {
					result += right - arr[hi];}
				hi--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(grain(arr));

	}
}
