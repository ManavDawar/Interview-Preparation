package day8hashmapnheap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_8_5_FindDuplicate {

	public static ArrayList<ArrayList<String>> findDuplicate(String[] paths) {

		// write your code here
		TreeMap<String, ArrayList<String>> map = new TreeMap<>();

		for (String path : paths) {

			String[] values = path.split(" ");

			for (int i = 1; i < values.length; i++) {

				String[] name_cont = values[i].split("\\("); // creating
				name_cont[1] = name_cont[1].replace(")", ""); // content

				ArrayList<String> list = map.getOrDefault(name_cont[1], new ArrayList<String>());
				list.add(values[0] + "/" + name_cont[0]); // paths
				map.put(name_cont[1], list);

			}
		}

		ArrayList<ArrayList<String>> res = new ArrayList<>();
		for (String key : map.keySet()) {
			if (map.get(key).size() > 1)
				res.add(map.get(key));
		}
		return res;

	}

	// -----------------------------------------------------

	public static void main(String[] args) throws NumberFormatException, IOException {
<<<<<<< HEAD

		String res="abc(f(DSAD(DS(D(D";
		String[] name_cont = res.split("(");
		
		for (int i = 0; i < name_cont.length; i++) {
			System.out.println(name_cont[i]);
			
		}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String[] paths = new String[n];
//
//		for (int i = 0; i < n; i++) {
//			paths[i] = br.readLine();
//		}
//		ArrayList<ArrayList<String>> ans = findDuplicate(paths);
//		for (ArrayList<String> val : ans) {
//			Collections.sort(val);
//		}
//
//		for (ArrayList<String> val : ans) {
//			System.out.println(val);
//		}
=======
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] paths = new String[n];

		for (int i = 0; i < n; i++) {
			paths[i] = br.readLine();
		}
		ArrayList<ArrayList<String>> ans = findDuplicate(paths);
		for (ArrayList<String> val : ans) {
			Collections.sort(val);
		}

		for (ArrayList<String> val : ans) {
			System.out.println(val);
		}
>>>>>>> 38cd596280e1df86a48c4d4ebe37724363a439d6
	}

}
