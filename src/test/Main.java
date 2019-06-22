package atest;

import java.util.Scanner;

class Main {

	static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		Node() {
		}
	};

	

	public static Node kSwap(Node head, int k) {
		Node x=null;
		Node y=null;
		Node xprev = null;
		Node yprev = head;

		Node curr = head;
		for (int i = 1; i < k && curr != null; i++) {
			xprev = curr;
			curr = curr.next;
		}
		x = curr;

		if (curr == null) {
			return null;
		}

		Node ptr = head;
		while (curr.next != null) {
			yprev = ptr;
			ptr = ptr.next;
			curr = curr.next;
		}
		y = ptr;

		if (x.next == y) {
			x.next = y.next;
			y.next = x;
			xprev.next = y;
		}

		else if (y.next == x) {
			y.next = x.next;
			x.next = y;
			yprev.next = x;
		}

		else if (x == head) {
			head = y;
			y.next = x.next;
			yprev.next = x;
			x.next = null;
		}

		else if (y == head) {
			head = x;
			x.next = y.next;
			xprev.next = y;
			y.next = null;
		}

		else {
			ptr = y.next;
			y.next = x.next;
			x.next = ptr;

			xprev.next = y;
			yprev.next = x;
		}

		return head;
	}
	
	public static void display(Node head) {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Node head = null;
		for (int i = arr.length - 1; i >= 0; i--) {
			head = new Node(arr[i], head);
		}
		head = kSwap(head, K);

		display(head);
	}
}