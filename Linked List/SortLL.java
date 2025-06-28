//bruteforce approach
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
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) return head;
       List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
       int i=0;
        temp = head;
        while(temp!=null){
            temp.val=arr.get(i++);
            // i=i+1;
            temp = temp.next;
        }
        return head;
    }
}

//Optimal Approach
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
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=list1;
                list1=list1.next;
            }
            else{
                temp.next= list2;
                temp=list2;
                list2=list2.next;
            }
        }
        if(list1!=null) temp.next=list1;
        else temp.next = list2;
        return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left= head;

        left = sortList(left);
        right = sortList(right);
        return mergeTwoLists(left,right);
    }
}
