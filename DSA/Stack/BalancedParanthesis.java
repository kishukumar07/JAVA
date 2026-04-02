/*
// leetcode20.BalancedParanthesis
you have to check weather the given Strings of Paranthesis is valid or not ...
*/ 
import java.util.*;

 class FixedStack{
private   int[] st ; 
private   int top ; 
private   int n; 


   public FixedStack(int n){
    this.st = new int[n];
    this.n = n; 
    this.top=-1;  
   } 

//push
public void push(int a){
    if(top == n-1){
        System.out.println("StackOverFlow"); 
    return; 
    }
top ++; 
st[top] = a; 
// System.out.println(pushe)
}


//pop 
 public int pop(){
    if(top==-1){
        System.out.println("Stack UnderFlow"); 
     return -1; 
    }

  top --; 
  return st[top+1]; 
 }

//peek
public int peek(){
    if(top==-1){
        return -1; 
    }
    return st[top]; 
}

//size
 public int size(){
    return top+1; 
 }

}













public class BalancedParanthesis{
   public static void main(String[] args){
    //two mid se start

    String input ="4 \n 8 {{[()]}} \n 2 [} \n 3 {(} 6 {[(])}"; 
     Scanner sc = new Scanner(input); 
     int t = sc.nextInt(); 
    
    //  System.out.println(stack.size());



    while(t>0){   

     int n = sc.nextInt();  //if n is odd direct return invalid 
    // System.out.println(n); 
     
    // System.out.println(sc.next().length()); 
            String str = sc.next(); 
   
    if(n%2==1){
        System.out.println("Invalid");  
          t--; 
        continue; 
    }
    FixedStack stack = new FixedStack(n/2); 

    //now the whole logic goes here ; 
    for(int i=0; i<n; i++){
        if(i<n/2){
             stack.push(str.charAt(i)); 
        }

    char leftParanEl = (char) stack.peek();
 
       if(pairMatches(leftParanEl,str.charAt(i))){
        stack.pop(); 
       }    
    }



    // System.out.println(stack.size()); 
//at last we have to check for emptyness -> valid /Invalid
    if(stack.size()==0){
        System.out.println("valid"); 
    }else{
        System.out.println("Invalid"); 
    }
        t--; 
    } 







}

static  Boolean pairMatches(char a , char b){
  
//we have to match the pairings in right way ...

if(((a=='{') && (b =='}'))){
return true ; 
}else if
  ((a =='(') &&( b==')')) {
return true ; 
  }else if
   ((a=='[') && (b==']') ) 
{
return 
  }
return false; 

}
}



