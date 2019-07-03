package test;

import java.util.*;

public class hack3 {

	public static List<Integer> commandCount(List<String> commands) {
		// Write your code here
		List<Integer> list = new ArrayList<>();
		int count=0;
		for(int n=0;n<commands.size();n++) {
			count=0;
			String s=commands.get(n);
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<s.length()+1;j++) {
					int matched=0;
					String sub=s.substring(i,j);
					int element=0;
					//for 1 elemts
					while(element<sub.length()&&Character.isLowerCase(sub.charAt(element))) {
						element++;
						matched=1;
					}
					if(matched!=1) {
						break;
					}
					//for :
					if(element<sub.length()&&sub.charAt(element)==':') {
						element++;
					}
					
					//for /
					if(element<sub.length()&&sub.charAt(element)=='/') {
						element++;
						matched=2;
					}
					if(matched!=2) {
						break;
					}
					//for lower 2 
					while(element<sub.length()&&Character.isLowerCase(sub.charAt(element))||Character.isDigit(sub.charAt(element))) {
						element++;
						matched=3;
					}
					if(matched!=3) {
						break;
					}
					//for \
					if(element<sub.length()&&sub.charAt(element)=='\\') {
						element++;
						matched=4;
					}
					if(matched!=4) {
						break;
					}
//					for lower 3
					while(element<sub.length()&&Character.isLowerCase(sub.charAt(element))) {
						element++;
						matched=5;
					}
					if(matched!=5) {
						break;
					}
					
					if(matched==5) {
						count++;
					}
				}
			}
			list.add(count);
			
		}
		
		
		
		return list;
	}
}
