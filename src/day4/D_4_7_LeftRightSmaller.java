package day4;

import java.util.*;

public class D_4_7_LeftRightSmaller {

	public static int[] findleftsmall(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];
		int i = arr.length - 1;
		while (i >= 0) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
			i--;
		}
		return ans;
	}

	public static int[] findrightsmall(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		int i = 0;
		while (i < arr.length) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
			i++;
		}
		return ans;
	}

	static int findMaxDiff(int a[], int n) {
		int[] leftsmaller = findleftsmall(a);

		int[] rightsmaller = findrightsmall(a);

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(Math.abs(leftsmaller[i] - rightsmaller[i]), max);
		}
		return max;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		System.out.println(findMaxDiff(A, N));
	}

}
