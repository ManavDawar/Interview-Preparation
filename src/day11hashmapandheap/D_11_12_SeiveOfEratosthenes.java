package day11hashmapandheap;

import java.util.*;

public class D_11_12_SeiveOfEratosthenes {

	// This is a functional problem. You have to complete this function.
	// It takes as input N. It should return the count of prime numbers less
	// than N.
	public static int countPrimes(int n) {
		// write your code here.
		  boolean[] primes = new boolean[n];
	         for (int i = 0; i < primes.length; i++) {
	             primes[i] = true;
	         }
	 
	         for (int i = 2; i*i < n; i++) {
	             if (primes[i] == true) {
	                 for (int j = i; j * i < n; j++) {
	                     primes[i * j] = false;
	                 }
	             }
	         }
	 
	         int count = 0;
	         for (int i = 2; i < primes.length; i++) {
	             if (primes[i] == true) {
	                 count++;
	             }
	         }
	 
	         return count;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(countPrimes(N));

	}

}
