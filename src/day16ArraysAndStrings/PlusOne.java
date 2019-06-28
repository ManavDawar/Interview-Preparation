package day16ArraysAndStrings;

import java.util.Scanner;

public class PlusOne {

	public static int[] plusOne(int[] arr) {
		// Write your code here
		for (int i = arr.length; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				break;
			} else {
				arr[i] = 0;
			}
		}

		if (arr[0] == 0) {
			int[] ans = new int[arr.length + 1];
			ans[0] = 0;
			return ans;
		}

		return arr;
	}

	// Don't make any changes here.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] Input = new int[n];
		for (int i = 0; i < Input.length; i++) {
			Input[i] = scn.nextInt();
		}
		int ans[] = plusOne(Input);
		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}
