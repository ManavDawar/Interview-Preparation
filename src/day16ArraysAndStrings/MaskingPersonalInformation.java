package day16ArraysAndStrings;
import java.util.*;

public class MaskingPersonalInformation {
	
	 	 public static void main(String[] args) {
	 	 	 Scanner scn = new Scanner(System.in);
	 	 	 String str = scn.next();
	 	 	 System.out.print(maskPII(str));
	 	 }
	 
	 	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input a string
	 	 // It should return required output.
	 
	 	 public static String maskPII(String S) {
	 	 	 // Write your code here
	 		 int atIndex = S.indexOf('@');
 	 	 	 if (atIndex >= 0) { // email
 	 	 	 	 return (S.substring(0, 1).toLowerCase() + "*****" + S.substring(atIndex - 1)).toLowerCase();
 	 	 	 } else {
 	 	 	 	 char modify[] = S.toCharArray();
 	 	 	 	 String Digits = "";
 	 	 	 	 for (int i = 0; i < modify.length; i++) {
 	 	 	 	 	 if (modify[i] != '+' && modify[i] != '-' && modify[i] != ')' && modify[i] != '(' && modify[i] != ' ') {
 	 	 	 	 	 	 Digits += modify[i];
 	 	 	 	 	 }
 	 	 	 	 }
 	 	 	 	 StringBuilder ans = new StringBuilder();
 	 	 	 	 ans.append("***-***-" + Digits.substring(Digits.length() - 4));
 
 	 	 	 	 if (Digits.length() == 10) {
 
 	 	 	 	 	 return ans.toString();
 	 	 	 	 }
 	 	 	 	 String ns = '+' + "";
 	 	 	 	 for (int i = 0; i < Digits.length() - 10; i++) {
 	 	 	 	 	 ns += '*';
 	 	 	 	 }
 	 	 	 	 ns += '-' + ans.toString();
 
 	 	 	 	 return ns;
	 		 }
	 	 
	 }
}
