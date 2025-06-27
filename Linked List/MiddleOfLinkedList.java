//Brute Force Approach
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int counter = 0;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        int midNode = (counter/2) + 1;
        temp = head;
        while(temp!=null){
            midNode = midNode - 1;
            if(midNode == 0)
            break;
            temp=temp.next;
        }
        return temp;
    }
}
