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

//optimized approach
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
        if(head==null || head.next==null){
            return head;
        }
        Node zerohead= new Node(-1);
        Node onehead = new Node(-1);
        Node twohead = new Node(-1);
        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zero.next = temp;
                zero=zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp=temp.next;
        }
        zero.next = (onehead.next != null) ? (onehead.next) : (twohead.next);
        one.next = twohead.next;
        two.next = null;
        
        Node newhead = zerohead.next;
     return newhead;   
    }
}
