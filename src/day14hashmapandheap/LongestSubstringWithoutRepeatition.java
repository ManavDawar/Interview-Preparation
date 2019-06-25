package day14hashmapandheap;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatition {

	public static int lengthOfLongestSubstring(String s) {
		// Write your code here
		HashSet<Character> set = new HashSet<>();
		int minlen = Integer.MIN_VALUE;
		int left = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			while (set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c);
			minlen = Math.max(minlen, (i - left) + 1);
		}

		return minlen;

	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(lengthOfLongestSubstring(str));

	}

}
