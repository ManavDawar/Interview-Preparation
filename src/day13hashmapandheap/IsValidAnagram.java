package day13hashmapandheap;

import java.util.*;

public class IsValidAnagram {

	// This is a functional problem. You have to complete this function.
	// It takes as input the String s ant t. It should return true if t is
	// and anagram of s, else should return false.

	public static boolean isAnagram(String s, String t) {
		// write your code here.
		  if (s.length() != t.length()) {
		        return false;
		    }
		    int[] counter = new int[26];
		    for (int i = 0; i < s.length(); i++) {
		        counter[s.charAt(i) - 'a']++;
		        counter[t.charAt(i) - 'a']--;
		    }
		    for (int count : counter) {
		        if (count != 0) {
		            return false;
		        }
		    }
		    return true;
		    
//-----------------------------------Method2----------------------------------- 
//		    if (s.length() != t.length()) {
//		        return false;
//		    }
//		HashMap<Character, Integer> map=new HashMap<>();
//		for(char c:s.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//		}
//		
//		for(char c:t.toCharArray()) {
//			if(!map.containsKey(c)) {
//				return false;
//			}else {
//				int val=map.get(c);
//				if(val>0) {
//					map.put(c, val-1);
//				}else {
//					map.remove(c);
//				}
//			}
//		}
//		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (isAnagram(s, t)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
