package day7;

import java.util.Scanner;
import java.util.Stack;

public class D_7_5_ScoreofParenthesis {
	
	 public static int scoreOfParentheses(String s) {
		 int ans=0;
         Stack<String> stack=new Stack();
         for(int i=0;i<s.length();i++){
             int a=-1;
             if(s.charAt(i)==')'){
                 while(!stack.peek().equals("(")){
                     String p=stack.pop();
                     if(a==-1)a=Integer.parseInt(p);
                     else a+=Integer.parseInt(p);
                 }
                 stack.pop();
                 stack.push(("" + (a==-1?1:(2*a))));
             }
             else stack.push(""+s.charAt(i));
         }
         while(stack.size()!=0)ans+=Integer.parseInt(stack.pop());
         return ans;
     }
     
     
     
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         System.out.println(scoreOfParentheses(s));
         
     }
}
