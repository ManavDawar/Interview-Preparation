package day14hashmapandheap;

import java.io.*;
import java.util.*;

public class LongestSubarrayWithSumDivByK {

	public static void print(int n, int[] arr, int k) {
		// Write your code here
		HashMap<Integer, Integer> map =new HashMap<>();
		map.put(0, -1);
		int sum=0;
		int mod=0;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			mod=sum%k;
			if(mod<0) {
				mod+=k;
			}
			if(map.containsKey(mod)) {
				ans=Math.max(ans, i-map.getOrDefault(mod, 0));
			}else{
				map.put(mod, i);
			}
		}
		
		System.out.println(ans);

	}

	// Don't make any changes here.
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int k = s.nextInt();
		print(n, num, k);
	}

}
