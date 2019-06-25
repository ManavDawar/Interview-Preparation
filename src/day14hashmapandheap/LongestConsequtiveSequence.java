package day14hashmapandheap;

import java.io.IOException;
import java.util.*;

public class LongestConsequtiveSequence {

	public static int consecuitveSub(int n, int[] arr) {
		// Write oyur code here
		HashSet<Integer> set = new HashSet<>();
		for (int val : arr) {
			set.add(val);
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i] - 1)) {
				int j = arr[i];
				while (set.contains(j)) {
					j++;
				}

				if (ans < j - arr[i]) {
					ans = j - arr[i];
				}
			}

		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(consecuitveSub(n, num));

	}

}
