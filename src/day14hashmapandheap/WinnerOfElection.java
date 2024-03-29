package day14hashmapandheap;

import java.util.*;

public class WinnerOfElection {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scn.next();
		}
		String[] res = func(str);
		System.out.print(res[0]);
	}
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written
	// This function takes as input an array of string
	// It should return name of winning candidate

	public static String[] func(String[] arr) {

		// Write your code here
		HashMap<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		String[] winner = new String[2];
		int vote = 0;
		for (String s : map.keySet()) {
			if (map.get(s) > vote) {
				vote = map.get(s);
				winner[0] = s;
				winner[1] = map.get(s) + "";
			} else if (map.get(s) == vote) {
				if (s.compareTo(winner[0]) < 0) {
					winner[0] = s;
				}
			}
		}

		return winner;
	}

}
