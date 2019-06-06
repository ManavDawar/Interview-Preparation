package stacks;

import java.util.*;

public class NextGreaterElement {
	 static class stack 
 	 { 
 	 	 int top; 
 	 	 int items[] = new int[100]; 
 
 	 	 // Stack functions to be used by printNGE 
 	 	 void push(int x) 
 	 	 { 
 	 	 	 if (top == 99) 
 	 	 	 { 
 	 	 	 	 System.out.println("Stack full"); 
 	 	 	 } 
 	 	 	 else
 	 	 	 { 
 	 	 	 	 items[++top] = x; 
 	 	 	 } 
 	 	 } 
 
 	 	 int pop() 
 	 	 { 
 	 	 	 if (top == -1) 
 	 	 	 { 
 	 	 	 	 System.out.println("Underflow error"); 
 	 	 	 	 return -1; 
 	 	 	 } 
 	 	 	 else
 	 	 	 { 
 	 	 	 	 int element = items[top]; 
 	 	 	 	 top--; 
 	 	 	 	 return element; 
 	 	 	 } 
 	 	 } 
 
 	 	 boolean isEmpty() 
 	 	 { 
 	 	 	 return (top == -1) ? true : false; 
 	 	 } 
 	 } 
 
 	 /* prints element and NGE pair for 
 	 all elements of arr[] of size n */
 	 static void printNGE(int arr[], int n) 
 	 { 
 	 	Stack<Integer> st = new Stack<>();
 	 	
 	 	int[] output =new int[arr.length];
 	 	
 	 	output[arr.length-1]=-1;
 	 	st.push(arr[arr.length-1]);
 	 	
 	 	for(int i =arr.length-2;i>=0;i--) {
 	 		
 	 		while(st.size()>0&&arr[i]>st.peek()) {
 	 			st.pop();
 	 		}
 	 		
 	 		output[i]=st.size()==0?-1:st.peek();
 	 		st.push(arr[i]);
 	 	}
 	 } 
 
 	 public static void main(String[] args) 
 	 { 	 Scanner sc=new Scanner(System.in);
 	 	 int n=sc.nextInt();
 	 	 int arr[] = new int[n];
 	 	 for(int i=0;i<n;i++)arr[i]=sc.nextInt(); 
 	 	 printNGE(arr, n); 
 	 } 
 
}
