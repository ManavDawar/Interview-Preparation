package day7;

import java.util.*;

public class D_7_11_LeftSmaller {

	static void printNearmostLeftSmaller(int arr[], int n) {
		// Write your code here
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] >= st.peek()) {
				st.pop();
			}
			ans[i] = st.size() == 0 ? -1 : st.peek();
			st.push(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(ans[i] + " ");
		}
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		printNearmostLeftSmaller(arr, n);

	}
}
