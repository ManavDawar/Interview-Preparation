package day12hashmapandheap;

import java.util.*;

public class TigerZindaHai {
	public static int open_closeTabs(String[] T) {
		// Write your code here
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<T.length;i++) {
			String val=T[i];
			if(set.contains(val)) {
				set.remove(val);
			}else if(val.equals("END")) {
				set.clear();
			}else {
			set.add(val);}
		}
		return set.size();
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] T = new String[n];
		for (int i = 0; i < n; i++) {
			T[i] = sc.next();
		}
		System.out.println(open_closeTabs(T));
	}

}
