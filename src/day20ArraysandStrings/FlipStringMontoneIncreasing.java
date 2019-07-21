package day20ArraysandStrings;

import java.util.*;

public class FlipStringMontoneIncreasing {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.print(minFlipsMonoIncr(s));
	}
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input a string
	// It should return required output.

	public static int minFlipsMonoIncr(String S) {
		// Write your code here
		int a = 0;// for counting 0000
		int b = 0;// for counting 00011s
		int c = 0;// for counting 1111s

		if (S.length() < 2) {
			return 0;
		} else {
			String s = S.substring(0, 2);
			if (s.equals("00")) {
				a = 0;
				b = 1;
				c = 2;
			} else if (s.equals("01")) {
				a = 1;
				b = 0;
				c = 1;
			} else if (s.equals("10")) {
				a = 1;
				b = 2;
				c = 1;
			} else if (s.equals("11")) {
				a = 2;
				b = 1;
				c = 0;
			}

		}
		int i = 2;
		while (i < S.length()) {

			if(S.charAt(i)=='0') {
				b=Math.min(a, b)+1;
				c=c+1;
			}else {
				b=Math.min(a, b);
				a=a+1;
			}
			i++;
		}
		return Math.min(a, Math.min(b, c));
	}

}
