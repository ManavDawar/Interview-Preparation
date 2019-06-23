package day13hashmapandheap;
import java.util.*;


public class HappyNumber {

	     // This is a functional problem. You have to complete this function.
	     // It takes as input a number n. It should return true if the number is
	     // happy, else should return false.
	     public static boolean isHappy(int n) {
	         // write your code here.
	    	 HashSet<Integer> set=new HashSet<>();
	    	 
	    	 while(set.contains(n)==false) {
	    		 set.add(n);
	    		 int num=0;
	    		 
	    		 while(n>0) {
	    			 int rem=n%10;
	    			 num=num+(rem*rem);
	    			 n/=10;
	    		 }
	    		 n=num;
	    		 if(n==1) {
	    			 return true;
	    		 }
	    		 
	    	 }
	    	 return false;
	 
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	 
	         int N = sc.nextInt();
	 
	         if (isHappy(N)) {
	             System.out.println("Happy");
	         } else {
	             System.out.println("Not Happy");
	         }
	     }
	 
	 
}
