package day16ArraysAndStrings;

import java.util.*;
import java.util.Scanner;

public class RemoveComments {
	public static ArrayList<String> removeComments(String[] source) {
		boolean state = false;
		StringBuilder newline = new StringBuilder();
		ArrayList<String> ans = new ArrayList<String>();
		for (String line : source) {
			int i = 0;
			char[] chars = line.toCharArray();
			if (!state) {
				newline = new StringBuilder();
			}
			while (i < line.length()) {
				if (!state && i + 1 < line.length() && chars[i] == '/' && chars[i + 1] == '*') {
					state = true;
					i++;
				} else if (state && i + 1 < line.length() && chars[i] == '*' && chars[i + 1] == '/') {
					state = false;
					i++;
				} else if (!state && i + 1 < line.length() && chars[i] == '/' && chars[i + 1] == '/') {
					break;
				} else if (!state) {
					newline.append(chars[i]);
				}
				i++;
			}
			if (!state && newline.length() > 0) {
				ans.add(new String(newline));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] source = new String[n];
		for (int i = 0; i < source.length; i++) {
			source[i] = scn.next();
		}

		System.out.println(removeComments(source));
	}

}
