package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printBinaries {

	
	public static class Helper{
		String bin;
		int data;
		
		Helper(int data,String bin){
			this.data=data;
			this.bin=bin;
		}
		
	}
	public static void getBinary(int n) {

		LinkedList<Helper> queue = new LinkedList<>();
		Helper p = new Helper(1,"1");
		
		queue.add(p);
		
		while(queue.size()>0) {
			
			Helper rem = queue.remove();
			System.out.print(rem.bin+" ");
			
			Helper left = new Helper(2*rem.data,rem.bin+"0");
			Helper right = new Helper(2*rem.data+1,rem.bin+"1");
			
			if(left.data<=n) {
				queue.addLast(left);
			}
			if(right.data<=n) {
				queue.addLast(right);
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		getBinary(n);

	}

}
