package day18ArraysandStrings;

public class PourWater {
	import java.util.*;
	  
	  public class Main {
	  
	      // This is a functional problem. You have to complete this function.
	      // It takes as input a heights array, v and k.
	      // You have to return the resultant heights array.
	      public static int[] pourWater(int[] heights, int v, int k) {
	          // write your code here.
	    	  for(int i=0;i<v;i++) {
	    		  int curr=k;
		            
	    		  while(curr>0&&heights[curr-1]<=heights[curr]) {
	    			  curr--;
	    		  }
	    		  
	    		  while(curr<heights.length-1&&heights[curr]>=heights[curr+1]) {
	    			  curr++;
	    		  }
	    		  
	    		  while(curr>k&&heights[curr]>=heights[curr-1]) {
	    			  curr--;
	    		  }
	    		  heights[curr]++;
	    	  }
	    	  return heights;
	      }
	  
	      public static void main(String[] args) {
	          Scanner sc = new Scanner(System.in);
	  
	          // Input for length of first array.
	          int N = sc.nextInt();
	  
	          int[] arr1 = new int[N];
	  
	          // Input for array1 elements.
	          for (int i = 0; i < arr1.length; i++) {
	              arr1[i] = sc.nextInt();
	          }
	  
	          int V = sc.nextInt();
	          int K = sc.nextInt();
	  
	          int[] result = pourWater(arr1, V, K);
	          display(result);
	  
	      }
	  
	      // function to display an array.
	      public static void display(int[] arr) {
	  
	          for (int i = 0; i < arr.length; i++) {
	              System.out.print(arr[i] + " ");
	          }
	  
	          System.out.println();
	      }
	  }
}
