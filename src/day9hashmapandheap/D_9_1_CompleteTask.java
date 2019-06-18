package day9hashmapandheap;

import java.util.*;

public class D_9_1_CompleteTask {

	public static void completeTask(int n, int m, int[] compl) {
		// Write your code here
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 1; i <= n; i++) {
			hs.add(i);
		}

		for (int i = 0; i < compl.length; i++) {
			hs.remove(compl[i]);
		}

		boolean bl = true;
		for (int i = 1; i <= n; i++) {
			if (hs.contains(i)) {
				if (bl == true) {
					System.out.print(i + " ");
					hs.remove(i);
				}
				bl = !bl;
			}
		}

		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (hs.contains(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Don't make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] num = new int[m];
		for (int i = 0; i < m; i++) {
			num[i] = scn.nextInt();
		}
		completeTask(n, m, num);
	}

}
