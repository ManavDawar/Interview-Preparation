package day7;

import java.util.*;

public class D_7_4_AddToMakeValid {

	public static int minAddToMakeValid(String S) {
		// Write your code here
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ')') {
				if (!st.isEmpty() && st.peek() == '(') {
					st.pop();
				} else {
					st.push(S.charAt(i));
				}

			} else {
				st.push(S.charAt(i));
			}
		}
		
		return st.size();
	}

	// Dont make changes here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(minAddToMakeValid(s));
	}

}
