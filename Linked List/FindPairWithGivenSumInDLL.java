/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static  Node findtail(Node head){
        Node tail = head;
        while(tail.next !=null) tail = tail.next;
        return tail;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(head == null) return ans;
        Node left = head;
        Node right = findtail(head);
        while(left.data < right.data && left!=null && right!=null && left!=right){
            if(left.data + right.data == target){
                ans.add(new ArrayList<>(Arrays.asList(left.data,right.data)));
               left = left.next;
               right = right.prev;
            }
            else if(left.data + right.data < target){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return ans;
        
    }
}
