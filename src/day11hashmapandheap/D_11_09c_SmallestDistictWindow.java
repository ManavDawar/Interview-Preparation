package day11hashmapandheap;

import java.util.*;

public class D_11_09c_SmallestDistictWindow {
	public static int minLength(String s) {
		// write your code here

		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}

		int distictcount=set.size();
		
		int start=0;
		int min=Integer.MAX_VALUE;
		int minlen=0;
		int count=0;
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
		
		return min;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(minLength(sc.next()));

	}

}
