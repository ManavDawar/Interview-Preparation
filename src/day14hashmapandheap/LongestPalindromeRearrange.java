package day14hashmapandheap;

import java.util.*;
 
public class LongestPalindromeRearrange {

	 	 public static int longestPalindrome(String s) {
	 	
	 		int[] count = new int[128];
	        for (char c: s.toCharArray())
	            count[c]++;

	        int ans = 0;
	        for (int v: count) {
	            ans += v / 2 * 2;
	            if (ans % 2 == 0 && v % 2 == 1)
	                ans++;
	        }
	        return ans;
//	 		 --------------------------------------------Method2
	 		 //Write your code here	 	 
//	 		 HashMap<Character, Integer> map=new HashMap<>();
//	 		 
//	 		 for(char c :s.toCharArray()) {
//	 			 map.put(c, map.getOrDefault(c, 0)+1);
//	 		 }
//	 		 int ans=0;
//	 		 boolean flag=false;
//	 		 for(char c :map.keySet()) {
//	 			 if(map.get(c)%2==0) {
//	 				 ans+=map.get(c);
//	 			 }else {
//	 				 ans+=map.get(c)-1;
//	 				 flag=true;
//	 			 }
//	 		 }
//	 		 if(flag) {
//	 			 ans++;
//	 		 }
//	 		 
//	 		 return ans;
	 	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 		 int ans=7;
	 		 int v=2;
	 			System.out.println(ans+" "+v);	 
	            ans =ans+ v ;
	            System.out.println(ans+" "+v);	 
	            ans/=2;
	            System.out.println(ans+" "+v);	 
	            ans*=2;
	            
	            System.out.println(ans);
//	 	 	 Scanner s = new Scanner(System.in);
//	 	 	 String str = s.next();
//	 	 	 System.out.println(longestPalindrome(str));
	 
	 		 
	 	 }
	 
	 
}
