package day14hashmapandheap;

import java.util.*;
import java.io.*;

public class LongestSubstrKUnique {

	public static void print(String str, int k) {
		// Write your code here
		if (str.length() < k) {
			System.out.println("-1");
		}
		HashMap<Character, Integer> map = new HashMap<>();
		int start = 0;
		int maxlen = 0;
		int size = 0;
		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
			size++;
			if (map.size() == k) {
				found = true;
			}
			while (map.size() > k) {
				char remove = str.charAt(start);
				if (map.get(remove) == 1) {
					map.remove(remove);
				} else {
					map.put(remove, map.get(remove) - 1);
				}
				size--;
				start++;
			}
			if (size > maxlen) {
				maxlen = size;
			}
		}
		if (found) {
			System.out.println(maxlen);
		} else {
			System.out.println("-1");
		}

	}

	// Don't make any changes here.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int k = Integer.parseInt(br.readLine());
		print(s, k);
	}

}
