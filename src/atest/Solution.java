package atest;

import java.io.*;
import java.util.*;

public class Solution {

	public static class Helper {
		int myval;
		int infect;
		int time;

		public Helper(int myval, int infect, int time) {
			this.myval = myval;
			this.infect = infect;
			this.time = time;
		}

	}

	public static int virus(int n, int[] arr) {
		Stack<Helper> st = new Stack<>();
		int days = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!st.isEmpty() && arr[i] < st.peek().myval) {
				Helper rem = st.pop();
				st.push(new Helper(arr[i], rem.myval, rem.time + 1));
				days = Math.max(days, rem.time + 1 - 0);
			} else if (!st.isEmpty() && arr[i] < st.peek().infect) {
				Helper rem = st.pop();
				st.push(new Helper(arr[i], rem.infect, rem.time + 2));
				days = Math.max(days, rem.time + 2 - 0);
			} else {
				st.push(new Helper(arr[i], 0, 0));
			}
		}
		return days;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(virus(n, arr));
	}
}