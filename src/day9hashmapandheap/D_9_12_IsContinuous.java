package day9hashmapandheap;

import java.util.*;
import java.io.*;

public class D_9_12_IsContinuous {

	public static boolean isContiguous(int[] arr) {
		// Write your Code here
		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			max = Math.max(max, val);
			min = Math.min(min, val);
			set.add(val);
		}
		return max - min + 1 - set.size() == 0;
	}

	// Don't make changes here
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		boolean bl = isContiguous(num);
		System.out.println(bl);
	}

}
