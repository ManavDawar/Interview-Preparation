package day8hashmapnheap;

import java.util.*;

public class D_8_6_IPO {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {

		PriorityQueue<Integer[]> pq = new PriorityQueue<>( // MIN HEAP
				(a, b) -> a[0] - b[0]);

		PriorityQueue<Integer[]> pq2 = new PriorityQueue<>((a, b) -> b[1] - a[1]);

		for (int i = 0; i < Profits.length; i++) {
			pq.add(new Integer[] { Capital[i], Profits[i] });
		}

		for (int i = 0; i < k; i++) {
			while (pq.size() > 0 && pq.peek()[0] <= W) {
				pq2.add(pq.poll());
			}

			if (pq2.size() == 0) {
				break;
			}
			W += pq2.poll()[1];
		}

		return W;
	}

	public static boolean canConstruct(String ransom, String magzine) {
		if (ransom.length() > magzine.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : magzine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : ransom.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
				if(map.get(c)==0) {
					map.remove(c);
				}
			} else {
				return false;
			}
		}
		return true;
	}
	// -----------------------------------------------------

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int k = sc.nextInt();
//		int w = sc.nextInt();
//
//		int n = sc.nextInt();
//		int[] profits = new int[n];
//		int[] capital = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			profits[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < n; i++) {
//			capital[i] = sc.nextInt();
//		}
//
//		System.out.println(findMaximizedCapital(k, w, profits, capital));

		System.out.println(canConstruct("aa", "ab"));
	}

}
