package day13hashmapandheap;

import java.util.*;

public class GroupShiftedString {

	// This is a functional problem. You have to complete this function.
	// It takes as input the a string array. It return a list of list of
	// strings of strings with same shifting sequence grouped together.

	public static List<List<String>> groupStrings(String[] strings) {
		// write your code here.
		HashMap<String, List<String>> map = new HashMap<>();

		for (String s : strings) {
			String key = getkey(s);
			List<String> list = map.getOrDefault(key, new ArrayList<>());
			list.add(s);
			map.put(key, list);
		}

		return new ArrayList<>(map.values());

	}

	private static String getkey(String s) {
		String key = "";
		char[] c = s.toCharArray();
		for (int i = 1; i < c.length; i++) {
			int difference = c[i] - c[i - 1];
			key += difference < 0 ? difference + 26 : difference;
			key += ",";
		}
		return key;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Length of the array
		int N = sc.nextInt();

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		List<List<String>> stringsGrouped = groupStrings(arr);

		for (List<String> lst : stringsGrouped) {
			Collections.sort(lst);
		}

		stringsGrouped.sort(new ListComparator());

		display(stringsGrouped);

	}

	// Comparator for sorting the result list.
	static class ListComparator implements Comparator<List<String>> {

		@Override
		public int compare(List<String> l1, List<String> l2) {

			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			for (int i = 0; i < l1.size(); i++) {
				String l1str = l1.get(i);
				String l2str = l2.get(i);

				return l1str.compareTo(l2str);

			}

			return 0;

		}
	}

	// Function to display a List of Lists of strings.
	public static void display(List<List<String>> list) {

		for (int i = 0; i < list.size(); i++) {

			List<String> currList = list.get(i);

			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}

			System.out.println();
		}

	}

}
