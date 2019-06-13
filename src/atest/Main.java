package atest;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,0,7,3,7,8,9};
		int[] res= smallest(arr, 5);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	public static int[] smallest(int[] arr,int k) {
		
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(s.size()==0) {
				s.push(arr[i]);
			}else {
				
				while(!s.isEmpty()&&arr[i]<s.peek()&&k>0) {
//					if(arr[i]==0) {
//					FOR ZERO HANDLING 	
//					}
					s.pop();
					k=k-1;
				}
				s.push(arr[i]);
			}
		}
		
		while(k>0) {
			s.pop();
			k=k-1;
		}
		int[] res = new int[s.size()];
		for(int i=s.size()-1;i>=0;i--) {
			res[i]=s.pop();
		}
		
		return res;
	}

}
