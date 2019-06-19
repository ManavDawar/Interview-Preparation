package day11hashmapandheap;

import java.util.*;
import java.io.*;

public class D_11_11_AngelProfile {

	public static void findIfFake(String s) {
		// Write your code here
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
				set.add(c);
			}
		}
		if(set.size()%2==0) {
			System.out.println("SHE!");
		}else {
			System.out.println("HE!");
		}
	}

	// Don't make any changes here
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		findIfFake(br.readLine());
	}
}
