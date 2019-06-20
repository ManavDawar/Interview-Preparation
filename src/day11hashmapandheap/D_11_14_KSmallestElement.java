package day11hashmapandheap;

import java.util.*;

public class D_11_14_KSmallestElement {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		print_k_smallest_elements_in_their_original_order(n, k, arr);
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input length of array, value of k and array of length
	// n
	// It should print k smallest elements in their original order
	public static void print_k_smallest_elements_in_their_original_order(int n, int k, int[] arr) {
		// Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			if (pq.size() < k)
				pq.add(arr[i]);
			else {
				if (arr[i] < pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}

		for (int val : arr) {
			if (pq.size() > 0) {
				if (val < pq.peek()) {
					System.out.print(val + " ");
				} else if (val == pq.peek()) {
					System.out.print(pq.poll() + " ");
				}
			}
		}
	}

}
