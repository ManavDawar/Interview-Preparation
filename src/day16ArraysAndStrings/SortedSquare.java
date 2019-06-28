package day16ArraysAndStrings;

import java.util.*;

public class SortedSquare {

	// This is a functional problem. You have to complete this function.
	// It takes as input an integer array. It should return
	// the required array.
	public static int[] sortedSquares(int[] A) {
		int n = A.length;

		int j = 0;

		while (j < n && A[j] < 0)
			j++;

		int i = j - 1;
		int t = 0;

		int ans[] = new int[n];

		while (i >= 0 && j < n) {
			if (A[i] * A[i] < A[j] * A[j]) {
				ans[t++] = A[i] * A[i];
				i--;
			} else {
				ans[t++] = A[j] * A[j];
				j++;
			}
		}

		while (i >= 0) {
			ans[t++] = A[i] * A[i];
			i--;
		}

		while (j < n) {
			ans[t++] = A[j] * A[j];
			j++;
		}

		return ans;
	}

	public static int[] sortedSquares1(int[] A) {
		int n = A.length;
		int ans[] = new int[n];

		for (int i = 0; i < n; i++) {
			ans[i] = A[i] * A[i];
		}
		Arrays.sort(ans);
		return ans;

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

		int[] result = sortedSquares(arr);
		display(result);

	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
