import java.util.*;

class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val= val;
        this.next = null;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
class Solution{
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of nodes: ");
        int  n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node current = head;
        for(int i=1;i<n;i++){
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        displayNode(head);
        Solution sol = new Solution();
        Node middle = sol.middleNode(head);
        System.out.print("The middle node: "+ middle.val);
        System.out.println();
    }
    public static void displayNode(Node head){
            Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.val+" ->");
                tmp = tmp.next;
            }
            System.out.print(" null");
            System.out.println();
        }
}
