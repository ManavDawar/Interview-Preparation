package day10hashmapandheap;

import java.util.HashMap;
import java.util.Scanner;

public class D_10_3_MaxPointsOnLine {

	public static int maxPoints(Point[] points) {
		// Write your code here
		if (points == null) {
			return 0;
		} else if (points.length == 2) {
			return 2;
		}
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<Integer, HashMap<Integer, Integer>>();
		int result = 0;

		for (int i = 0; i < points.length; i++) {
			int overlap = 0;
			int max = 0;
			map.clear();
			for (int j = i + 1; j < points.length; j++) {
				int x = points[j].x - points[i].x;
				int y = points[j].y - points[i].y;

				if (x == 0 && y == 0) {
					overlap++;
					continue;
				}

				int gcd = gcd(x, y);

				if (gcd != 0) {
					x /= gcd;
					y /= gcd;
				}

				if (map.containsKey(x)) {
					if (map.get(x).containsKey(y)) {
						map.get(x).put(y, map.get(x).get(y) + 1);
					} else {
						map.get(x).put(y, 1);
					}
				} else {
					HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
					m.put(y, 1);
					map.put(x, m);
				}
				max = Math.max(max, map.get(x).get(y));
			}
			result = Math.max(result, max + overlap + 1);
		}
		return result;

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else
			return gcd(b, a % b);
	}

	static class Point {

		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Point[] points = new Point[N];
		for (int i = 0; i < N; i++) {
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		System.out.println(maxPoints(points));
	}

}
