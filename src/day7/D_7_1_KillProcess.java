package day7;

import java.util.*;

public class D_7_1_KillProcess {

	public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();

		for (int i = 0; i < pid.size(); i++) {
			ArrayList<Integer> children = tree.getOrDefault(ppid.get(i), new ArrayList<>());
			children.add(pid.get(i));
			tree.put(ppid.get(i), children);
		}
		List<Integer> ans = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		st.push(kill);

		while (st.size() > 0) {
			Integer curr = st.pop();
			ans.add(curr);
			for (Integer child : tree.getOrDefault(curr, new ArrayList<>())) {
				st.add(child);
			}

		}

		return ans;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> pid = new ArrayList<>(n);
		List<Integer> ppid = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			pid.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			ppid.add(sc.nextInt());
		}
		List<Integer> res = killProcess(pid, ppid, k);
		Collections.sort(res);
		System.out.println(res);
	}
}
