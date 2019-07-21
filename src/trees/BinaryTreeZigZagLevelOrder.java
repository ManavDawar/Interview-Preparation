package trees;
import java.io.IOException;
	 import java.util.*;

import trees.LCABInary.Node;
	 
	 class TreeNode {
	 	 TreeNode left, right;
	 	 int data;
	 
	 	 TreeNode(int d) {
	 	 	 data = d;
	 	 	 left = right = null;
	 	 }
	 
	 }
	 
	 class BinaryTree {
	 
	 	 public List<List<Integer>> zigzagLevelOrder(TreeNode node) {
	 	 
	 	 	 //Write your code here..
	 	      List<List<Integer>> list = new ArrayList<>();

	 			List<Integer> temp = new ArrayList<>();
	 			Stack<TreeNode> cs = new Stack<>();
	 			Stack<TreeNode> ns = new Stack<>();
	 			boolean flag = true;
	 			cs.add(node);

	 			while (cs.size() > 0) {
	 				TreeNode rem = cs.pop();
	 				temp.add(rem.data);
	 				if (flag) {
	 					if (rem.left != null) {
	 						ns.add(rem.left);
	 					}
	 					if (rem.right != null) {
	 						ns.add(rem.right);
	 					}
	 				} else {
	 				    
	 					if (rem.right != null) {
	 						ns.add(rem.right);
	 					}
	 					if (rem.left != null) {
	 						ns.add(rem.left);
	 					}
	 				}

	 				if (cs.size() == 0) {
	 					flag = !flag;
	 					list.add(temp);
	 					temp = new ArrayList<>();
	 					cs = ns;
	 					ns = new Stack<>();

	 				}
	 			}

	 			return list;
	 	 	 
	 	 }
	 
	 	 void inorder(TreeNode node) {
	 	 	 if (node == null)
	 	 	 	 return;
	 	 	 else
	 	 	 	 inorder(node.left);
	 	 	 System.out.print(node.data + " ");
	 	 	 inorder(node.right);
	 	 }
	 
	 }
	 

public class BinaryTreeZigZagLevelOrder {
		 
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
	 	 	 List<List<Integer>> res = bt.zigzagLevelOrder(root);
	 
	 	 	 System.out.println(res);
	 
	 	 }
	 
	 
}
