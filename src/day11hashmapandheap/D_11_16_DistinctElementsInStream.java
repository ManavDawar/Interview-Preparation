package day11hashmapandheap;

import java.io.*;
import java.util.*;

public class D_11_16_DistinctElementsInStream {

	public static void print(String[] arr) throws IOException {
		// Write your code here
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(String s:arr) {
			String[] rem=s.split(" ");
			char oper= rem[0].charAt(0);
			int num=Integer.parseInt(rem[1]);
			if(oper=='A') {
				map.put(num, map.getOrDefault(num, 0)+1);
			}else {
				if(map.containsKey(num)) {
					map.put(num, map.get(num)-1);
					if(map.get(num)==0) {
						map.remove(num);
					}
				}
			}
			System.out.println(map.size());
		}

	}

	// Don't make any changes here
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		print(arr);

	}

}
