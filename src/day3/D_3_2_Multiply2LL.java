package day3;

import java.util.*;

public class D_3_2_Multiply2LL {

	// -----------------------------------------------------
	// This is a functional problem. You have to complete this function.
	// It takes as input the head of the two lists.
	// It returns the product of two lists.
	public static long multiplyTwoLists(Node one, Node two) {
		// write your code here.
		rpi(one);
		rpi(two);

		Node m = null;
		int zeroes = 0;

		for (Node n1 = one; n1 != null; n1 = n1.next) {
			Node sm = null;
			Node smt = null;
			int carry = 0;
			Node temp=two;

			for (int i = 0; i < zeroes; i++) {
				addLast(sm, smt, 0);
			}

			for (Node n2 = two; n2 != null; n2 = n2.next) {
				int data = n2.data * n1.data + carry;
				int digit = data % 10;
				carry = data / 10;
				temp=temp.next;
				addLast(sm, smt, digit);
			}
			

		}

	}

	// -----------------------------------------------------

	public static void rpi(Node one) {

		Node curr = one;
		Node prev = null;
		Node next = curr.next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
	}

	static Node head1;

	static Node head2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();

		Node tail;
		head1 = tail = insert(null, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			tail = insert(tail, a);
		}

		int n2 = sc.nextInt();
		int a2 = sc.nextInt();

		head2 = tail = insert(null, a2);

		for (int i = 1; i < n2; i++) {
			int a = sc.nextInt();
			tail = insert(tail, a);
		}

		System.out.println(multiplyTwoLists(head1, head2));

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

	/*
	 * Input Parameters: tail: head of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: tail of the linked list/the node that is inserted
	 */
	public static Node insert(Node tail, int data) {

		if (tail == null) {
			return new Node(data);
		}

		Node nn = new Node(data);
		tail.next = nn;
		return nn;
	}

	public static void addLast(Node head, Node tail, int data) {
		Node nn = new Node(data);

		if (head == null) {
			head = tail = nn;
			nn.next = null;

		}
		tail.next = nn;
		nn.next = null;
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
