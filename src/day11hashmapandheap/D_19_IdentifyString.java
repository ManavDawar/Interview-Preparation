package day11hashmapandheap;

import java.util.*;

public class D_19_IdentifyString {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static class Pair {
		int freq;
		char ch;

		public Pair(int freq, char ch) {
			this.freq = freq;
			this.ch = ch;
		}
	}

	public static String reorganizeString(String S) {
		// write code here
		int[] table = new int[26];

		for (char s : S.toCharArray()) {
			table[s - 'a']++;
		}
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.freq == b.freq ? a.ch - b.ch : b.freq - a.freq);

		for (int i = 0; i < 26; ++i) {
			if (table[i] > 0) {
				if (table[i] > (S.length() + 1) / 2)
					return "";
				pq.add(new Pair(table[i], (char) ('a' + i)));
			}
		}

		StringBuilder ans = new StringBuilder("");

		while (pq.size() >= 2) {
			Pair p1 = pq.poll();
			Pair p2 = pq.poll();

			ans.append(p1.ch);
			ans.append(p2.ch);

			if (--p1.freq > 0) {
				pq.add(p1);
			}
			if (--p2.freq > 0) {
				pq.add(p2);
			}
		}

		if (pq.size() > 0)
			ans.append(pq.poll().ch);
		return ans.toString();
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(reorganizeString(s));

	}

}
