package day14hashmapandheap;

import java.util.*;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		int r = scn.nextInt();
		numners(l, r);
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input two numbers as range
	// It should print required output

	public static void numners(int l, int r) {
		// Write your code here
		int n = 0;
		while (l <= r) {
			n = l;
			HashSet<Integer> set = new HashSet<>();
			while (n > 0) {
				int rem = n % 10;
				if (set.contains(rem)) {
					break;
				}
				set.add(rem);
				n = n / 10;
			}
			if (n == 0) {
				System.out.print(l);
			}
			l++;
		}
	}

}
