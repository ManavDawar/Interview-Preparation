package stacks;

import java.util.*;

public class LargestAreaHisto {

	public static int maxRectArea(int[] arr) {

	    //write your code here
        Stack<Integer> st = new Stack<>();
        int area=Integer.MIN_VALUE;
        st.push(0);
        
        for(int i=0;i<arr.length;i++){
            
            while(st.size()>0&&arr[i]<arr[st.peek()]){
                int s2=st.pop();
                
                int area1=st.size()==0?arr[s2]*i:arr[s2]*(i-st.peek()-1);
                area=Math.max(area,area1);
            }
            st.push(i);
        }
        
        while(st.size()>0) {
			int s2=st.pop();
			
			int area2=st.size()==0?arr[s2]*arr.length:arr[s2]*(arr.length-1-st.peek());
			area=Math.max(area, area2);
		}
        
        return area;		
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int h = scn.nextInt();
		int height[] = new int[h];
		for (int i = 0; i < h; i++) {
			height[i] = scn.nextInt();
		}
		System.out.println(maxRectArea(height));
	}
}
