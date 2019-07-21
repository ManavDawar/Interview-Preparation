package trees;
import java.io.IOException;
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
	 
	  public List<Integer> boundaryOfBinaryTree(TreeNode root) {
	 	 	    List<Integer> ans = new LinkedList<Integer>();
	 	 	     
	 	 	     if(root == null) return ans;
	 	 	     
	 	 	     ans.add(root.data);
	 	 	     
	 	 	     leftBoundry(ans, root.left);
	 	 	     rightBoundry(ans, root.right);
	 	 	     
	 	 	     return ans;
	 	 	 }
	 
	 	 	 public void leftBoundry(List<Integer> ans,TreeNode root){
	 	 	     if(root == null) return;
	 	 	     
	 	 	     ans.add(root.data);
	 	 	     
	 	 	     if(root.left != null){
	 	 	          leftBoundry(ans, root.left);
	 	 	         bottomBoundry(ans, root.right);
	 	 	     }else{
	 	 	         leftBoundry(ans, root.right);
	 	 	     }
	 	 	     
	 	 	 }
	 
	 	 	 public void bottomBoundry(List<Integer> ans,TreeNode root){
	 	 	     if(root== null) return;
	 	 	     
	 	 	     // if its a leaf add it to ans
	 	 	     if(root.left == null && root.right == null){
	 	 	         ans.add(root.data);
	 	 	     }else{
	 	 	        bottomBoundry(ans, root.left);
	 	 	         bottomBoundry(ans, root.right);
	 	 	     }       
	 	 	 }
	 
	 	 	 public void rightBoundry(List<Integer> ans,TreeNode root){
	 	 	     if(root == null) return;
	 	 	     
	 	 	     if(root.right != null){
	 	 	          bottomBoundry(ans, root.left);
	 	 	          rightBoundry(ans, root.right);
	 	 	     }else{
	 	 	         rightBoundry(ans, root.left);
	 	 	     }
	 	 	     
	 	 	     ans.add(root.data); 
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
	 
	 public class Main {
	 
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
	 	 	 List<Integer> res = bt.boundaryOfBinaryTree(root);
	 	 	 System.out.println(res);
	 
	 	 }
	 
	 }
}
