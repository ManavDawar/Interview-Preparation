package day7;

import java.util.*;

public class score {

	public static int scoreOfParentheses(String s) {
	 	 // Write your code here
	 	    Stack<Character> st= new Stack<>();
	 	    
	 	    for(int i=0;i<s.length();i++) {
	 	    	char ch = s.charAt(i);
	 	    	if(st.size()==0) {
	 	    		st.push(ch);
	 	    	}else {
	 	    		if(ch=='(') {
	 	    			st.push(ch);
	 	    		}else {
	 	    			if(st.peek()=='(') {
	 	    				st.pop();
	 	    				st.push('1');
	 	    			}else {
	 	    				int sum=0;
	 	    				while(st.peek()!='(') {
	 	    					int pop=st.pop();
	 	    					sum=sum+pop-'0';
	 	    				}
	 	    				st.pop();
	 	    				char ch1 = (char)sum;
	 	    				st.push();
	 	    			}
	 	    		}
	 	    		
	 	    		
	 	    		
	 	    	}
	 	    	
	 	    }
	 	 
	 	    
	 	 
	     }

	// Dont make changes here
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		System.out.println(scoreOfParentheses(s));
		System.out.println((char)2314);
	}

}
