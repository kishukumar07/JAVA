//form both ~ left or Right :if the condition is true at both side  Prefer left el at same distance


// final int[] arr= [5,4,1,3,2]; 
//  res ->[ -1, 5, 4, 4, 3 ]


import java.util.*; 

public class NearestGreaterElement{
    public static void main(String[] args){
    
    int[] arr = {5,4,1,3,2};
    int n = arr.length; 
    
    Stack<Integer> st = new Stack<>();   
    int[] res = new int[n];    
    
    
//order is imp first from right then left ...


    //greater form right...
    for(int i=n-1; i<n; i++){
     while(st.size()!=0 && st.peek()>=arr[i]){
     
     st.pop(); 
     
     }
     if(st.size()==0){
        res[i] =-1; 
     }else{
        res[i]=st.peek() ; 
    }
        st.push(arr[i]); 
    }
    

    //greater from left ...
    for(int i=0; i<n; i++){
     while(st.size()!=0 && st.peek() <= arr[i] ){
       st.pop(); 
     }
     if(st.size()==0){
        res[i]=-1; 
     }else{
        res[i]=st.peek(); 
     }
      
    st.push(arr[i])  ; 

    }
    
    System.out.println(Arrays.toString(res)); 

    
    }
}





