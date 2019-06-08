package linkedList;

import java.util.Scanner;

public class AddinCircularLinkedList {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list and X.
	// It should return the head of the modified list.

	public static Node insert(Node head, int insertdata) {
		// write your code here.

		Node ne = new Node(insertdata, null);
		if (head == null) {
			ne.next = ne;
			head = ne;
			return head;
		}

		Node prev = head;
		Node curr = head.next;

		boolean flag = true;
		while (prev.data <= curr.data) {

			if (insertdata <= curr.data) {
				prev.next = ne;
				ne.next = curr;
				flag = false;
			}

			prev = curr;
			curr = curr.next;
		}

		if (flag) {
			prev.next = ne;
			ne.next = curr;
			if (insertdata < curr.data) {
				head = ne;
			}
		}

		return head;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();
		head1 = addLast(head1, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			head1 = addLast(head1, a);
		}

		int data = sc.nextInt();
		head1 = insert(head1, data);

		if (checkCyclic(head1) && checkSorted(head1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	// Class declaration for a Node of the Linked List
	static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
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
	public static Node addLast(Node head, int data) {
		if (head == null) {
			Node nn = new Node(data, null);
			nn.next = nn;
			return nn;
		}

		Node curr = head;

		// go to tail
		while (curr.next != head) {
			curr = curr.next;
		}

		// add new node to next to tail and make new node's
		// next as head to maintain cyclic nature of linked list
		curr.next = new Node(data, head);
		return head;
	}

	public static boolean checkCyclic(Node head) {
		if (head == null) {
			return true;
		}

		Node curr = head;

		boolean result = false;
		while (curr.next != null && curr.next != head) {
			curr = curr.next;
		}
		if (curr.next == head) {
			result = true;
		}

		return result;
	}

	public static boolean checkSorted(Node head) {
		if (head == null) {
			return true;
		}

		Node curr = head;

		boolean result = true;
		while (curr.next != null && curr.next != head) {
			if (curr.data > curr.next.data) {
				return false;
			}
			curr = curr.next;
		}

		return result;
	}

	/*
	 * Input Parameters: head: head of the cyclic linked list in which is to be
	 * displayed.
	 * 
	 * Return Value: null
	 */
	public static void display(Node head) {

		if (head == null) {
			return;
		}

		Node curr = head;
		System.out.print(curr.data + " ");
		curr = curr.next;

		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

		System.out.println();
	}
}
