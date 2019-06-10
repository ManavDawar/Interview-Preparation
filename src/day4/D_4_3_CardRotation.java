package day4;
import java.util.*;
import java.lang.*;
import java.io.*;


public class D_4_3_CardRotation {
	
	     public static void cardRotation(int N) {
	         // Write your code here
	         LinkedList<Integer> queue=new LinkedList<>();
	         for(int i=0;i<N;i++){
	             queue.addLast(i);
	         }
	         
	         int [] res= new int[N];
	         int i=1;
	         while(queue.size()>0&&i<=N){
	             
	             for(int j =0;j<i;j++){
	                 queue.addLast(queue.removeFirst());
	             }
	             res[queue.removeFirst()]=i;
	             
	             i++;
	         }
	         
	        for(int j=0;j<N;j++)System.out.print(res[j]+" ");
	 
	     }
	 
	     // Dont make changes here
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int N = sc.nextInt();
	         cardRotation(N);
	     }
	 
	 
}
