// Given an array of integers , find the closest (not considering the distance, but value) greater or the same value on the left of every element. If an element has no greater or same value on the left side, print -1. 
// Input : arr = [10, 5, 11, 6, 20, 12] // Output : -1, 10, -1, 11, -1, 20  
// The first element has nothing on the left side, so the answer for first is -1.  // Second, element 5 has 10 on the left, so the answer is 10.  // Third element 11 has nothing greater or the same, so the answer is -1.  // Fourth element 6 has 10 as value wise closes, so the answer is 10  // Similarly, we get values for the fifth and sixth elements.


import java.util.*; 

public class NextGreaterElement{
        public static void main(String[] args){


        int [] arr = {10,5,11,6,20,12};
        int n = arr.length; 
   
        Stack<Integer> st =new Stack<>(); 
            // System.out.println(st.size()); 
         int [] res = new int[n];     
        int i=0;  

        while(i<n){

        while((st.size()!=0 ) && ( st.peek() < arr[i]) ){
               st.pop();
                
        }
          if(st.size()==0){
            res[i] =-1; 
           }else{
            res[i] =st.peek(); 
           }
           
            st.push(arr[i]); 
     
            i++; 
        }
      
System.out.println(Arrays.toString(res)); 


        
        }
}