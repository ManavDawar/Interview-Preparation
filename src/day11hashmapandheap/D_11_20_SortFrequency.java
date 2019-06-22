package day11hashmapandheap;
import java.util.*;

public class D_11_20_SortFrequency {
	    public static class pair implements Comparable<pair> {
	 
	         public char c;
	         public int count;
	 
	         public pair(char charval, int count) {
	             this.c = charval;
	             this.count = count;
	         }
	 
	         @Override
	         public int compareTo(pair o) {
	             // TODO Auto-generated method stub
	             return o.count - this.count;
	         }
	 
	     }
	 
	     public static String frequencySort(String s) {
	 
	         HashMap<Character, Integer> map = new HashMap<>();
	 
	         for (char ch : s.toCharArray()) {
	             if (map.containsKey(ch)) {
	                 map.put(ch, map.get(ch) + 1);
	             } else {
	                 map.put(ch, 1);
	             }
	         }
	 
	         PriorityQueue<pair> pq = new PriorityQueue<>();
	 
	         for (char ch : map.keySet()) {
	             pair p = new pair(ch, map.get(ch));
	 
	             pq.add(p);
	         }
	 
	         StringBuilder ans = new StringBuilder("");
	         while (pq.size() > 0) {
	             pair p = pq.remove();
	 
	             for (int i = 0; i < p.count; i++) {
	                 ans.append(p.c);
	             }
	         }
	 
	         return ans.toString();
	 
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.print(frequencySort(sc.next()));
	     }
	 
	 
}
