package day4;

import java.util.Scanner;
import java.util.Stack;

public class D_4_4DecodeString {

	public static String decode(String s) {
		// Write your code here
		Stack<String> stk = new Stack<>();
	    for(int i=s.length()-1;i>=0;--i){
	        char ch = s.charAt(i);
	        if(ch=='['){
	            String str = "" ;
	            while(stk.size()>0&&!stk.peek().equals("]")){
	                str = str+stk.pop();
	            }
	            stk.pop();
	            stk.push(str);
	        }else if(ch==']'){
	            
	            stk.push("]");
	        }else if(ch>='a'&&ch<='z'){
	            
	            stk.push(ch+"");
	        }else{
	            int val = ch - '0';
	            String str = stk.pop();
	            String sv ="";
	            for(int j =0;j<val;++j){
	                sv=sv+str;
	            }
	            stk.push(sv);
	        }
	        
	    }
	    
	    String rv ="";
	    while(stk.size()>0){
	        rv = rv+stk.pop();
	    }
	    return rv;
	    
	}

	// Dont make any changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(decode(s));
	}

}
