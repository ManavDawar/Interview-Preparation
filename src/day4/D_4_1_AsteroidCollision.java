package day4;

import java.util.*;
import java.io.*;

public class D_4_1_AsteroidCollision {

	public static int[] asteroidCollision(int[] asteroids) {
		// Write your code
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<asteroids.length;i++) {
			int ast=asteroids[i];
			
			condition:{
				while(!st.isEmpty()&&ast<0&&st.peek()>0) {
					if(st.peek()<Math.abs(ast)) {
						st.pop();
						continue;
					}else if(st.peek()==Math.abs(ast)) {
						st.pop();
					}
					break condition;
				}
				st.push(ast);
			}
		}
		int[] res= new int[st.size()];
		for(int i=res.length-1;i>=0;i--) {
			res[i]=st.pop();
		}
		return res;
	}

	// Dont make changes
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ast[] = new int[n];
		for (int i = 0; i < n; i++)
			ast[i] = sc.nextInt();
		int res[] = asteroidCollision(ast);
		for (int v : res) {
			System.out.println(v);
		}

	}
}
