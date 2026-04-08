//QueueImplementation using array[] ...
class SequentialQueue {
    int[] q;
    int n;
    int rear;
    int front;

    // Constructor
    public SequentialQueue(int n) {
        this.n = n;
        this.q = new int[n];
        this.rear = -1;
        this.front = 0;
    }

    public void enqueue(int el) {
        if (rear == n - 1) {
            System.out.println("Queue is full...");
            return;
        }
        q[++rear] = el;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
            return -1;
        }
        return q[front++];
    }
   
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return q[front];
    }
}

public class Concept02 {
    public static void main(String[] args) {
        SequentialQueue qu = new SequentialQueue(6);
        qu.enqueue(6);
        qu.enqueue(2);
        qu.enqueue(5);
        qu.enqueue(1);
        qu.enqueue(3);
        System.out.println("Dequeued: " + qu.dequeue());
        System.out.println("Front element: " + qu.peek());      
    }
}




