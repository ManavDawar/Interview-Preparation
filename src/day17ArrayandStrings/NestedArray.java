package day17ArrayandStrings;

import java.util.LinkedList;
import java.util.Queue;

public class NestedArray {

	public static int nestedArray(int[] arr) {

		boolean[] visited = new boolean[arr.length];
		int max = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			int j = arr[i];
			int len = 1;
			while (!visited[j]) {
				visited[j] = true;
				j = arr[j];
				len++;
			}

			max = Math.max(max, len);
		}
		return max;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 0, 3, 1, 6, 2 };

		System.out.println(nestedArray(arr));

	}
}
