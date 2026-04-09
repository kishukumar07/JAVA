//Goal :  Implement a Stack ADT using Two Queue -:

/*
          Dryrun    
              st : [abc]<->
              q1: <-<-   
              q2: <-<-          
*/   

/*Algo1 -: 
             ---------------
             push(): O(1) 
             ---------------
           *enqueue el in st1 
             
             ---------------
             pop() :O(N)
             ----------------
           *dequeue q1 till 2nd last and push it to the q2
           *dequeue the last  element {pop()}
           *dequeue q2 to q1 completely  {can swap}

      */            

/*Algo2 -:

           --------------
           push() : O(N)
           --------------
           * enqueue el to q1 
           * q2 -> q1
           * q1 -> q2

           --------------  
           pop() :O(1)
           --------------
           pop element from q2
           

           
*/





import java.util.*; 

class StackImplementation01{
    Queue<Integer> q1; 
    Queue<Integer> q2; 

        public StackImplementation01(){
                this.q1 = new LinkedList<>(); 
                this.q2 = new LinkedList<>(); 
                                      }

  //push()
    public Boolean push(int el){
        q1.add(el);  
     return true; 
    }

  //pop()
     public int pop(){
         if(q1.isEmpty()){
            return -1; 
         }
          int n = q1.size();
          while( n > 1){
            q2.add(q1.remove()); 
            n--;
          } 
          int popEl = q1.remove(); 
                 n = q2.size();
         while(n > 0){
            q1.add(q2.remove()); 
         n--;
         }
         return popEl ; 
     }

     public int size(){
        return q1.size(); 
     }

     public Boolean isEmpty(){
        if(q1.isEmpty()){return true; 
        }else {return false;} 
     }


}



//algo2 

   class StackImplementation02{
        Queue<Integer> q1 ; 
        Queue<Integer> q2 ; 
         public StackImplementation02(){
                this.q1=new LinkedList<>(); 
                this.q2=new LinkedList<>(); 
         }


//push()
  public void push(int el){
            q1.add(el);
            while(!q2.isEmpty()){
                q1.add(q2.remove()); 
            } 

            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            //or replace by q2=q1;  
  }
  //pop
  public int pop(){

    if(q2.isEmpty()){
        return -1; 
    }
    return q2.remove(); 
  }
 
  public int peek(){
         if(q2.isEmpty()){

    return -1; 
         }
         return q2.size(); 
  }


   }



class StackUsingTwoQueue{
    public static void main(String[] args){
        // System.out.println("yes"); 

//algo 1....
    StackImplementation01 st  =new StackImplementation01(); 
    System.out.println(st.pop()); 
    st.push(2);
    st.push(32);
    System.out.println(st.pop()); 
    System.out.println(st.pop()); 
    System.out.println(st.size()); 
    System.out.println(st.isEmpty());

//algo2...
 StackImplementation02 st2  =new StackImplementation02(); 
    System.out.println(st2.pop()); 
    st2.push(2);
    st2.push(32);
    System.out.println(st2.pop()); 
    System.out.println(st2.pop()); 
    System.out.println(st2.peek()); 
   



    }
}
