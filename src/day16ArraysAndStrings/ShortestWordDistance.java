package day16ArraysAndStrings;

import java.util.*;

public class ShortestWordDistance {

	public static int shortestWordDistance(String[] words, String word1, String word2) {
		// Write your code here
		int prev1 = -1, prev2 = -1;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				if (prev2 != -1) {
					ans = Math.min(ans, i - prev2);
				}
				prev1 = i;
			} else if (words[i].equals(word2)) {
				if (prev1 != -1) {
					ans = Math.min(ans, i - prev1);
				}
				prev2 = i;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
		}
		String word1 = sc.next(), word2 = sc.next();
		System.out.println(shortestWordDistance(words, word1, word2));
	}

}
