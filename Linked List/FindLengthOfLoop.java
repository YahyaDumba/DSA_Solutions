/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public static int findLength(Node slow, Node fast){
        int counter = 1;
        fast = fast.next;
        while(slow!=fast){
            counter++;
            fast=fast.next;
        }
        return counter;
    }
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(fast == slow){
               return findLength(slow,fast);
            }
        }
        return 0;
    }
}
