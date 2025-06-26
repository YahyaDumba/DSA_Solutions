 Node deleteHead(Node head){
        if(head == null || head.next==null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
}
    Node deleteTail(Node head){
        if(head==null || head.next == null){
            return null;
        }
        Node tail = head;
        whle(tail.next !=null){
            tail=tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }
    Node deleteK(Node head, int k) {
        // Your code here
     if(head == null){
         return null;
     }   
     int count = 0;
     Node kNode = head;
     while(kNode != null){
         count++;
         if(count == k) break;
         kNode = kNode.kNode.next;
     }
     Node prev = kNode.back;
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
     front.back = prev;
     kNode.next = null;
     kNode.prev = null;
     return head;
    }
