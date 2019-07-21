package trees;

public class MorrisTraversal {

	public static class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void morristraversal(TreeNode root) {
		TreeNode node = root;
		while (node != null) {
			if (node.left == null) {
				System.out.println(node.val);
				node = node.right;
			} else {
				TreeNode lkarm = LeftKaRightMost(node);
				if (lkarm.right == null) {
					lkarm.right = node;
					node = node.left;
				} else if (lkarm.right == node) {
					lkarm.right = null;
					System.out.println(node.val);
					node = node.right;
				}
			}
		}
	}

	private static TreeNode LeftKaRightMost(TreeNode node) {
		TreeNode lkarm = node;
		while (lkarm.right != null || lkarm.right != node) {
			lkarm = lkarm.right;
		}

		return lkarm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
