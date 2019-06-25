package test;

import java.util.*;

public class refuel {
	public static int min(int target, int fuel, int[][] stations) {
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		int result = 0;
		int previous = 0;

		for (int[] station : stations) {
			int location = station[0];
			int capacity = station[1];
			fuel =fuel- location - previous;
			while (!pq.isEmpty() && fuel < 0) {
				fuel += pq.poll();
				result++;
			}

			if (fuel < 0)
				return -1;
			pq.add(capacity);
			previous = location;
		}

		{
			fuel -= target - previous;
			while (!pq.isEmpty() && fuel < 0) {
				fuel += pq.poll();
				result++;
			}
			if (fuel < 0)
				return -1;
		}

		return result;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int start = scn.nextInt();
		int i = scn.nextInt();
		int[][] stations = new int[i][2];
		for (int row = 0; row < i; row++) {
			for (int col = 0; col < 2; col++) {
				stations[row][col] = scn.nextInt();

			}
		}
		System.out.println(min(target, start, stations));
	}

}
