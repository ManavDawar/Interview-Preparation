package linkedList;

import java.util.Scanner;

public class ZigZag {
	
    
    // ---------------------------------------------------------------
    // This is a functional problem. Only this function has to be written.
 public static void fashion(Node head){
        // write your code here
        Node prev;
        Node curr;
        boolean greater=true;
        
        if(head==null){
            return;
        }else{
            prev=head;
            if(prev.next==null){
                return;
            }else{
                prev=head;
                curr=prev.next;
            }
        }
        
        while(curr!=null){
            if(greater){
                if(curr.data<prev.data){
                   int temp =curr.data;
                   curr.data=prev.data;
                   prev.data=temp;
                }   
            }else{
                if(prev.data<curr.data){
                    int temp =curr.data;
                   curr.data=prev.data;
                   prev.data=temp;
                }
            }
            
            greater=!greater;
            prev=curr;
            curr=curr.next;
        }
        
        
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = sc.nextInt();
        insert(a1);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            insert(a);
        }

        fashion(head);
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
            System.out.print(node.data + " ");
        }
    }

}
