/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    int size = 0;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode temp = new QueueNode (a);
        if(front == null){
            front = rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
        size = size+1;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null) return -1;
        
           int temp = front.data;
            front = front.next;
            size = size - 1;
            return temp;
	}
}
