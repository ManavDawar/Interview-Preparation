package day7;

import java.util.*;

public class D_7_2_FunctionTime {

	public static class Helper {

		int pid;
		int ws;// when started
		int nmt;// not my time

		public Helper(int pid, int ws, int nmt) {
			this.pid = pid;
			this.ws = ws;
			this.nmt = nmt;
		}

	}

	public static int[] exclusiveTime(int n, List<String> logs) {
		// Write your code here
		int[] ans = new int[n];
		Stack<Helper> stack = new Stack<>();
		int prev = -1;
		for (int i = 0; i < logs.size(); i++) {
			String[] str = logs.get(i).split(":", -1);
			int id = Integer.parseInt(str[0]);
			boolean status = str[1].equals("start") ? true : false;
			int t = Integer.parseInt(str[2]);

			if (status) {
				stack.push(new Helper(id, t, 0));
			} else {
				if (stack.peek().pid == id) {
					Helper rem = stack.pop();
					ans[id] += t - rem.ws + 1 - rem.nmt;
					if(stack.size()>0) {
					stack.peek().nmt += t - rem.ws + 1;}
				}
			}
		}
		return ans;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int L = sc.nextInt();
		List<String> logs = new ArrayList<>(L);
		for (int i = 0; i < L; i++) {
			logs.add(sc.next());
		}
		int[] res = exclusiveTime(n, logs);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
