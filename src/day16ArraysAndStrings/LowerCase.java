package day16ArraysAndStrings;

import java.util.*;

public class LowerCase {

	public static String toLowerCase(String str) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sb.append((char) (str.charAt(i) + ('a' - 'A')));
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(toLowerCase(sc.next()));
	}

}
