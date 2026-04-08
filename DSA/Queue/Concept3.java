//CircularQueue...

import java.util.*; 
  
      
   class SequentialCircularQueue {
              int[] q ; 
              int  n ; 
              int  rear ; 
              int  front; 
              int  size ;        
                //constructor...
                SequentialCircularQueue(int n){
                  this.n = n;  
                  this.q =new int[n] ; 
                  this.rear  = -1;
                  this.front =  0 ;  
                  this.size =   0; 
                }
//enqueue...
        public Boolean enqueue(int el){
                     if(isFull()){
                        System.out.println("Queue Overload"); 
                        return false; 
                     }
                   size++; 
                   rear  = (rear+1)%n ;   //only this ...
                   q[rear] = el; 
                   return true; 
        }
//deque
           public int dequeue(){
                    if(isEmpty()){
                        System.out.println("Empty.."); 
                        return -1; 
                     }
                  size--;      
                  int PopEl = q[front] ; 
                  front = (front+1)  %  n;   //only this ... 
                  return PopEl ; 
           } 
            public int peek(){
                    if(isEmpty()) {return -1 ; } 
                       return q[front];
                }
           
           public Boolean isEmpty(){  return size == 0;  }
           public Boolean isFull(){return size == n ; }
           public int size(){return size;}
}


   public class Concept3{
    public static void main(String[] args){

          SequentialCircularQueue q = new SequentialCircularQueue(6);
          System.out.println(q.dequeue()); //-1
          q.enqueue(1); 
          q.enqueue(2); 
          q.enqueue(3); 
          q.enqueue(4); 
          q.enqueue(5); 
          q.enqueue(6); 
          q.enqueue(8);  //queue Overload
          System.out.println(q.dequeue());  //1
          q.enqueue(7);
    System.out.println(q.size()); //6 
           System.out.println(q.dequeue()); //2
           System.out.println(q.dequeue()); //3
           System.out.println(q.dequeue()); //4
           System.out.println(q.dequeue()); //5
           System.out.println(q.dequeue()); //6
           System.out.println(q.dequeue());  //7
           System.out.println(q.dequeue());  // -1
           System.out.println(q.size());  // 0
           System.out.println(q.peek());  // -1

    }
   }














