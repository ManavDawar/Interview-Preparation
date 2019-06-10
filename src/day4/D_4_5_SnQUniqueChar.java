package day4;

import java.util.*;
import java.lang.*;
import java.io.*;

public class D_4_5_SnQUniqueChar {

	public static void uniqueChar(char[] str) {

		int arr[] = new int[26];
		Queue<Character> q = new LinkedList<>();

		for (int i = 0; i < str.length; i++) {

			char ch = str[i];

			arr[ch - 'a']++;

			q.add(ch);

			while (!q.isEmpty()) {

				if (arr[q.peek() - 'a'] > 1) {
					q.remove();
				}

				else {
					System.out.print(q.peek() + " ");
					break;
				}

			}

			if (q.isEmpty()) {
				System.out.print(-1 + " ");
			}
		}

		System.out.println();

	}

	// Dont make changes here
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char ch[] = new char[n];

		for (int i = 0; i < n; i++) {
			ch[i] = sc.next().charAt(0);

		}
		uniqueChar(ch);

	}

}
