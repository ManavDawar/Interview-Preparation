package day9hashmapandheap;
import java.util.*;

public class D_9_3_SubsetofOtherArray {
	   
	       public static boolean solve(int[] num1, int[] num2) {
	          // write your code here.
	            HashSet<Integer> hm = new HashSet<>();
	           for (int val : num1) {
	               hm.add(val);
	           }
	   
	           for (int val : num2) {
	               if (hm.contains(val) == false) {
	                   return false;
	               }
	           }
	   
	           return true;
	       }
	   
	       public static void main(String[] args) {
	   
	           Scanner sc = new Scanner(System.in);
	   
	           // Taking input for the arrays.
	           int N = sc.nextInt();
	           int[] array1 = new int[N];
	   
	           for (int i = 0; i < N; i++) {
	               int n = sc.nextInt();
	               array1[i] = n;
	           }
	   
	           int M = sc.nextInt();
	           int[] array2 = new int[M];
	   
	           for (int i = 0; i < M; i++) {
	               int m = sc.nextInt();
	               array2[i] = m;
	           }
	   
	           if (solve(array1, array2)) {
	               System.out.println("Yes");
	           } else {
	               System.out.println("No");
	           }
	   
	       }
	   
	       // Function to print an array. You can use it for debugging purposes.
	       // It takes as input the array to be displayed.
	       public static void printArray(int[] arr) {
	   
	           for (int i = 0; i < arr.length; i++) {
	               System.out.print(arr[i] + " ");
	           }
	   
	           System.out.println();
	       }
	   
	   
}
