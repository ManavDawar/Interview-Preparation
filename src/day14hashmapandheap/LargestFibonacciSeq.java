package day14hashmapandheap;

import java.lang.*;
import java.io.*;
import java.util.*;

public class LargestFibonacciSeq {

	public static void solve(int[] arr) {
		// Write your code here
		HashSet<Integer> set=new HashSet<>();
		ArrayList<Integer> list=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int val:arr) {
			max=Math.max(val,max );
		}
		
		int a=0;
		int b=1;
		while(b<max) {
			int c=a+b;
			a=b;
			b=c;
			set.add(c);
		}
		
		for(int val:arr) {
			if(set.contains(val)) {
				list.add(val);
			}
		}
		
		for(int val:list) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		solve(num);
	}

}
