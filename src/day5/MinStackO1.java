package day5;

import java.util.Stack;

public class MinStackO1 {
	
	public static Stack<Integer> st=new Stack<>();
	
	public static int min=Integer.MIN_VALUE;
	
	public static void push(int data) {
		if(st.size()==0) {
			st.push(data);
			min=data;
		}else if(data<min) {
			st.push(data+data-min);
			min=data;
		}else {
			st.push(data);
		}
	}
	
	public static int getMin() {
		return min;
	}

	public static int getTop() {
		if(st.peek()<min) {
			return min;
		}else {
			return st.peek();
		}
	}
	
	public static int pop() {
		if(st.peek()<min) {
			st.pop();
			return min;
		}else {
			
			return st.pop();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		push(10);
		push(20);
		push(-20);
		push(-10);
		System.out.println(getMin());
		System.out.println(getTop());
		
	}

}
