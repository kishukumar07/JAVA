import java.util.*; 
public class NextSmallerElementFromRight{
        public static void main(String[] args){
        
        int[] arr ={39,27,11,4,24,32,32,1}; 
        int n = arr.length; 
        
        int[] res = new int[n]; 
        Stack<Integer> st = new Stack<>(); 

        for(int i =n-1; i>=0; i--){
         while(st.size()!=0 && st.peek() >= arr[i]  ){
            st.pop(); 
         }
         
         if(st.size()==0){
            res[i]=-1; 
         }else{
            res[i]=st.peek(); 
         }
         st.push(arr[i]); 
        }
        
        System.out.println(Arrays.toString(res)); 


        
                                              }
                                   }



































