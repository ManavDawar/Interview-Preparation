package linkedList;

import java.util.Scanner;

public class SortingAbsoluteLL {

	 //---------------------------------------------------------------
    //This is a functional problem. Only this function has to be written.
    //You should return the head of node after sorting.
     public static Node sort(Node n) {
        Node prev=head;
        Node myhead=head;
        Node curr=head.next;
        
        while(curr!=null){
            if(curr.data<0){
                prev.next=curr.next;
                curr.next=myhead;
                myhead=curr;
               curr=prev.next;
            
            }else{
                prev=curr;
                curr=curr.next;
            }
            
        }
        
        return myhead;
    }
//------------------------------------------------------------------





    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);    
            
        int n = sc.nextInt();
        int a1 = sc.nextInt();

        insert(a1); // inserting first node

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            insert(a);
        }

        head = sort(head);
        display();

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

    public static void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data+" ");
        }
    }

}
