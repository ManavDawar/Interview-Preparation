package day14hashmapandheap;
import java.util.*;

public class MeetingRooms {

	  
	      // This is a functional problem. You have to complete this function.
	      // It takes as input a 2D array
	      // It should return the min number of meeting rooms required.
	      public static int minMeetingRooms(int[][] intervals) {
	          // write your code here.
	    	  int[] sa=new int[intervals.length];
	    	  int[] ea=new int[intervals.length];
	    	  
	    	  for(int i=0;i<intervals.length;i++) {
	    		  sa[i]=intervals[i][0];
	    		  ea[i]=intervals[i][1];
	    	  }
	          Arrays.sort(sa);
	          Arrays.sort(ea);
	          int min=Integer.MIN_VALUE;
	          int left=0;
	          int right=0;
	          int count=0;
	          while(left<sa.length) {
	        	  if(sa[left]<ea[right]) {
	        		  left++;
	        		  count++;
	        	  }else {
	        		  right++;
	        		  count--;
	        	  }
	        	  min=Math.max(min, count);
	          }
	          return min;
	      }
	  
	      public static void main(String[] args) {
	          Scanner sc = new Scanner(System.in);
	  
	          // Input for number of meetings.
	          int N = sc.nextInt();
	  
	          int[][] intervals = new int[N][2];
	  
	          int start, end;
	          // Input for intervals.
	          for (int i = 0; i < intervals.length; i++) {
	  
	              start = sc.nextInt();
	              end = sc.nextInt();
	  
	              intervals[i][0] = start;
	              intervals[i][1] = end;
	          }
	  
	          int result = minMeetingRooms(intervals);
	  
	          System.out.println(result);
	  
	      }
	  
	      // Function to display a 2D array.
	      public static void display(int[][] arr) {
	  
	          for (int i = 0; i < arr.length; i++) {
	              for (int j = 0; j < arr[0].length; j++) {
	                  System.out.print(arr[i] + " ");
	              }
	              System.out.println();
	          }
	  
	          
	      }
	  
	  
}
