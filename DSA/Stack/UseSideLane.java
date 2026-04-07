/**
 * Problem: Street Parade (Side Lane Ordering)
 * * Description:
 * There are 'n' trucks arriving in a random order, labeled 1 to n. 
 * They must exit the street in perfect ascending order (1, 2, 3...).
 * * Constraints:
 * 1. You have a "Side Lane" that acts as a Stack (Last-In, First-Out).
 * 2. Trucks can move from the entrance to the Side Lane OR to the Exit.
 * 3. Once a truck is in the Side Lane, it can only move to the Exit.
 * 4. If a truck in the Side Lane blocks a smaller truck that needs to pass, 
 * the ordering is impossible.
 * * Goal:
 * Determine if the trucks can be rearranged into the order 1, 2, ..., n.
 * Output "yes" if possible, otherwise "no".
 */


import java.util.*; 

public class UseSideLane{
    
    public static void main(String[] args){
    
    int[] arr =  {5,1,2,4,3};  
   int n = arr.length;

    Stack <Integer> sidelane = new Stack<>(); 
    int i=0;
    int expected = 1; 

    while(i<n){
     int currEl = arr[i];

       if((!sidelane.isEmpty()) && (sidelane.peek() == expected)){
        sidelane.pop(); 
        expected++; 
       }
     else if(currEl == expected){
        i++; 
        expected++;  
          }
      else if(!sidelane.isEmpty() && sidelane.peek() < currEl  ){
        System.out.println("No"); 
        return; 
    }else{
        sidelane.push(currEl); 
        i++; 
    }
    }

    //expected =? 4 
    //stack = ?[5,4] 

 
     while(!sidelane.isEmpty() && sidelane.peek()==expected ){
       sidelane.pop(); 
       expected++; 
     }  


     if(!sidelane.isEmpty()){
        System.out.println("No"); 
        return ; 
     }else{
        System.out.println("Yes"); 
        return ; 
     }



    }

}


