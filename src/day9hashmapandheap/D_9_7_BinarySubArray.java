package day9hashmapandheap;

import java.util.*;

public class D_9_7_BinarySubArray {

	public static int numSubarraysWithSum(int[] A, int S) {

		int sum=0;
		int ans=0;
		HashMap<Integer, Integer> map=new HashMap<>();
		
		map.put(0, 1);
		
		for(int val:A) {
			sum+=val;
			ans+=map.getOrDefault(sum-S, 0);
			map.put(sum,map.getOrDefault(sum, 0)+1);
		}
		
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input for the array.
		int N = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			array[i] = n;
		}

		// Taking input for sum.
		int sum = sc.nextInt();

		System.out.println(numSubarraysWithSum(array, sum));

	}

	// Function to print an array. You can use it for debugging purposes.
	// It takes as input the array to be displayed.
	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
