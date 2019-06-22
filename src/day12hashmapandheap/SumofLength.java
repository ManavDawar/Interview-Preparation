package day12hashmapandheap;

import java.util.*;

public class SumofLength {
	public static int sumLength(int[] arr) {
		// Write your code here
		HashSet<Integer> set = new HashSet<>();
        int i =-1;
        int j = -1;
        int sum = 0;
        while(i<arr.length-1 && j<arr.length-1) {
        	if(!set.contains(arr[j+1])) {
        		set.add(arr[j+1]);
        		j++;
        	}
        	else {
        		int temp = j-i;
        		sum += temp*(temp+1)/2;
        		i++;
        		set.remove(arr[i]);
        	}
        }
        for(int k=set.size();k>0;k--) {
        	sum += k*(k+1)/2;
        }
        return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(sumLength(arr));
	}

}
