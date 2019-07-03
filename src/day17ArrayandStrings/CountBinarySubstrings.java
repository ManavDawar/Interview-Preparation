package day17ArrayandStrings;

import java.util.*;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.print(countBinarySubstrings(s));
	}

	public static int countBinarySubstrings(String s) {

		// make groups of same no every count which is lesser in no than the next
		// consecutive count will have each bit giving a new consecutive no..

		int prev=0;
		int curr=1;
		int ans=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				curr++;
			}else {
				prev=curr;
				curr=1;
			}
			
			if(prev>=curr) {
				ans++;
			}
		}
		
		return ans;
	}

}
