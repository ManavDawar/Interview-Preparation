package day16ArraysAndStrings;
import java.util.*;


public class StudentAttendance {
	    // This is a functional problem. You have to complete this function.
	     // It takes as input a String S. It should return true if the student could
	     // be rewarded, else should return false.
	     public static boolean checkRecord(String s) {
	 
	         int ACount = 0;
	         int LCount = 0;
	         boolean L3 = false;
	 
	         char[] arr = s.toCharArray();
	 
	         for (int i = 0; i < arr.length; i++) {
	             if (arr[i] == 'A')
	                 ACount++;
	             if (arr[i] != 'L')
	                 LCount = 0;
	             else if (arr[i] == 'L') {
	                 LCount++;
	                 if (LCount == 3)
	                     L3 = true;
	             }
	         }
	 
	         if (L3 || ACount > 1)
	             return false;
	         else
	             return true;
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	 
	         String S = sc.next();
	 
	         if (checkRecord(S)) {
	             System.out.println("Yes");
	         } else {
	             System.out.println("No");
	         }
	 
	     }
	 
}
