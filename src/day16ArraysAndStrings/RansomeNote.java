package day16ArraysAndStrings;

import java.util.*;

public class RansomeNote {

	public static boolean canConstruct(String ransom, String magzine) {
		// Write your code here
		if (ransom.length() > magzine.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : magzine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : ransom.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					map.remove(c);
				}
			} else {
				return false;
			}
		}
		return true;
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		System.out.print(canConstruct(s, t));

	}

}
