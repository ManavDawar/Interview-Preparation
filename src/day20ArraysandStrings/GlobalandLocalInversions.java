package day20ArraysandStrings;

import java.util.*;

public class GlobalandLocalInversions {

	// This is a functional problem. You have to complete this function.
	// It takes as input an integer array. It should return true if the number
	// of global inversions are equal to the number of local inversions, else
	// should return false.
	 public static boolean isIdealPermutation(int[] A) {
		
         int n = A.length;
 
         for (int i = 0; i < n; i++) {
             if (Math.abs(A[i] - i) > 1)
                 return false;
         }
 
         return true;
     }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (isIdealPermutation(arr)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
