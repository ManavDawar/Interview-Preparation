package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class hack1 {

	public static int numofPrizes(int k, List<Integer> marks) {
		// Write your code here
		int count = marks.size() - 1;
		int nos = 0;
		Collections.sort(marks);
		HashSet<Integer> set = new HashSet<>();
		while (set.size() < k && count >= 0) {
			if (marks.get(count) == 0) {
				break;
			}
			set.add(marks.get(count));
			nos++;
			count--;
		}
		if (count>=0&&marks.get(count) != 0) {
			while (count >= 0 && marks.get(count) == marks.get(count + 1)) {
				nos++;
				count--;
			}
		}

		return nos;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5));
		System.out.println(numofPrizes(4, list));
	}
}
