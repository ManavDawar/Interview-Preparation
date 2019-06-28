package day16ArraysAndStrings;

public class LongestRepeatingCharacter {
	class Solution {
	    public int characterReplacement(String s, int k) {
	          int[] chars = new int[26];
	 	         int maxCount = 0, start = 0, maxSize = 0;
	 	         
	 	         for(int end = 0; end < s.length(); end ++){
	 	             chars[s.charAt(end) - 'A']++;
	 	             maxCount = Math.max(maxCount, chars[s.charAt(end) - 'A']);
	 	             
	 	             // if max character frequency + distance between start and end is greater than k
	 	             // this means we have considered changing more than k charactres. So time to shrink window
	 	             if(end - start + 1 - maxCount > k){
	 	                 chars[s.charAt(start) - 'A']--;
	 	                 start ++;
	 	             }
	 	             
	 	             maxSize = Math.max(maxSize, end - start + 1);
	 	         }
	 	         
	 	         return maxSize;
	    }
	}
}
