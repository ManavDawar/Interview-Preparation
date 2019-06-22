package day10hashmapandheap;

import java.util.*;

public class D_11_09a_SmallestWindow {

	public static String smallestWindow(String t, String s) {
		HashSet<Character> set = new HashSet<>();
		for (char c : t.toCharArray()) {
			set.add(c);
		}

		int distictcount=set.size();
		
		int start=0;
		int min=Integer.MAX_VALUE;
		int minlen=0;
		int count=0;
		String res="";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			if(map.get(c)==1) {
				count++;
			}
			
			if(count==distictcount) {
				while(map.get(s.charAt(start))>1) {
					map.put(s.charAt(start), map.get(s.charAt(start))-1);
					start++;
				}
                minlen = i - start + 1;
                if (minlen < min) {
                    min = minlen;
                }
			}
			
		}
		System.out.println(min);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(smallestWindow(sc.next(), sc.next()));

	}

}
