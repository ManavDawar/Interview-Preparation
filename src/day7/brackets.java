package day7;

import java.util.*;

public class brackets {
	 
	     public static String parseTernary(String expression) {
	         // Write your code here
	         
	         int i=expression.length()-1;
	         Stack<Character> s = new Stack<>();
	         while(i>0){
	             char ch = expression.charAt(i);
	             
	             if(Character.isDigit(ch)){
	                 s.push(ch);
	             }else{
	                 char val1=s.pop();
	                 char val2=s.pop();
	                 if(ch=='T'){
	                     s.push(val1);
	                 }else{
	                     s.push(val2);
	                 }
	             }
	             
	             i--;
	         }
	         
	         
	         String s1= s.pop().toString();
	         return s1;
	     }
	 
	     // Dont make chsnges here
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.print(parseTernary(sc.next()));
	     }
	 
}
