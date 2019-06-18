package day9hashmapandheap;

import java.util.*;

public class D_9_5_IsIsogram {

	public static boolean isIsogram(String data) {
		// Write your code here
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;

	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(isIsogram(str));

	}

}
