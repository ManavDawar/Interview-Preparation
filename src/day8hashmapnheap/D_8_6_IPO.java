package day8hashmapnheap;

import java.util.*;

public class D_8_6_IPO {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {

		PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0])); // variation
																					// of
																					// compareto

		PriorityQueue<Integer[]> pq2 = new PriorityQueue<>((a, b) -> (b[1] - a[1])); // variation
																						// of
																						// compareto

		for (int i = 0; i < Profits.length; i++) {
			pq.add(new Integer[] { Capital[i], Profits[i] }); // [0] is capital
																// [1] isprofit
		}

		for (int i = 0; i < k; i++) {
			while (pq.size() > 0 && pq.peek()[0] <= W) { // adding do-able
															// projects to
															// priority queue
				pq2.add(pq.poll());
			}

			if (pq2.size() == 0) { // no projects left
				break;
			}

			W += pq2.poll()[1];

		}

		return W;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int w = sc.nextInt();

		int n = sc.nextInt();
		int[] profits = new int[n];
		int[] capital = new int[n];

		for (int i = 0; i < n; i++) {
			profits[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			capital[i] = sc.nextInt();
		}

		System.out.println(findMaximizedCapital(k, w, profits, capital));

	}

}
