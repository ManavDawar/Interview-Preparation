package day11hashmapandheap;

import java.util.*;
import java.io.*;

public class D_11_2_SubarraySumDivbyK {
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.

	public static int subarraysDivByK(int[] A, int K) {

		int sum=0;
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, 1);
		int mod=0;
		for(int val:A) {
			sum+=val;
			mod=sum%K;
			if(mod<0) {
				mod+=K;
			}
			count+=map.getOrDefault(mod,0);
			map.put(mod,map.getOrDefault(mod, 0)+1);
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		for (int z = 0; z < n; z++) {
			arr[z] = scn.nextInt();
		}
		System.out.println(subarraysDivByK(arr, k));
	}

}
