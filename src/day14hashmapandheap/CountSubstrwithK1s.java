package day14hashmapandheap;
import java.io.*;
import java.util.*;

public class CountSubstrwithK1s {
	  
	     public static void main (String[] args) 
	     { 
	         Scanner scn = new Scanner(System.in);
	         String s = scn.next(); 
	         int K = scn.nextInt(); 
	           
	         System.out.println( 
	             countOfSubstringWithKOnes(s, K)); 
	     } 
	     // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input a string and an integer k.
	 	 // It should return required integer value.
	 
	     static int countOfSubstringWithKOnes(String s, int K) 
	     { 
	 	 	 //Write your code here
	 	 	 HashMap<Integer,Integer> map=new HashMap<>();
	 	 	 map.put(0, 1);
	 	 	 int countof1=0;
	 	 	 int res=0;
	 	 	 
	 	 	 for(int i=0;i<s.length();i++) {
	 	 		 countof1+=(s.charAt(i)-'0');
	 	 		 res+=map.getOrDefault(countof1-K, 0);
	 	 		 map.put(countof1, map.getOrDefault(countof1, 0)+1);
	 	 	 }
	 	 	 
	 	 	 
	 	 	 
	 	 	 return res;
	 	 	 
	     } 
	       
	 
}
