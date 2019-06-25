package test;

import java.util.*;

import test.DensityStack1.DensityStack;

public class Sol2 {

	public static List<List<Integer>> quad(int[] arr, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (arr == null || arr.length < 4)
			return result;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 3; i++) {
			if (i != 0 && arr[i] == arr[i - 1])
				continue;
			for (int j = i + 1; j < arr.length - 2; j++) {
				if (j != i + 1 && arr[j] == arr[j - 1])
					continue;
				int k = j + 1;
				int l = arr.length - 1;
				while (k < l) {
					if (arr[i] + arr[j] + arr[k] + arr[l] < target) {
						k++;
					} else if (arr[i] + arr[j] + arr[k] + arr[l] > target) {
						l--;
					} else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						list.add(arr[l]);
						result.add(list);

						k++;
						l--;

						while (k < l && arr[l] == arr[l + 1]) {
							l--;
						}

						while (k < l && arr[k] == arr[k - 1]) {
							k++;
						}
					}

				}
			}
		}

		return result;
	}

	public static void display(List<List<Integer>> list) {

		for (int i = 0; i < list.size(); i++) {

			List<Integer> currList = list.get(i);

			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		List<List<Integer>> stringsGrouped = quad(arr, target);

		display(stringsGrouped);

	}
}
