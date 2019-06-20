package day8hashmapnheap;

import java.util.*;

public class D_8_4_Anagram {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static ArrayList<Integer> findAnagrams(String s, String p) {

		// write your code here]
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		int count = 0, size = p.length(), start = 0, end = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < size; i++) {
			char c = s.charAt(i);
			if (map2.containsKey(c))
				map2.put(c, map2.get(c) + 1);
			else
				map2.put(c, 1);
			if (map.containsKey(c) && map2.get(c) <= map.get(c))
				count++;
			end++;
		}
		if (count == size)
			ans.add(start);
		end--;

		while (end != s.length() - 1) {
			char c = s.charAt(start);
			if (map.containsKey(c) && map2.get(c) <= map.get(c))
				count--;

			if (map2.containsKey(c))
				map2.put(c, map2.get(c) - 1);
			else
				map2.remove(c);

			start++;

			end++;

			char c2 = s.charAt(end);
			if (map2.containsKey(c2))
				map2.put(c2, map2.get(c2) + 1);
			else
				map2.put(c2, 1);

			if (map.containsKey(c2) && map2.get(c2) <= map.get(c2))
				count++;

			if (count == size)
				ans.add(start);

		}
		return ans;

	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String p = scn.next();
		System.out.println(findAnagrams(s, p));
	}

}
