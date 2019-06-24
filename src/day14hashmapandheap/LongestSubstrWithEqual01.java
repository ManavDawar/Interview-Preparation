package day14hashmapandheap;

import java.util.*;

public class LongestSubstrWithEqual01 {

	public static void print(char[] a) {
		// Writ your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int ans = 0;
		map.put(0, -1);
		for (int i = 0; i < a.length; i++) {
			sum += a[i] == '0' ? -1 : 1;
			if (map.containsKey(sum)) {
				ans=Math.max(ans, i-map.getOrDefault(sum, 0));
			}else {
				map.put(sum, i);
			}

		}
		System.out.println(ans);
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] ans = str.toCharArray();
		print(ans);
	}

}
