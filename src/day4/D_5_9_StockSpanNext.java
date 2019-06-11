package day4;

import java.util.*;

public class D_5_9_StockSpanNext {
	static class StockSpanner {
		// Complete the functions
		Stack<Integer> prices, weights;

		public StockSpanner() {
			prices = new Stack();
			weights = new Stack();
		}

		public int next(int price) {
			int w = 1;
			while (!prices.isEmpty() && prices.peek() <= price) {
				prices.pop();
				w += weights.pop();
			}

			prices.push(price);
			weights.push(w);
			return w;
		}

	}

	// Dont make chamnges here
	public static void main(String[] args) {
		StockSpanner ss = new StockSpanner();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(ss.next(sc.nextInt()));
		}
	}

}
