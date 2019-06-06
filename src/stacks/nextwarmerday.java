package stacks;

import java.util.*;

public class nextwarmerday {

	public static int[] findWarmerTemp(int arr[]) {
		// Write your code here only
		int[] output = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		st.push(arr.length - 1);
		output[arr.length - 1] = 0;

		for (int i = arr.length - 2; i >= 0; i--) {

			while (st.size() > 0 && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			output[i] = st.size() == 0 ? 0 : st.peek()-i;
			st.push(i);
		}
		return output;
//		Stack<Integer> stack = new Stack<>();
//		int[] res = new int[arr.length];
//
//		res[arr.length - 1] = 0;
//		stack.push(res.length - 1);
//
//		for (int i = arr.length - 2; i >= 0; i--) {
//
//			while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
//				stack.pop();
//			}
//			res[i] = stack.size() == 0 ? 0 : stack.peek() - i ;
//			stack.push(i);
//
//		}
//
//		return res;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp[] = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = sc.nextInt();
		int res[] = findWarmerTemp(temp);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
