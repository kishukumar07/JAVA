/*sample input                                  sampleOutput
  "aaabccddd"                                       "abd"
hint:->> aaabccddd ->>abccddd ->abddd ->abd
*/


//solution one O(N) ->two ptr
//solution two Stack -> i'll run a for loop and push current element and i'll check if theres next one is similer or not if not then we'll push it in stack or not .
//at last we have all our solution but as stack is lifo we have to start rev looping 
//O(N)time complexity && O(N) space complexity 

import java.util.*; 

//manual stack 
class FixedStack{
 
 int[] st; 
 int n ; 
 int top ; 
 
 public FixedStack(int n){
    this.n= n; 
    this.st=new int[n]; 
    this.top = -1; 
 }
 
//push 

public void push(int a){
    if(top==n-1){
        System.out.println("StackOverFlow"); 
       return ; 
    }
   top++; 
   st[top]=a; 
}

//pop 

public int pop(){
    if(top ==-1){
        System.out.println("StackUnderFlow"); 
        return -1; 
    }
 
 top -- ; 
 return st[top+1]; 
}
 
public int peek(){
    if(top ==-1){
    //   System.out.println("Empty"); 
        return -1; 
    }
    return st[top]; 
}

public int size(){
      return top; 
}

}




public class ReduceString02{
    public static void main(String[] args){
    
   String str = "aaabccddd"; 
   int n = str.length(); 
//   if(n==0) return ; //edge case

   FixedStack stack  = new FixedStack(n);  
   StringBuilder result = new StringBuilder(); 

// "aaabccddd"

   for(int i = n-1; i>=0; i--){
       if(stack.peek() != str.charAt(i)){
           stack.push(str.charAt(i)); 
       }else{
       stack.pop(); 
       }
   }

     
     for(int i=0; i<=2; i++){
          result.append(   (char) stack.pop()  ); 
     }

System.out.println(result); 
    }
}












