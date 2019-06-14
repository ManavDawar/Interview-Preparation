package day7;

import java.util.*;

public class D_7_10_SortStack {

	// This function return the sorted stack
	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> temps = new Stack<>();

		while (input.size() > 0) {
			int temp = input.pop();

			while (!temps.isEmpty() && temps.peek() > temp) {

				input.push(temps.pop());
			}
			temps.push(temp);

		}
		
		return temps;

	}

	public static void main(String args[]) {
		Stack<Integer> input = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			input.push(sc.nextInt());

		Stack<Integer> res = sortstack(input);

		while (!res.empty()) {
			System.out.print(res.pop() + " ");
		}
	}

}
