package trees;

import java.io.*;
import java.util.*;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		data = x;
	}
}

class BinaryTree {
	
	//------------------------------------2 methods-------------------------------
//	public TreeNode treeToDoublyList(TreeNode root) {
//		  
//	  	  head = null;
//	  	  prev = null;
//	  	  treeToDoublyList_(root);
//	  	  if (head != null) {
//	  	  	  prev.right = head;
//	  	  	  head.left = prev;
//	  	  }
//	  	  return head;
//
//	  }
//
//	  TreeNode prev = null;
//	  TreeNode head = null;
//
//	  public void treeToDoublyList_(TreeNode node) {
//	  	  if (node == null)
//	  	  	  return;
//
//	  	  TreeNode left = node.left;
//	  	  TreeNode right = node.right;
//
//	  	  treeToDoublyList_(left);
//	  	  if (head == null) {
//	  	  	  head = node;
//	  	  } else {
//	  	  	  prev.right = node;
//	  	  	  node.left = prev;
//	  	  }
//	  	  prev = node;
//
//	  	  treeToDoublyList_(right);
//
//	  }
	
	TreeNode head;

	public TreeNode treeToDoublyList(TreeNode root) {
		// Write your code here
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode temp = root;
		while (temp != null) {
			s.push(temp);
			temp = temp.left;
		}
		head = s.peek();
		TreeNode prev = null;
		while (!s.empty()) {
			TreeNode tmp = s.pop();
			if (tmp.right != null) {
				TreeNode tmp1 = tmp.right;
				while (tmp1 != null) {
					s.push(tmp1);
					tmp1 = tmp1.left;
				}
			}
			if (prev != null) {
				prev.right = tmp;
				tmp.left = prev;
			}
			prev = tmp;
		}
		head.left = prev;
		prev.right = head;
		return head;

	}

	// Don't make any changes here
	void displayCList(TreeNode head) {
		TreeNode itr = head;
		do {
			System.out.print(itr.data + " ");
			itr = itr.right;
		} while (head != itr);
		System.out.println();
		itr = itr.left;
		do {
			System.out.print(itr.data + " ");
			itr = itr.left;
		} while (head != itr);
		System.out.println(itr.data + " ");
	}

	public void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " ");

		inOrder(node.right);
	}

}

public class BinaryTreeToCDLL {

	public static TreeNode construct(Integer[] arr) {
		ArrayDeque<TreeNode> que = new ArrayDeque<>();
		TreeNode root = new TreeNode(arr[0]);
		que.addLast(root);
		int i = 1;
		while (!que.isEmpty() && i < arr.length) {
			TreeNode nn = que.removeFirst();

			if (i < arr.length && arr[i] != null) {
				TreeNode n = new TreeNode(arr[i]);
				nn.left = n;
				que.addLast(n);
			}
			i++;

			if (i < arr.length && arr[i] != null) {
				TreeNode n = new TreeNode(arr[i]);
				nn.right = n;
				que.addLast(n);
			}
			i++;
		}

		return root;
	}

	public static Integer[] inputSplitSpace(String str) {
		String[] sArr = str.split(" ");
		Integer[] arr = new Integer[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Integer[] ar = inputSplitSpace(str);
		TreeNode root = construct(ar);
		BinaryTree bt = new BinaryTree();
		TreeNode newRoot = bt.treeToDoublyList(root);
		bt.displayCList(newRoot);

	}

}
