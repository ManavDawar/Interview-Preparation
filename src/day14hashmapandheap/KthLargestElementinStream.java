package day14hashmapandheap;
import java.util.*;


public class KthLargestElementinStream {
	
	     // This is a functional problem. You have to complete this class.
	     static class KthLargest {
	    	 PriorityQueue<Integer> pq;
	    	 int k;
	         
	         public KthLargest(int k, int[] nums) {
	             // write your code here.
	        	 this.k=k;
	        	 this.pq=new PriorityQueue<>();
	        	 for(int val:nums) {
	        		 pq.add(val);
	        	 }
	         }
	         
	         public int add(int val) {
	             // write your code here.
	        	 pq.add(val);
	        	 while(pq.size()>k) {
	        		 pq.remove();
	        	 }
	        	 return pq.peek();
	        	 
	         }
	 
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	 
	         // Input for length of first array.
	         int N = sc.nextInt();
	 
	         int[] intialStream = new int[N];
	 
	         // Input for initial stream elements.
	         for (int i = 0; i < intialStream.length; i++) {
	             intialStream[i] = sc.nextInt();
	         }
	 
	         int K = sc.nextInt();
	 
	         int M = sc.nextInt();
	         int[] remainingStream = new int[M];
	 
	         // Input for remaining stream elements.
	         for (int i = 0; i < remainingStream.length; i++) {
	             remainingStream[i] = sc.nextInt();
	         }
	 
	         KthLargest obj = new KthLargest(K, intialStream);
	 
	         for (int i = 0; i < remainingStream.length; i++) {
	             int kthLargest = obj.add(remainingStream[i]);
	             System.out.println(kthLargest);
	         }
	 
	     }
	 
	     // Function to display an array.
	     public static void display(int[] arr) {
	 
	         for (int i = 0; i < arr.length; i++) {
	             System.out.print(arr[i] + " ");
	         }
	 
	         System.out.println();
	     }
	 
	 
}
