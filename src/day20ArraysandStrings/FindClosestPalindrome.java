package day20ArraysandStrings;

import java.util.*;

public class FindClosestPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		System.out.println(nearestPalindromic(n));
	}

	// -----------------------------------------------------
	// This is a functional problem. Don't modify main
	// This function takes as input a string
	// It should return required output.
	public static String mirroring(String s) {
		int i = s.length() / 2;
		StringBuilder x = new StringBuilder(s.substring(0, i));
		return s.substring(0, i) + (s.length() % 2 == 1 ? s.charAt(i) : "") + x.reverse().toString();

	}

	static String makeStringborc(String n, int val) {
		String res="";
		
		int i=(n.length()-1)/2;
		
		if(val==1) {
			res=n.substring(0,i+1);
			Long ans=Long.parseLong(res)+1;
			return ans+n.substring(i+1);
		}else {
			
			res=n.substring(0,i+1);
			Long ans=Long.valueOf(res)-1;
			String temp=String.valueOf(ans);
			
			if(temp.charAt(0)=='0'||res.length()-temp.length()>0) {
				if(temp.charAt(0)=='0'&&temp.length()==1)
                {
                    return "9";
                }
				return temp+"9"+n.substring(i+2);
			}
			return temp+n.substring(i+1);
		}
		
		
	}

	public static String nearestPalindromic(String n) {

		if (n.equals("1")) {
			return "0";
		}

		String a = mirroring(n);
		String b = mirroring(makeStringborc(n, -1));
		String c = mirroring(makeStringborc(n, 1));

		Long d1 = Math.abs(Long.parseLong(n) - Long.parseLong(a));
		d1 = d1 == 0 ? Long.MAX_VALUE : d1;

		Long d2 = Math.abs(Long.parseLong(n) - Long.parseLong(b));
		d2 = d2 == 0 ? Long.MAX_VALUE : d2;

		Long d3 = Math.abs(Long.parseLong(n) - Long.parseLong(c));
		d3 = d3 == 0 ? Long.MAX_VALUE : d3;

		if (d2 <= d1 && d2 <= d3) {
			return b;
		} else if (d1 <= d2 && d1 <= d3) {
			return a;
		} else {
			return c;
		}
	}

}
