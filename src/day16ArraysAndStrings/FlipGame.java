package day16ArraysAndStrings;

import java.util.*;

public class FlipGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		List<String> res = generatePossibleNextMoves(s);
		System.out.print(res);
	}

	public static List<String> generatePossibleNextMoves(String s) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.substring(i, i + 2).equals("++"))
				list.add(s.substring(0, i) + "--" + s.substring(i + 2));
		}
		return list;
	}

}
