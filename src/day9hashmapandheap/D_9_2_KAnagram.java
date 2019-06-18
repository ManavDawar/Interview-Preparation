package day9hashmapandheap;

import java.util.*;

public class D_9_2_KAnagram {

	public static boolean areKAnagrams(String str1, String str2, int k) {
		// Write your code here
		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}

		int count1 = 0;
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (hmap.containsKey(ch)) {
				int x = hmap.get(ch);
				if (x == 1) {
					hmap.remove(ch);
				} else {
					hmap.put(ch, x - 1);
				}
			} else {
				count1++;
			}
		}

		if (count1 <= k) {
			return true;
		} else {
			return false;
		}
	}

	// Don't make changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int k = s.nextInt();
		System.out.println(areKAnagrams(str1, str2, k));

	}

}
