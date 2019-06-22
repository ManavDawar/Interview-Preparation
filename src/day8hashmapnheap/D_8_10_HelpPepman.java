package day8hashmapnheap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_8_10_HelpPepman {

	public static void main(String[] args) {
		// write your code here
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int[] alpha = new int[26];
		for (char c : s.toCharArray()) {
			alpha[c - 'a']++;
		}
		int x = 0;
		int y = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0 && alpha[i] % 2 == 0 && (i + 1) % 2 == 0) {
				x++;
			} else if (alpha[i] % 2 == 1 && (i + 1) % 2 == 1) {
				y++;
			}
		}
		int val = x + y;

		if (val % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

}
