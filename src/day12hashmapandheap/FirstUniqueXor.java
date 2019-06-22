package day12hashmapandheap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstUniqueXor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scn.nextInt();
			}
			solve(num, k);
		
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array and n length of array.
	// It should return a boolean value.
	public static void solve(int[] arr, int k) {
		// Write your code here
		int xr =0;
		for (int val : arr) {
			xr = xr ^ val;
		}
		System.out.println(xr);

	}
}
