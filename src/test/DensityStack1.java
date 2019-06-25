package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class DensityStack1 {
	static class DensityStack {
		Map<Integer, Integer> map;
		PriorityQueue<int[]> pq;
		int index;

		public DensityStack() {
			map = new HashMap<>();
			pq = new PriorityQueue<>((a, b) -> {
				if (a[1] == b[1])
					return b[2] - a[2];
				else
					return b[1] - a[1];
			});
			index = 0;
		}

		public void push(int x) {
			int freq = map.getOrDefault(x, 0) + 1;
			map.put(x, freq);
			pq.offer(new int[] { x, freq, index++ });
		}

		public int pop() {
			int temp = pq.poll()[0];
			if (map.get(temp) == 1)
				map.remove(temp);
			else
				map.put(temp, map.get(temp) - 1);
			return temp;
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println();
		int n = scn.nextInt();
		n++;
		scn.nextLine();
		DensityStack stac = new DensityStack();
		String[] op = new String[n];
		for (int i = 0; i < n; i++) {
			op[i] = scn.nextLine();
		}

		for (String s : op) {
			 if (s.equals("pop")) {
				stac.pop();
			} else {
				String[] ops = s.split("\\s+");
				if(ops[0].equals("push")) {
				stac.push(Integer.parseInt(ops[1]));}
			}
		}
	}
}
