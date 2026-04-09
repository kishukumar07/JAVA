//Goal :  Implement a Queue ADT using Two Stacks:

/*
          Dryrun    
              Q : <-abc<-
             St1: [   
             St2: [          
*/   

/*Algo1 -: 
             ---------------
             enqueue(): O(1) 
             ---------------
             *push element to stack1. 
             ---------------
             dequeue() :O(N)
             ----------------
             *stack1 to stack 2 {ConpleteElementTransfer}
              *pop from Stack 2 {dequeue}
             *stack2 to stack 1 {CompleteElementTransfer}
      */            


/*Algo2 -:
           --------------
           enque() : O(N)
           --------------
             *Stack2->stack1{CompleteElementTransfer}
             *pushElment -> stack1 {enqueue()}
             *Stack2 ->stack1{CompleteElementTransfer}

           --------------  
           dequeue() :O(1)
           -------------- 
               pop from stack2 {dequeue()}

*/





import java.util.*; 


//for algo1.
 class QueueUsingStacks{
        Stack<Integer> st1; 
        Stack<Integer> st2; 
     public QueueUsingStacks(){
          this.st1 =  new Stack<>(); 
          this. st2 = new Stack<>(); 
        }
    public Boolean enqueue(int el){
        
        st1.push(el); 
        return true; 
           }

    public int dequeue(){
          if(st1.isEmpty()){
            System.out.println("Queue is Empty"); 
            return -1; 
          }

         while(!st1.isEmpty()){
            st2.push(st1.pop()); 
         }
         
         int dequedEl = st2.pop();

         while(!st2.isEmpty()){
            st1.push(st2.pop()); 
         }

        return dequedEl; 
    }

  public int peek(){
            if(st1.isEmpty()){
            System.out.println("Queue is Empty"); 
            return -1; 
          }

         while(!st1.isEmpty()){
            st2.push(st1.pop()); 
         }
         
         int topEl = st2.peek();

         while(!st2.isEmpty()){
            st1.push(st2.pop()); 
         }

        return topEl;    
  }


    public Boolean isEmpty(){
              if(st1.size()==0){
                return true; 
              }
              return false; 
    }

  public int size(){
  
    return st1.size(); 
  
  }

  
}


//for algo2.
class QueueUsingStackalgoTwo {
     Stack<Integer> st1 ; 
    Stack<Integer>  st2 ; 

    public QueueUsingStackalgoTwo(){
             this.st1= new Stack<>(); 
             this.st2 = new Stack<>(); 
    } 
//enqueue
    public Boolean enqueue(int el ){

    while(!st2.isEmpty()){
        st1.push(st2.pop()); 
    }
    
    st1.push(el); 

    while(!st1.isEmpty()){
        st2.push(st1.pop()); 
    }
    return true; 
    }

//dequeue
   public int dequeue(){
    if(st2.isEmpty()){
        System.out.println("empty"); 
        return -1; 
    }

   int dequeuedEl = st2.pop(); 
   return dequeuedEl; 
   }
//peek 
   public int peek(){
     if(st2.isEmpty()){
        System.out.println("Empty"); 
        return -1; 
     }
     return st2.peek(); 
   }


//size
public int size(){
    return st2.size(); 
}
//isEmpty
public Boolean isEmpty(){
    return st2.isEmpty(); 
}

}



public class QueueUsingTwoStacks{
    public static void main(String[] args){
    
    //form algo1... 
      QueueUsingStacks q= new QueueUsingStacks(); 
            System.out.println(q.dequeue()); 
              q.enqueue(3); 
              q.enqueue(53);
              q.enqueue(5);
              System.out.println(q.dequeue()); 
              System.out.println(q.isEmpty()); 
              System.out.println(q.size()); 
              System.out.println(q.peek()); 

   //from algo2... 
      QueueUsingStackalgoTwo q2 = new QueueUsingStackalgoTwo(); 
      System.out.println(q2.dequeue()); 
              q2.enqueue(3); 
              q2.enqueue(53);
              q2.enqueue(5);
              System.out.println(q2.dequeue()); 
              System.out.println(q2.isEmpty()); 
              System.out.println(q2.size()); 
              System.out.println(q2.peek()); 
              
    }
}


