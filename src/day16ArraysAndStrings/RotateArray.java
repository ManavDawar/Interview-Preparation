package day16ArraysAndStrings;

import java.util.Scanner;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		// we do it by reversing the array
		if (k < 0) {
			k = k + nums.length;
		}
		if (k > nums.length) {
			k %= nums.length;
		}

		reverse(nums, 0, nums.length - 1 - k);
		reverse(nums, nums.length - k,nums.length-1);
		reverse(nums, 0, nums.length - 1);


	}

	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		rotate(ar, k);
		for (int v : ar)
			System.out.print(v + " ");
	}

}
