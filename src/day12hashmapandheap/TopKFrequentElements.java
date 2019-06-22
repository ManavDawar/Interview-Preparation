package day12hashmapandheap;

import java.util.*;

public class TopKFrequentElements {

	public static ArrayList<Integer> topKFrequent(int n, int[] nums, int k) {
		// Write your code here	  
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> map.get(n1)== map.get(n2)?n1-n2: map.get(n1) - map.get(n2));
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (int val : map.keySet()) {
			pq.add(val);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		return new ArrayList<>(pq);
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> res = topKFrequent(n, ar, k);
		Collections.sort(res);
		System.out.println(res);
	}

}
