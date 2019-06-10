package day4;

import java.util.*;
import java.lang.*;
import java.io.*;

public class D_4_6_SnQBracketPos {
	
	 public static void printBracketsPos(String s){
	         Stack<Integer> st=new Stack<>();
	        char[] c=s.toCharArray();
         int n=0;
         for(int i=0;i<c.length;i++){
             if(c[i]=='('){
                 ++n;
                 System.out.print(n + " ");
                 st.push(n);
             }
             if(c[i]==')'){
                 System.out.print(st.pop() + " "); 
             }
         }
         System.out.println(); 
     }
	 public static void main (String[] args) {
	     Scanner scn=new Scanner(System.in);
	         String s=scn.next();
	         printBracketsPos(s);
	     
	 }

}
