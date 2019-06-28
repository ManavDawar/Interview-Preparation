package day16ArraysAndStrings;

import java.util.*;

public class ShortestUnsortedContiguousSubarray {

	// This is a functional problem. You have to complete this function.
	// It takes as input an integer array. It should return
	// the length of the shortest continuous subarray.
	public static int findUnsortedSubarray(int[] a) {
		int[] b = a.clone();
		Arrays.sort(b);

		int s = b.length, e = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] != a[i]) {
				s = Math.min(s, i);
				e = Math.max(e, i);
			}
		}
		return (e - s >= 0 ? e - s + 1 : 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for length of array.
		int length = sc.nextInt();

		int[] arr = new int[length];

		// Input for elements of array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findUnsortedSubarray(arr));

	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
