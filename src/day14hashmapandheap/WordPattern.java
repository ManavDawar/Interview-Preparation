package day14hashmapandheap;

import java.util.*;

public class WordPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String pattern = scn.nextLine();
		String str = scn.nextLine();
		System.out.println(wordPattern(pattern, str));
	}
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input 2 strings
	// It should return a boolean value

	static Boolean wordPattern(String pattern, String str) {
		// Write your code here
		String[] words = str.split(" ");
		if (pattern.length() != words.length)
			return false;
		Map<Character, String> hm = new HashMap<>();
		Set<String> sean = new HashSet<>();
		sean.contains(arg0))
		for (int i = 0; i < pattern.length(); i++) {
			if (hm.containsKey(pattern.charAt(i))) {
				if (!words[i].equals(hm.get(pattern.charAt(i))))
					return false;
			} else {
				if (!sean.add(words[i]))
					return false;
				hm.put(pattern.charAt(i), words[i]);
			}
		}
		return true;
	}

}
