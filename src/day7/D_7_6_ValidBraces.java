package day7;

import java.util.*;
import java.lang.*;
import java.io.*;

public class D_7_6_ValidBraces {

	public static void isbal(String s) {
		// Write your code here

		Stack<Character> st = new Stack<>();

		String obs = "({[";
		String cbs = ")}]";

		for (char ch : s.toCharArray()) {
			if (obs.indexOf(ch) != -1) {
				st.push(ch);
			} else if (cbs.indexOf(ch) != -1) {
				if (st.size() == 0) {
					System.out.print("not balanced");
					return;
				} else if (obs.indexOf(st.peek()) != cbs.indexOf(ch)) {
					System.out.print("not balanced");
					return;
				}

				st.pop();
			}
		}

		if (st.size() != 0) {
			System.out.print("not balanced");
			return;
		} else {
			System.out.print("balanced");
			return;
		}
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		isbal(s);

	}

}
