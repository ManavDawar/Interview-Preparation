package day18ArraysandStrings;

import java.util.*;

public class RomanToInt {

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int ret = map.get(s.charAt(s.length() - 1));
		for (int i = 0; i < s.length() - 1; i++) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
				ret -= map.get(s.charAt(i));
			else
				ret += map.get(s.charAt(i));
		}
		return ret;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String num = s.next();
		System.out.println(romanToInt(num));

	}
}
