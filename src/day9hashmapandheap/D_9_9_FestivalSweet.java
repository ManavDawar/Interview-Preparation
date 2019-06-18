package day9hashmapandheap;

import java.util.*;

public class D_9_9_FestivalSweet {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static boolean sweetandfestival(int n, int[] sweets, int k) {
		// write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int val : sweets) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		int maxFreq = 0;
		for (int val : sweets) {
			if (map.get(val) > maxFreq) {
				maxFreq = map.get(val);
			}
		}

		if (maxFreq > (2 * k)) {
			return false;
		}

		return true;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		int k = scn.nextInt();

		boolean x = sweetandfestival(n, num, k);
		if (x == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
