package day13hashmapandheap;

import java.util.*;

public class UnCommonWords {
	public static String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> count = new HashMap();
		for (String word : A.split(" "))
			count.put(word, count.getOrDefault(word, 0) + 1);
		for (String word : B.split(" "))
			count.put(word, count.getOrDefault(word, 0) + 1);

		List<String> ans = new LinkedList();
		for (String word : count.keySet())
			if (count.get(word) == 1)
				ans.add(word);

		return ans.toArray(new String[ans.size()]);
	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String A = s.nextLine();
		String B = s.nextLine();

		String ans[] = uncommonFromSentences(A, B);
		Arrays.sort(ans);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
