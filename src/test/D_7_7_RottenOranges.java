package day7;

import java.util.LinkedList;
import java.util.Scanner;

public class D_7_7_RottenOranges {

	public static class Helper {
		int row;
		int col;
		int time;

		Helper(int row, int col, int time) {
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}

	public static boolean isValid(int[][] arr, int r, int c) {
		if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length) {
			return false;
		}
		if (arr[r][c] == 0 || arr[r][c] == 2) {
			return false;
		}
		return true;
	}

	public static int rottenOranges(int[][] M) {
		// Write your code here
		LinkedList<Helper> queue = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] == 2) {
					Helper h = new Helper(i, j, 0);
					queue.add(h);
					M[i][j]=1;
					count++;
				} else if (M[i][j] == 1) {
					++count;
				}

			}
		}
		int val=0;
		while (queue.size() > 0) {

			Helper rem = queue.remove();

			if (M[rem.row][rem.col] == 2) {
				continue;
			}
			val=rem.time;
			count--;
			M[rem.row][rem.col] = 2;
			// trdl
			if (isValid(M, rem.row - 1, rem.col)) {
				queue.add(new Helper(rem.row - 1, rem.col, rem.time + 1));
			}
			if (isValid(M, rem.row, rem.col + 1)) {
				queue.add(new Helper(rem.row, rem.col + 1, rem.time + 1));
			}
			if (isValid(M, rem.row + 1, rem.col)) {
				queue.add(new Helper(rem.row + 1, rem.col, rem.time + 1));
			}
			if (isValid(M, rem.row, rem.col - 1)) {
				queue.add(new Helper(rem.row, rem.col - 1, rem.time + 1));
			}

		}

		if (count == 0) {
			return val;
		} else {
			return -1;
		}

	}

	// Dont make changes here
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] M = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < M[0].length; j++)
				M[i][j] = sc.nextInt();
		System.out.println(rottenOranges(M));

	}
}
