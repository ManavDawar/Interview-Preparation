package day17ArrayandStrings;

import java.util.LinkedList;
import java.util.Queue;

public class NestedArray {

	public static int nestedArray(int[] arr) {
		int count=0;
		int max=0;
		Queue<Integer> q=new LinkedList<Integer>();
		boolean[] visited = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				q.add(arr[i]);
				visited[i]=true;
				count=1;
				while(q.size()>0) {
					int rem=q.remove();
					count++;
					if(!visited[arr[rem]]) {
						q.add(arr[rem]);
						visited[rem]=true;
					}else {
						continue;
					}
				}
				max=Math.max(max, count);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = { 5, 4, 0, 3, 1, 6, 2 };

		System.out.println(nestedArray(arr));

	}
}
