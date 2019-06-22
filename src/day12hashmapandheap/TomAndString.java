package day12hashmapandheap;

import java.util.*;

public class TomAndString {

	public static int getHashValue(String line) {
		String ques = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			map.put(c, i);
		}
		String[] lines = line.split("\\s+");
		int ans=0;
		for (int i = 0; i < lines.length; i++) {
			String val = lines[i];
			int sum=0;
			for(int j=0;j<val.length();j++) {
				char c =val.charAt(j);
				sum += j+map.getOrDefault(c, 0);
			}
			ans=sum+ans;
		}
		ans=ans*lines.length;
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		System.out.println(getHashValue(line));

	}

}
