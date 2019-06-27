package day14hashmapandheap;

import java.util.*;

public class LoveForTwins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(mt(arr));
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array.
	// It should return an integer value.
	public static int mt(int[] arr) {
		// Write your code here
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int val:arr) {
			map.put(val,map.getOrDefault(val, 0)+1);
		}
		int ans=0;
		for(int val:map.keySet()) {
			if(map.get(val)%2==0) {
				ans+=map.get(val);
			}else {
				ans+=((map.get(val)/2)*2);
			}
		}
		
		return ans;
	}

}
