package day15ArraysAndStrings;

import java.util.*;

public class RevealDeck {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input a deck of cards
	// It should return the answer deck
	public static int[] deckRevealedIncreasing(int[] deck) {
		// write code here
		int N = deck.length;
		Deque<Integer> index = new LinkedList();
		for (int i = 0; i < N; ++i)
			index.add(i);

		int[] ans = new int[N];
		Arrays.sort(deck);
		for (int card : deck) {
			ans[index.pollFirst()] = card;
			if (!index.isEmpty())
				index.add(index.pollFirst());
		}

		return ans;
	}
	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] ans = deckRevealedIncreasing(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
