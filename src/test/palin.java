package test;

import java.util.*;

public class palin {

	public static List<List<Integer>> palindromes(String[] words) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], i);
		}
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			for (int k = 0; k <= s.length(); k++) {
				String prefix = s.substring(0, k);
				String suffix = s.substring(k);
				if (isPal(prefix) && map.containsKey(reverse(suffix)) && map.get(reverse(suffix)) != i) {
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(map.get(reverse(suffix)));
					tmp.add(i);
					res.add(tmp);
				}
			}
			s = reverse(words[i]);
			for (int k = 0; k <= s.length(); k++) {
				String prefix = s.substring(0, k);
				String suffix = s.substring(k);
				if (isPal(prefix) && map.containsKey(suffix) && map.get(suffix) != i) {
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(i);
					tmp.add(map.get(suffix));
					res.add(tmp);
				}
			}

		}
		List<List<Integer>> retVal = new ArrayList<List<Integer>>();
		for (List<Integer> l : res) {
			retVal.add(l);
		}
		return retVal;
	}

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static boolean isPal(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}

	public static void display(List<List<Integer>> list) {

		for (int i = 0; i < list.size(); i++) {

			List<Integer> currList = list.get(i);

			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.next();
		}

		List<List<Integer>> stringsGrouped =palindromes(arr);

		display(stringsGrouped);

	}
}
