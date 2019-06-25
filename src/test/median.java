package test;

import java.util.*;

public class median {

	public static class med {
		PriorityQueue<Integer> min;
		PriorityQueue<Integer> max;

		/** initialize your data structure here. */
		public med() {
			min = new PriorityQueue<>();
			max = new PriorityQueue<>(1000, Collections.reverseOrder());
		}

		public void addNum(int num) { // This part seems verbose but it calls offer() and poll() as less as possible
			if (max.isEmpty())
				max.offer(num);
			else if (num <= max.peek()) {
				max.offer(num);
				if (max.size() > min.size() + 1) {
					min.offer(max.poll());
				}
			} else {
				min.offer(num);
				if (min.size() > max.size()) {
					max.offer(min.poll());
				}
			}
		}

		public double findMedian() {
			return (max.size() == min.size()) ? (max.peek() + min.peek()) / 2.0 : max.peek();
		}
	}

	public static void main(String[] args) {
		med m=new med();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i < n; i++) {
			m.addNum(scn.nextInt());
			System.out.println(m.findMedian());
		}

	}
}
