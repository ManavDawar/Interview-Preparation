package day15ArraysAndStrings;

import java.util.*;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] Input = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Input[i][j] = scn.nextInt();
			}
		}
		System.out.print(numMagicSquaresInside(Input));
	}

	// -----------------------------------------------------
	// This is a functional problem. Do not make changes to main
	// This function takes as input an array and integer k.
	// It should print required output.
	  public static int numMagicSquaresInside(int[][] grid) {
          if (grid == null || grid.length < 3 || grid[0].length < 3) 
              return 0;
          int R = grid.length, C = grid[0].length;
          int count = 0;
          for (int r = 0; r <= R - 3; ++r) {
              for (int c = 0; c <= C - 3; ++c) {
                  if (grid[r + 1][c + 1] == 5 && isMagic(grid, r, c)) {
                      count++;
                  }
              }
          }
          return count;
      }
  
      private static  boolean isMagic(int[][] grid, int r, int c) {
          int[] counts = new int[9];
          for (int i = 0; i < 3; ++i) {
              int rSum = 0, cSum = 0;
              for (int j = 0; j < 3; ++j) {
                  rSum += grid[r + i][c + j];
                  cSum += grid[r + j][c + i];
                  int t = grid[r + i][c + j];
                  if (t > 9 || t < 1 || counts[t - 1]++ > 0) 
                      return false;
              }
              if (rSum != 15 || cSum != 15) 
                  return false;
          }
          return true;
  	  }

}
