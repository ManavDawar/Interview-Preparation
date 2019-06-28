package day16ArraysAndStrings;

import java.util.Scanner;

public class RobotReturn {

	public static boolean judgeCircle(String s) {
		// Write code here
		int x = 0;
		int y = 0;

		for (char c : s.toCharArray()) {
			if (c == 'U')
				y--;
			else if (c == 'D')
				y++;
			else if (c == 'R')
				x++;
			else if (c == 'L')
				x--;

		}
		
		if(x==0&&y==0) {
			return true;
		}
		
		return false;
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(judgeCircle(str));

	}

}
