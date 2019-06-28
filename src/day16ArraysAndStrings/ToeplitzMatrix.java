package day16ArraysAndStrings;
import java.util.*;


public class ToeplitzMatrix {
	
	     public static boolean isToeplitzMatrix(int[][] matrix) {
	       //Write your code here
	        int m = matrix.length;
	         int n = matrix[0].length;
	         int mat[] = new int[m + n - 1];
	         Arrays.fill(mat, -1);
	 
	         for (int i = 0; i < m; i++) {
	             for (int j = 0; j < n; j++) {
	                 if (mat[m - 1 + (j - i)] == -1) {
	                     mat[m - 1 + (j - i)] = matrix[i][j];
	                 } else {
	                     if (matrix[i][j] != mat[m - 1 + (j - i)]) {
	                         return false;
	                     }
	                 }
	             }
	         }
	 
	         return true;
//----------------------------------------
//	         or
//	         class Solution {
//	        	    public boolean isToeplitzMatrix(int[][] matrix) {
//	        	        for (int r = 0; r < matrix.length; ++r)
//	        	            for (int c = 0; c < matrix[0].length; ++c)
//	        	                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
//	        	                    return false;
//	        	        return true;
//	        	    }
//	        	}
	     
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int r = sc.nextInt();
	         int c = sc.nextInt();
	         int[][] arr = new int[r][c];
	         for (int i = 0; i < r; i++) {
	             for (int j = 0; j < c; j++) {
	                 arr[i][j] = sc.nextInt();
	             }
	         }
	         System.out.println(isToeplitzMatrix(arr));
	     }
	 
}
