package day11hashmapandheap;
import java.util.*;

public class D_11_07_SparseMatrix {
	    public static void main(String[] args){
	         Scanner scn = new Scanner(System.in);
	         int arow= scn.nextInt();
	         int acol= scn.nextInt();
	         int[][] a= new int[arow][acol];
	         for(int i=0;i<arow;i++){
	             for(int j=0;j<acol;j++){
	                 a[i][j]=scn.nextInt();
	             }
	         }
	         int brow= scn.nextInt();
	         int bcol= scn.nextInt();
	         int[][] b= new int[brow][bcol];
	         for(int i=0;i<brow;i++){
	             for(int j=0;j<bcol;j++){
	                 b[i][j]=scn.nextInt();
	             }
	         }
	         int[][] res= new int[arow][bcol];
	         res=multiply(a,b);    
	         for(int i=0;i<res.length;i++){
	             for(int j=0;j<res[0].length;j++){
	                 System.out.print(res[i][j]+" ");
	             }
	             System.out.println();
	         }
	     }
	 
	     // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input two Sparse  2d Arrays, A and B
	 	 // Return their product
	 	 public static int[][] multiply(int[][] A, int[][] B) {
	 	 	 //Write your code here
	 		 int m=A.length;
	 		 int n = A[0].length;
	 		 int nB=B[0].length;
	 		 
	 		 int[][] C = new int[m][nB];
	 		 
	 		 for (int i = 0; i < m; i++) {
	 	 	 	 for (int k = 0; k < n; k++) {
	 	 	 	 	 if (A[i][k] != 0) {
	 	 	 	 	 	 for (int j = 0; j < nB; j++) {
	 	 	 	 	 	 	 if (B[k][j] != 0)
	 	 	 	 	 	 	 	 C[i][j] += A[i][k] * B[k][j];
	 	 	 	 	 	 }
	 	 	 	 	 }
	 	 	 	 }
	 	 	 }
	 		 
	 		 return C;
	 	 }
	 
	 
}
