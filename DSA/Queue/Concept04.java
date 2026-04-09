// using a inbuild Queue in java


import java.util.*; 

public class Concept04{
    public static void main(String[] args){
       
       Queue<Integer> q = new LinkedList<>();  


       q.add(4);                //enqueue()
       System.out.println(q);  
       q.remove();              //dequeue() 
       System.out.println(q.peek()); 
       System.out.println(q.size()); 
       System.out.println(q.isEmpty()); 
    }
}