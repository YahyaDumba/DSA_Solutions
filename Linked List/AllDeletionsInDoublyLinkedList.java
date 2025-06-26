/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }
    Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null){
            return null;
        }
        int counter = 0;
        Node kNode = head;
        while(kNode!= null){
            counter++;
            if(counter == x) break;
            kNode = kNode.next;
        }
        Node prev = kNode.prev;
        Node front = kNode.next;
         if(prev==null && front==null){
         return null;
     }
     else if(prev==null){
         return deleteHead(head);
     }
     else if(front == null){
         return deleteTail(head);
     }
     prev.next = front;
     front.prev = prev;
     kNode.next = null;
     kNode.prev = null;
     return head;
    }
}
