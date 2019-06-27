package day15ArraysAndStrings;

import java.util.*;

import javax.sound.sampled.BooleanControl.Type;

public class LongPressed {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		String typed = scn.next();
		System.out.println(isLongPressedName(name, typed));

	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input 2 strings
	// It should return boolean output.
	public static boolean isLongPressedName(String name, String typed) {
		// Write your code here
		if (name.length() == 0 || typed.length() == 0) {
			return false;
		}
		int indexname = 0;
		int indextype = 0;

		while (indexname < name.length()) {
			if (indextype >= typed.length()) {
				return false;
			}

			if (name.charAt(indexname) == typed.charAt(indextype)) {
				indexname++;
				indextype++;
			}

			else {
				if (indexname > 0 && indextype < typed.length()
						&& name.charAt(indexname - 1) == typed.charAt(indextype)) {
					indextype++;
				}else {
					return false;
				}
			}
		}

		while (indextype < typed.length()) {
			if (name.charAt(name.length() - 1) != typed.charAt(indextype)) {
				return false;
			}
			indextype++;
		}
		return true;
	}

}
