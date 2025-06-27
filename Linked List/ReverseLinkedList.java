/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null || head.next == null){
            return head;
        }
        DLLNode prev = null;
        DLLNode current = head;
        while(current!=null){
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;    
            
            current =current.prev;
            
        }
        return prev.prev;
    }
}


//Iterative Approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode temp = head;
     ListNode prev = null;
     while(temp!=null){
       ListNode front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
     }   
     return prev;
    }
}





