package linkedList;

import java.util.Scanner;

public class DetectCircularList {

	
    // ---------------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // return true if linkedlist is circular else return false
 	 public static boolean checkcircular(Node n) {
 	 	 Node myhead=n;
 	 	 
 	 	 while(myhead!=null){
 	 	     myhead=myhead.next;
 	 	     if(myhead==n){
 	 	         return true;
 	 	     }
 	 	     
 	 	 }
 	 	 
 	 	 return false;
 	 }
 	 public static void main(String[] args) {
 	 	 Scanner sc = new Scanner(System.in);
 	 	 int n = sc.nextInt();
 	 	 int s=sc.nextInt();
 	 	 int a1 = sc.nextInt();
 	 	 insert(a1);
 
 	 	 for (int i = 1; i < n; i++) {
 	 	 	 int a = sc.nextInt();
 	 	 	 insert(a);
 	 	 }
 	 	 if(s==1&&n>0){
 	 	 	 tail.next=head;
 	 	 }
 	 	 System.out.println(checkcircular(head));
 	 	 
 	 }
 
 	 private static class Node {
 	 	 int data;
 	 	 Node next;
 
 	 	 public Node(int data, Node next) {
 	 	 	 this.data = data;
 	 	 	 this.next = next;
 	 	 }
 
 	 }
 
 	 static Node head;
 	 static Node tail;
 	 static int size;
 	 
 	 public static void insert(int data) {
 
 	 	 Node nn = new Node(data, null);
 	 	 if (head == null) {
 	 	 	 head = nn;
 	 	 	 tail = nn;
 	 	 } else {
 	 	 	 tail.next = nn;
 	 	 	 tail = nn;
 	 	 }
 	 	 size++;
 	 }
 
 	 public static void display(Node n) {
 	 	 for (Node node = n; node != null; node = node.next) {
 	 	 	 System.out.print(node.data + " ");
 	 	 }
 	 }
 
}
