package day8hashmapnheap;

import java.util.*;

public class D_8_3_SubstringEqual0_1_2 {

	public static void equal_012(String line) {
		// Write your code here
			int ans1=0;
		  HashMap<String, Integer> map = new HashMap<>();
	         int ans = 0;
	         int count0 = 0, count1 = 0, count2 = 0;
	         
	         map.put("0*0", 1);
	         for (int i = 0; i < line.length(); i++) {
	             
	             char b = line.charAt(i);
	             
	             switch (b) {
	                 case '0':
	                     count0++;
	                     break;
	                 case '1':
	                     count1++;
	                     break;
	                 case '2':
	                     count2++;
	                     break;
	             }
	             
	             String temp = (count0 - count1) + "*" + (count0 - count2);   
	             if (map.containsKey(temp)) {	 	 	 	 	 	 	 	 
	                 ans += map.get(temp);
	                 map.put(temp, map.get(temp) + 1);
	             } else {
	                 map.put(temp, 1);
	             }
	         }
	         
	         System.out.println(ans);
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		equal_012(sc.next());

	}

}
