package day7;
import java.util.*;
import java.lang.*;
import java.io.*;


public class D_7_9_RemoveDigit {


	static long removeRep(long n) {
		long prev=n%10;
		long ans=prev;
		int pow=10;
		while(n>0) {
			long curr=n%10;
			if(curr!=prev) {
				ans+=curr*pow;
				prev=curr;
				pow*=10;
			}
			
			n/=10;
		}
		
		return ans;
	}

	// Dont make changes here
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		System.out.println(removeRep(A));

	}

}
