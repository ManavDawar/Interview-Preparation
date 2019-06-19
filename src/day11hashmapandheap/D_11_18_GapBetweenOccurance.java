package day11hashmapandheap;

import java.util.*;
import java.io.*;

public class D_11_18_GapBetweenOccurance {
	public static void findDifference(int[] arr) {
		// Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int val:arr) {
			map.put(val, map.getOrDefault(val, 0)+1);
			max=Math.max(max, map.get(val));
			min=Math.min(min, map.get(val));
		}
		System.out.println(max-min);
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		findDifference(num);
	}

}
