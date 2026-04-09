“Queue in Java is an interface implemented by classes like LinkedList, while Stack is a legacy class (“Legacy class means old, still usable, but better alternatives exist.”) based on Vector; modern code prefers using Deque (ArrayDeque) instead of Stack.”
{
https://www.masaischool.com/blog/queue-data-structure-types-applications-javascript-implementation/
}


Queue ADT : -> 

*Operations-> {Enqueue() , Dequeue() , Peek() ,isEmpty(), isFull() }

*Implementations :->

Array = fixed size →  queue can only store a limited number of elements.
      =>{Sequential Allocation}

LinkedList = dynamic nodes → can store/organize an unlimited number of 
             elements. 
      =>{Linkedlist Allocation}

*Types :-> {
             SimpleQueue  
             CircularQueue or RingBuffer
             PriorityQueue 
             DoubleEndedQueue 
            }

*Applications :-> {
                   CPU Job_Scheduling 
                   Traffic System 
                   In Networks : Routers and printers
                              in mail scheduling

                 } 
                 

// Queue in java : using linked list      
//  Queue <Integer> q =new LinkedList<>();  
//  enqueue ==> q.add();  
//  dequeue=>>q.remove(); 


