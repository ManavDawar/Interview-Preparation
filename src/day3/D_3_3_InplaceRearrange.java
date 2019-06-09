package day3;

import java.util.Scanner;

public class D_3_3_InplaceRearrange {
	 // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the linked list.
    // It should return the head of the rearranged list.
    
    
    public static Node rearrange(Node node) {
         Node slow = node;
         Node fast = slow.next; 
       while (fast != null && fast.next != null) { 
           slow = slow.next; 
           fast = fast.next.next; 
       } 
 
       Node node1 = node; 
       Node node2 = slow.next; 
       slow.next = null; 
 
       node2 = reverselist(node2); 
 
       node = new Node(0); // Assign dummy Node 
       Node curr = node; 
       
       while (node1 != null || node2 != null) { 
 
           if (node1 != null) { 
               curr.next = node1; 
               curr = curr.next; 
               node1 = node1.next; 
           } 
 
           if (node2 != null) { 
               curr.next = node2; 
               curr = curr.next; 
               node2 = node2.next; 
           } 
       } 
 
       // Assign the head of the new list to head pointer 
       node = node.next; 
       return node;
 
    }

    //
    public static Node reverselist(Node node) { 
       Node prev = null, curr = node, next; 
       while (curr != null) { 
           next = curr.next; 
           curr.next = prev; 
           prev = curr; 
           curr = next; 
       } 
       node = prev; 
       return node; 
   } 

    // -----------------------------------------------------

    static Node head1;

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

        head1 = rearrange(head1);
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

    /*
     * Input Parameters: tail: head of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
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

    /*
     * Input Parameters: head: head of the linked list in which is to be
     * displayed.
     * 
     * Return Value: null
     */
    public static void display(Node head) {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
    }

}
