package day11hashmapandheap;

import java.util.*;

public class D_11_09aMinimumWindowSubstring {

	public static String smallestWindow(String s, String t) {
		String ques = s;
		String req = t;

		int leftindex = 0;
		int rightindex = 0;

		int[] charinreq = new int[26];
		int[] charinans = new int[26];

		for (char ch : req.toCharArray()) {
			charinreq[ch - 'a']++;
		}

		int charmatched = 0;
		LinkedList<Character> ans = new LinkedList<>();
		int currlen = 0;

		LinkedList<Character> actualmin = new LinkedList<>();
		int minlen = Integer.MAX_VALUE;

		while (true) {
			char toput = ques.charAt(rightindex);

			if (charinreq[toput - 'a'] > 0) {
				if (charinans[toput - 'a'] < charinreq[toput - 'a']) {
					charmatched++;
				}
				charinans[toput - 'a']++;
			}

			ans.addLast(ques.charAt(rightindex));
			currlen++;

			if (charmatched == req.length()) {
				while (charinreq[ques.charAt(leftindex) - 'a'] == 0 // the
						// character
						// present
						// is
						// useless
						// in answer
						|| charinans[ques.charAt(leftindex) - 'a'] > charinreq[ques.charAt(leftindex) - 'a']) { // removing
					// the
					// character
					// doesn't
					// destroys
					// the
					// sequence
					if (charinans[ques.charAt(leftindex) - 'a'] > 0)
						charinans[ques.charAt(leftindex) - 'a']--;
					// if (charinans[ques.charAt(leftindex) - 'a'] == 0)
					// charmatched--;

					leftindex++;
					ans.removeFirst();
					currlen--;

				}

				if (currlen < minlen) {
					actualmin = new LinkedList<>(ans);
					minlen = currlen;
				}

			}

			rightindex++;

			if (rightindex >= ques.length()) {
				break;
			}
		}

		if (actualmin.size() == 0) {
			return "-1";
		}
		String finalans = "";
		while (actualmin.size() > 0) {
			finalans += actualmin.removeFirst();
		}

		return finalans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(smallestWindow(sc.next(), sc.next()));

	}

}
