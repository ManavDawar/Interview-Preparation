package atest;

public class Knights {

	public class Helper {
		int row;
		int col;
		int level;

		Helper(int row, int col, int level) {
			this.row = row;
			this.col = col;
			this.level = level;
		}
	}

	public static boolean isValid(int[][] arr, int r, int c) {
		if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length) {
			return false;
		}
		if (arr[r][c] == 1 || arr[r][c] == 2) {
			return false;
		}
		return true;
	}
	
//	public static int

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
