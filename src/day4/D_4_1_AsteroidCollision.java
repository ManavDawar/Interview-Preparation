package day4;

import java.util.*;
import java.io.*;

public class D_4_1_AsteroidCollision {

	public static int[] asteroidCollision(int[] asteroids) {
		// Write your code
		int len = asteroids.length;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < len; i++) {
			if (asteroids[i] < 0) {

				if (stack.isEmpty()) {
					stack.push(asteroids[i]);
				} else {
					if (stack.peek() < 0) {
						stack.push(asteroids[i]);
					} else {
						while (!stack.isEmpty()) {

							int goRight = stack.pop();
							if (goRight < Math.abs(asteroids[i])) {

							} else if (goRight == Math.abs(asteroids[i])) {
								i++;
								break;
							} else {
								stack.push(goRight);
								i++;
								break;
							}

						}
						i--;
					}

				}

			} else {
				stack.push(asteroids[i]);
			}
		}
		int[] res = new int[stack.size()];
		for (int i = res.length - 1; i >= 0; i--) {
			res[i] = stack.pop();
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
