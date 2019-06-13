package atest;

import java.util.PriorityQueue;

public class priority {
	
	public static int mincost(int[] arr) {
		int count=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(pq.size()>0) {
			int val1=pq.remove();
			int val2=pq.remove();
			count+=val1+val2;
			pq.add(val1+val2);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
