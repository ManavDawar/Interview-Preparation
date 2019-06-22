package day13hashmapandheap;

import java.util.*;

public class SudokuValid {

	// This is a functional problem. You have to complete this function.
	// It takes as input a 2D array of characters. It should return true if the
	// board is valid, else should return false.
	public static boolean isValidSudoku(char[][] board) {
		// write your code here.
		int[] row = new int[9];
		int[] col = new int[9];
		int[][] sub = new int[3][3];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int val = 0;
				if (board[i][j] == '.') {
					continue;
				} else {
					val = board[i][j] - '0';
				}
				if ((row[i] & (1 << val)) != 0) {
					return false;
				} else {
					row[i] |= (1 << val);
				}

				if ((col[j] & (1 << val)) != 0) {
					return false;
				} else {
					col[j] |= (1 << val);
				}

				if ((sub[i / 3][j / 3] & (1 << val)) != 0) {
					return false;
				} else {
					sub[i / 3][j / 3] |= (1 << val);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] board = new char[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.next().charAt(0);
			}
		}
		if (isValidSudoku(board)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

}
