package day14hashmapandheap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EquivalentSubarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(val(arr));
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array
	// It should return an integer value.
	public static int val(int[] arr) {
		// Write your code here
		HashSet<Integer> set = new HashSet<>();

		for (int val : arr) {
			set.add(val);
		}
		int matchcount = 0;
		int right = 0;
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			while (right < arr.length && matchcount < set.size()) {
				if (map.containsKey(arr[right])) {

				} else {
					matchcount++;
				}
				map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
				right++;
			}

			if (matchcount == set.size()) {
				ans += arr.length - right + 1;
			}

			map.put(arr[i], map.get(arr[i]) - 1);
			if (map.get(arr[i]) == 0) {
				map.remove(arr[i]);
				matchcount--;
			}
		}

		return ans;
	}

}
