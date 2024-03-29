package day20ArraysandStrings;

import java.util.Scanner;

public class JumpGameV2 {
	public static int jump(int[] nums) {
		// Write your code here
		int ladder = 0;
		int stair = 1;
		int jump = 0;
		// at every stair chech if another big laddder is there or not

		for (int level = 0; level < nums.length; level++) {
			if (level == nums.length - 1) {
				return jump;
			}

			// another big ladder found store it..
			if (nums[level] + level >= ladder)
				ladder = nums[level] + level;

			stair--;

			if (stair == 0) {
				jump++;
				// current ladder have no more stairs left so use the stored bigger ladder..
				stair = ladder - level;
				// still no stairs it means we cannot reach the end..
				if (stair == 0)
					return -1;
			}
		}
		return jump;
	}

	// Don't male any changes here
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		System.out.println(jump(num));
	}

}
