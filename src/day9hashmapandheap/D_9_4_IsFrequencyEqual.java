package day9hashmapandheap;

import java.util.*;
import java.io.*;

public class D_9_4_IsFrequencyEqual {
	static int M = 26;

	public static int getIdx(char ch) {
		return (ch - 'a');
	}

	public static boolean allSame(int freq[], int N) {
		int same = 0;

		int i;
		for (i = 0; i < N; i++) {
			if (freq[i] > 0) {
				same = freq[i];
				break;
			}
		}

		for (int j = i + 1; j < N; j++)
			if (freq[j] > 0 && freq[j] != same)
				return false;

		return true;
	}

	public static boolean isFrequencyEqual(String str) {
		int l = str.length();

		int[] freq = new int[M];

		for (int i = 0; i < l; i++) {
			freq[getIdx(str.charAt(i))]++;
		}

		if (allSame(freq, M)) {
			return true;
		}

		for (char c = 'a'; c <= 'z'; c++) {
			int i = getIdx(c);

			if (freq[i] > 0) {
				freq[i]--;

				if (allSame(freq, M))
					return true;
				freq[i]++;
			}
		}

		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean bl = isFrequencyEqual(s);
		System.out.println(bl);
	}

}
