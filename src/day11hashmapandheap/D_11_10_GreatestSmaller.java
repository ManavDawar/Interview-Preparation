package day11hashmapandheap;

import java.util.*;

public class D_11_10_GreatestSmaller {

	public static int[] greatestSmaller(int[] arr) {
		// Write your code here
		TreeSet<Integer> set = new TreeSet<>();
		int[] res = new int[arr.length];
		res[0] = -1;
		set.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(set.lower(arr[i])!=null) {
				res[i]=set.lower(arr[i]);
			}else {
				res[i]=-1;
			}
			set.add(arr[i]);
		}
		return res;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int val : greatestSmaller(arr))
			System.out.print(val + " ");
	}

}
