package day5;

import java.util.*;
import java.util.Scanner;

public class D_5_5_SNQMInStack {

	static int minEle;
	static Stack<Integer> s = new Stack<>();

	static int getMin() {
		if (s.size() == 0)
			return -1;
		return minEle;
	}

	static int pop() {
		if (s.size() == 0)
			return -1;
		int curr = s.pop();

		if (curr < minEle) {
			int p = minEle;
			minEle = 2 * minEle - curr;
			return p;
		}
		return curr;

	}

	static void push(int x) {
		if (s.size() == 0) {
			minEle = x;
			s.push(x);
		} else {
			if (x < minEle) {
				s.push(2 * x - minEle);
				minEle = x;
			} else {
				s.push(x);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] query = new int[n];
		for (int i = 0; i < n; i++) {
			query[i] = sc.nextInt();
		}
		int i = 0;
		while (i < n) {
			if (query[i] == 1) {
				i++;
				push(query[i]);
			} else if (query[i] == 2) {
				System.out.println(pop());
			} else if (query[i] == 3) {
				System.out.println(getMin());
			}
			i++;
		}
	}
}
