package day16ArraysAndStrings;

import java.util.*;
 
 
public class RgB {

	     public static String similarRGB(String color) {
	         //Write your code here
	    	 StringBuilder str=new StringBuilder();
	    	 str.append("#");
	    	 for(int i=1;i<color.length()-1;i=i+2) {
	    		 String aq=color.substring(i,i+2);
	    		 if(aq.charAt(0)>aq.charAt(1)) {
	    			 int one=Integer.parseInt(aq.charAt(0)-1+);
	    			 int two=Integer.parseInt(aq.substring(0)+aq.substring(0),16);
	    			 int val=Integer.parseInt(aq,16);
	    			 if(Math.abs(one-val)>Math.abs(two-val)) {
	    				 str.append(aq.substring(0,1)+aq.substring(0,1));
	    			 }else {
	    				 str.append(aq.substring(1)+aq.substring(1));
	    			 }
	    		 }else {
	    			 int one=Integer.parseInt(aq.substring(0)+aq.substring(0),16);
	    			 int two=Integer.parseInt(aq.substring(1)+aq.substring(1),16);
	    			 int val=Integer.parseInt(aq,16);
	    			 if(Math.abs(one-val)>Math.abs(two-val)) {
	    				 str.append(aq.substring(0,1)+aq.substring(0,1));
	    			 }else {
	    				 str.append(aq.substring(1)+aq.substring(1));
	    			 }
	    		 }
	    	 }
	     }
	 
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.println(similarRGB(sc.next()));
//	         similarRGB("#fedc");
	     }
	 
	 
}
