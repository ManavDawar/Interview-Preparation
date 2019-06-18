package day9hashmapandheap;

import java.util.*;

public class D_9_11_ArrayEqual {

	public static boolean isTwoArrayEqual(long[] num1, long[] num2) {
		// write your code here
		HashMap<Long, Integer> hmap = new HashMap<>();
	 	 for (long val : num1) {
	 	 	 hmap.put(val, hmap.getOrDefault(val, 0) + 1);
	 	 }

	 	 for (Long val : num2) {
	 	 	 if (hmap.containsKey(val) == false) {
	 	 	 	 return false;
	 	 	 } else {
	 	 	 	 if (hmap.get(val) == 1) {
	 	 	 	 	 hmap.remove(val);
	 	 	 	 } else {
	 	 	 	 	 hmap.put(val, hmap.get(val) - 1);
	 	 	 	 }
	 	 	 }
	 	 }

	 	 return true;
	}

	// Don't make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] num = new long[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextLong();
		}
		int m = n;
		long[] arr = new long[m];
		for (int i = 0; i < m; i++) {
			arr[i] = scn.nextLong();
		}
		boolean x = isTwoArrayEqual(num, arr);
		System.out.println(x);
	}

}
