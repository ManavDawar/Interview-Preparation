package day14hashmapandheap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		HashMap<Character, Integer> fmap = new HashMap<>();
		licensePlate = licensePlate.toLowerCase();
		for (char c : licensePlate.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				fmap.put(c, fmap.getOrDefault(c, 0) + 1);
			}
		}
		ArrayList<String> list = new ArrayList<>();
		boolean flag = true;
		for (String s : words) {
			HashMap<Character, Integer> wmap = new HashMap<>();
			s = s.toLowerCase();
			flag = true;
			for (char c : s.toCharArray()) {
				if (c >= 'a' && c <= 'z') {
					wmap.put(c, wmap.getOrDefault(c, 0) + 1);
				}
			}

			for (char c : fmap.keySet()) {
				if (wmap.containsKey(c) && fmap.get(c) <= wmap.get(c)) {

				} else {
					flag = false;
					break;
				}
			}

			if (flag) {
				list.add(s);
			}
		}
		String res = list.get(list.size() - 1);

		for (int i = list.size() - 1; i >= 0; i--) {
			if (res.length() >= list.get(i).length()) {
				res = list.get(i);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		String licensePlate = "1s3 456";
		String[] words = { "looks", "pest", "stew", "show" };

		System.out.println(shortestCompletingWord(licensePlate, words));
	}

}
