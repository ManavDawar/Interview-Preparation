package day9hashmapandheap;

import java.util.*;

public class D_9_6_APsequence {

	public static boolean checkAP(int[] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		HashSet<Integer> set = new HashSet<>();

		for (int x : arr) {
			min = Math.min(min, x);
			max = Math.max(max, x);
			set.add(x);
		}

		int n = arr.length;
		float d = (max - min) / (n - 1);

		for (int i = 0; i < n; ++i) {
			if (!set.contains((int) (min + d * i))) {
				return false;
			}
		}

		return true;
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		boolean x = checkAP(num);
		System.out.println(x);
	}

}
