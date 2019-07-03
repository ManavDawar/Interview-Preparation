package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class hack1 {

    public static int numofPrizes(int k, List<Integer> marks) {
    // Write your code here
    	int count=0;
    	int nos=0;
    	Collections.sort(marks);
    	HashSet<Integer>set=new HashSet<>();
    	for(int i=marks.size()-1;i>=0;i--) {
    		if(marks.get(i)<=0) {
    			break;
    		}
    		set.add(marks.get(i));
    		nos++;
    		if(set.size()==k) {
    			while(i>0&&marks.get(i)==marks.get(i-1)) {
    				nos++;
    				i--;
    			}
    			break;
    		}
    		
    	}
    	
    	return nos;
    }
    
    public static void main(String[] args) {
    	List<Integer> list=new ArrayList<>(Arrays.asList(0,0,3,4,5));
    	System.out.println(numofPrizes(4, list));
    }
}
