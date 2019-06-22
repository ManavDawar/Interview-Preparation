package day11hashmapandheap;

import java.util.HashMap;
import java.util.Scanner;

public class D_11_04_Equal0and1 {
	public static int countSubArrays(int[] a, int n) {
		// Write your code here.
		int sum=0;
		int ans=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]==0?-1:a[i];
		}
		
		map.put(0, 1);
		for(int val:a) {
			sum+=val;
			ans+=map.getOrDefault(sum, 0);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		
		return ans;

	}

	// Don't make any changes here.
	public static void main(String[] args) {
		// code
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(countSubArrays(a, n));

	}

}
