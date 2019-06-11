package day5;

import java.util.Stack;

public class ReversalBracket {

	public static int reversal(String s) {
		int count=0;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch=='(') {
				st.push(ch);
			}else if(ch==')') {
				if(!st.isEmpty()&&st.peek()=='(') {
					st.pop();
				}else {
					st.push(ch);
				}
			}
			
		}
		int c1=0,c2=0;
		while(st.size()>0) {
			char c=st.pop();
			if(c=='(') {
				c2++;
			}else if(c==')') {
				c1++;
			} 
		}
		
		count=(int)(Math.ceil(c1*1.0/2)+Math.ceil(c2*1.0/2));
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println(reversal("))))(((())"));
		
	}

}
