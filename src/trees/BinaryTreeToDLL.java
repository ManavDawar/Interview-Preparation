package trees;

import java.io.*;
import java.util.*;
class TreeNode {
	 	 TreeNode left, right;
	 	 int data;

	 	 TreeNode(int d) {
	 	 	 data = d;
	 	 	 left = right = null;
	 	 }

	 }


class BinaryTree {

	TreeNode head;

	public class Pair {
		TreeNode head;
		TreeNode tail;
	}

	public TreeNode BT2DLL(TreeNode root) {

		// Write your code here......
		Pair ans = BT2DLLHelper(root);
		return ans.head;

	}

	private Pair BT2DLLHelper(TreeNode node) {
		if(node.left==null&&node.right==null) {
		    Pair np=new Pair();
		    np.head=node;
		    np.tail=node;
			return np;
		}
		
		Pair lp=BT2DLLHelper(node.left);
		Pair rp=BT2DLLHelper(node.right);
		
		lp.tail.right=node;
		node.left=lp.tail;
		node.right=rp.head;
		rp.head.left=node;
		
		Pair mp=new Pair();
		mp.head=lp.head;
		mp.tail=rp.tail;
		
		return mp;
		
	}
	 
	 void inorder(TreeNode node)
	 {
	 	 if(node==null)
	 	 	 return ;
	 	 else
	 	 	 inorder(node.left);
	 	 	 System.out.print(node.data + " ");
	 	 	 inorder(node.right);
	 }
	 void printList(TreeNode head) 
    {
	 	 TreeNode prev = head;
        while (head != null) 
        {
            System.out.print(head.data + " ");
	 	 	 prev = head;
            head = head.right;
        }
	 	 
	 	 System.out.println();
	 	 while(prev != null)
	 	 {
	 	 	 System.out.print(prev.data+" ");
	 	 	 prev = prev.left;
	 	 }
    }
	 
	 
}

public class BinaryTreeToDLL{
	 
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

	 	 BinaryTree bt=new BinaryTree();
	 	 TreeNode newRoot=bt.BT2DLL(root);
	 	 
	 	 bt.printList(newRoot);
	 	 
	 	 
//	 	 String out = String.valueOf(ret);

//	 	 System.out.print(out);
	 }

	 
	 
	 
}