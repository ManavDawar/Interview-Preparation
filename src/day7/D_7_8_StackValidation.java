package day7;

import java.util.*;

public class D_7_8_StackValidation {

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		if (pushed.length == 0) {
			return true;
		}
		boolean flag = false;
		int pointer = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < pushed.length; i++) {

			st.push(pushed[i]);

			while (!st.isEmpty() && st.peek() == popped[pointer]) {
				if (pointer == popped.length - 1) {
					return true;
				}
				pointer++;
				st.pop();
			}

		}

		return flag;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] pushed = new int[N];
		int[] popped = new int[N];
		for (int i = 0; i < N; i++)
			pushed[i] = sc.nextInt();
		for (int i = 0; i < N; i++)
			popped[i] = sc.nextInt();
		System.out.print(validateStackSequences(pushed, popped));
	}
}
