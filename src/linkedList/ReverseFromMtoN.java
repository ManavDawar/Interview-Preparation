package linkedList;

import java.util.Scanner;

public class ReverseFromMtoN {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list, m and n.
	// It should return the head of the modified list.

	public static Node reverseBetween(Node head, int m, int n) {
		// write your code here
		if (n - m == 0) {
			return head;
		}
		if (head == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;

		for (int i = 1; i < m; i++) {
			prev = curr;
			curr = curr.next;
		}
		Node old = prev;
		Node new1 = curr;
		prev = curr;
		curr = curr.next;

		for (int i = 0; i < n - m; i++) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		if (old != null) {
			old.next = prev;
		} else {
			head = prev;
		}
		new1.next = curr;

		return head;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();
		head1 = insert(head1, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			head1 = insert(head1, a);
		}

		int m = sc.nextInt();
		int n = sc.nextInt();
		head1 = reverseBetween(head1, m, n);
		display(head1);

	}

	// Class declaration for a Node of the Linked List
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static Node head1;

	static Node head2;

	static Node head3;

	/*
	 * Input Parameters: head: head of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: head of the linked list in which the node is inserted
	 */
	public static Node insert(Node head, int data) {

		if (head == null) {
			return new Node(data);
		}

		head.next = insert(head.next, data);
		return head;
	}

	/*
	 * Input Parameters: head: head of the linked list in which is to be displayed.
	 * 
	 * Return Value: null
	 */
	public static void display(Node head) {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}

}
