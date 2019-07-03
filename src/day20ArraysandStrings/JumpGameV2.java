package day20ArraysandStrings;

import java.util.Scanner;

public class JumpGameV2 {
	public static int jump(int[] arr) {
		// Write your code here
		int reach=0;
		int count=1;
		int idx=0;
		while(reach<arr.length-1) {
			for(int i=idx;i<arr[idx];i++) {
				int sum=arr[i]+i;
				if(sum>reach) {
					idx=i;
					reach=sum;
				}
			}
			
			count++;
		}
		
		return count;
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
