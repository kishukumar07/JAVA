import java.util.*; 
//HERE I HAVE ONLY MENTIONED ABOUT IMPLEMENTION OF STACK (ADT) FOR ADT OR THEORY PURPOSE I HAVE MENTIONED IT IN MY NOTES ALREADY ...

//two ways of implementing Stack ADT }-> via Array or LinkedList {JS , Java}
                                  // }-> via Stack               {Java}

     class  FixedStack {
         private int[] st; 
         private int top ; 
         private int n; 

//constructor to initiliaze the stack ...
        public FixedStack(int size){
        
        this.n= size; 
        this.st =new int[n] ; 
        this.top = -1; 
        
        }
//push operation 
 public void push(int a ){
  if(top==n-1){
    System.out.println("StackOverFlow"); 
       return; 
  }
  top++; 
  st[top] = a ; 
  System.out.println("el : "+a+" is pushed to stack"); 
 }

//pop operation 
public int pop(){
    if(top == -1){
        System.out.println("StackUnderFlow"); 
                   return -1 ; 
    }
    top -- ; //this will behave like it removed 
    return st[top+1];  //and poped out the top element 
}

//peek operation
public int peek(){
 if(top == -1){
    System.out.println("stack is Empty "); 
    return -1; 
 }
 return st[top]; 
}

        }
 // this can be used as from the main() 
//  FixedStack stack  = new FixedStack(5);  _> where we can 


public class Concept01{
    public static void main(String[] args){
//Question can be like ... Implement stack ADT from Array.
//Defining a method inside another method eg .. main () is not allowed ...we move the method outside main but inside class . 
  FixedStack stack  = new FixedStack(5); 
  stack.push(10); 
  stack.pop(); //we need to store then print the returned value()
  stack.push(11); 
  stack.push(12); 
  stack.push(13); 
  stack.push(14); 
  stack.push(15); 
  stack.push(17); 
 int topEl = stack.peek(); //same as pop()
  System.out.println(topEl);  
    }
}


    //we will use pre-built library not manual construction of stack while building applications ...
    //  Stack s = new Stack();  //here we can't pass any size as argument
    //    {stacks in java cant be of fixed Size}
    //  s.push(3); 
    //  s.pop();
    //  s.push('l');  
    //  s.peek(); 
    //   System.out.println(s); //no overflow error ...