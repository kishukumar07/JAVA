import java.util.*; 

public class NextSmallerElement{
    public static void main(String[] args){

   int[] arr = {39,27,11,4,24,32,32,1}; 
   int n = arr.length; 
   
    Stack<Integer>st = new Stack(); 
    int[] res =new int[n];  
    for(int i=0 ; i<n; i++){

        while(st.size()!= 0  && st.peek() >= arr[i]  ){
             st.pop(); 
        }
        
        if(st.size() == 0){
            res[i]=-1; 
        }else{
            // st.push(arr[i]);
            res[i] = st.peek();  
        }
       
        st.push(arr[i]); 


    }

    System.out.println(Arrays.toString(res)); 
    
   
    }
}