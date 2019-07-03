package day18ArraysandStrings;

import java.util.*;

public class AmbigiousCoordinates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		List<String> res = ambiguousCoordinates(s);
		System.out.print(res);
	}

	// -----------------------------------------------------
	// This is a functional problem. Do not modify main
	// This function takes as input an array and integer k.
	// It should return required output.

    public static List<String> ambiguousCoordinates(String S) {
        List<String> ans = new ArrayList();
        for (int i = 2; i < S.length()-1; ++i)
            for (String left: make(S, 1, i))
                for (String right: make(S, i, S.length()-1))
                    ans.add("(" + left + ", " + right + ")");
        return ans;
    }

    public static List<String> make(String S, int i, int j) {
        // Make on S.substring(i, j)
        List<String> ans = new ArrayList();
        for (int d = 1; d <= j-i; ++d) {
            String left = S.substring(i, i+d);
            String right = S.substring(i+d, j);
            if ((!left.startsWith("0") || left.equals("0"))
                    && !right.endsWith("0"))
                ans.add(left + (d < j-i ? "." : "") + right);
        }
        return ans;
    
	}
}
