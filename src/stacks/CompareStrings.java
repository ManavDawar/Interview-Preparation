package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CompareStrings {

	 public static boolean compareString(String s1, String s2) {
 	 	 //write your code here
 	 	 
 	 	 Stack<Character> st1 = new Stack<>();
 	 	 Stack<Character> st2 = new Stack<>();
 	 	 
 	        for(int i=0;i<s1.length();i++){
 	 	     char ch = s1.charAt(i);
 	 	     if(ch=='#'){
 	 	         st1.pop();
 	 	     }else{
 	 	         st1.push(ch);
 	 	     }
 	 	 }
 	 	 
 	 	 
 	 	 for(int i=0;i<s2.length();i++){
 	 	     char ch = s2.charAt(i);
 	 	     if(ch=='#'){
 	 	         st2.pop();
 	 	     }else{
 	 	         st2.push(ch);
 	 	     }
 	 	 }
 	 	 if(st1.size()!=st2.size()){
 	 	         return false;
 	 	     }
 	 	 
 	 	 while(st1.size()>0) {
 	 		 if(st1.pop()!=st2.pop()) {
 	 			 return false;
 	 		 }
 	 	 }
 	 	     
 	 
 	 	 return true;
 	 }
 
 //Driver program
 	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 String s1 = scn.next();
 	 	 String s2 = scn.next();
 
 	 	 System.out.println(compareString(s1, s2));
 	 }
}
