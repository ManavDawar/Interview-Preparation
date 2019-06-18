package day9hashmapandheap;

import java.util.*;

public class D_9_11_ArrayEqual {

	public static boolean isTwoArrayEqual(long[] num1, long[] num2) {
		// write your code here
		HashMap<Long, Integer> map = new HashMap<>();
		for (long val : num1) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		for (long val : num2) {
			if (map.containsKey(val)) {
				map.put(val, map.get(val) - 1);
				if(map.get(val)==0) {
					map.remove(val);
				}
			}else {
				return false;
			}
		}
		if (map.size() == 0) {
			return true;
		} else {
			return false;
		}

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
