//brute force approach
/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int c0 = 0;
        int c1=  0;
        int c2 = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == 0) {
                c0++;
            }
            else if(temp.data == 1){
                c1++;
            }
            else{
                c2++;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(c0 > 0){
                temp.data = 0;
                c0--;
            }
            else if(c1 > 0){
                temp.data = 1;
                c1--;
            }
            else{
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }
        return head;
    }
}
