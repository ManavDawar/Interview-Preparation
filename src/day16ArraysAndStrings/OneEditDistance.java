package day16ArraysAndStrings;

import java.util.Scanner;

public class OneEditDistance {

	// This is a functional problem. You have to complete this function.
	// It takes as input two strings s and t.
	// It should return true if the strings are one edit distance apart,
	// else should return false.
	public static boolean isOneEditDistance(String s, String t) {

		for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) != t.charAt(i)) {

				if (s.length() == t.length()) {

					return s.substring(i + 1).equals(t.substring(i + 1));

				} else if (s.length() < t.length()) {

					return s.substring(i).equals(t.substring(i + 1));

				} else {

					return t.substring(i).equals(s.substring(i + 1));

				}
			}
		}

		return Math.abs(s.length() - t.length()) == 1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (isOneEditDistance(s, t)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
