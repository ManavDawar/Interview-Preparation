package day13hashmapandheap;

import java.util.*;

public class UncommonCharacter {

	public static void uncommon(String str1, String str2) {
		// Write your code here
		int x1 = 0;
		for (int i = 0; i < str1.length(); i++) {
			int c = (int) (str1.charAt(i) - 'a');
			x1 = x1 | (1 << c);
		}

		int x2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			int c = (int) (str2.charAt(i) - 'a');
			x2 = x2 | (1 << c);
		}

		x1 = x1 ^ x2;

		for (int i = 0; i < 26; i++) {
			if ((x1 & (1 << i)) != 0) {
				System.out.println((char)('a'+i));
			}
		}
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();

		String str2 = sc.next();

		uncommon(str1, str2);

	}

}
