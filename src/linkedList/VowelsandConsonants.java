package linkedList;

import java.util.*;

public class VowelsandConsonants {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char h = sc.next().charAt(0);
		insert(h);

		for (int i = 1; i < n; i++) {
			char ch = sc.next().charAt(0);
			insert(ch);
		}

		head = arcv(head);
		display();

	}

	// ---------------------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function should return the head of node after sorting.
	public static Node arcv(Node head) {
		Node vh = null;
		Node vt = null;
		Node ch = null;
		Node ct = null;

		while (head != null) {
			if (head.data == 'a' || head.data == 'e' || head.data == 'i' || head.data == 'o' || head.data == 'u') {
				if (vh == null) {
					vh = vt = head;
				} else {
					vt.next = head;
					vt = vt.next;
				}
			} else {
				if (ch == null) {
					ch = ct = head;
				} else {
					ct.next = head;
					ct = ct.next;
				}
			}

			head = head.next;
		}

		ct.next = null;
		if (vh == null) {
			return ch;
		}
		vt.next = ch;

		return vh;
	}
	// ------------------------------------------------------------------

	private static class Node {
		char data;
		Node next;

		public Node(char data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	static Node head;
	static Node tail;
	static int size;

	public static void insert(char data) {

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

	public static void display() {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}
}
