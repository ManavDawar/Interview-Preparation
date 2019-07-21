package trees;

public class LCABInary {

	public static class Node {

		int val;
		Node left;
		Node right;

		Node(int x) {
			val = x;
		}
	}

	static Node lca = null;

	public static boolean lca(Node node, int d1, int d2) {

		if (node == null) {
			return false;
		}

		boolean sf = false;
		if (node.val == d1 || node.val == d2) {
			sf = true;
		}
		boolean lf = lca != null || lca(node.left, d1, d2);
		boolean rf = lca != null || lca(node.right, d1, d2);

		if (lf && rf || sf && lf || sf && rf) {
			lca = lca == null ? node : lca;
		}

		return sf || lf || rf;
	}

}
