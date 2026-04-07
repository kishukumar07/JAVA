//Given an array of integers temprature  represents the daily temperatures Print an arr ans :   ans[i]  is the number if days you have to wait after ith day to get a warmer temprature if there is no future day for which this is possible keep answer[i] == 0 instead. 

import java.util.*; 
public class DailyTemp{
    public static void main(String[] args){
    
    //we make the next greater el from right ..okay 
    //here we just need to put index of top element -index of current el   not itself . hence every logic will be same ... 
    
String input ="2 \n 4 \n 30 40 50 60 \n 8 \n 73 74 75 71 69 72 76 73 ";

Scanner sc = new Scanner(input); 

int t = sc.nextInt(); 
while(t > 0){
   int n = sc.nextInt(); 
   int[] arr = new int[n];  
   for(int i =0; i<n; i++){
     arr[i]= sc.nextInt(); 
   }    
//    System.out.println(Arrays.toString(arr)); 
   Stack<Integer> st= new Stack();  
   int[] res =  new int[n]; 

   for(int i =n-1; i>=0; i--){
    
    while(st.size()!=0 && st.peek() <= arr[i]){
        st.pop(); 
    }

    if(st.size()==0){
    
    res[i] = 0; 

    }else{
        for(int j=0; j<n; j++){ //we can use optimization technique here as well 
            if(st.peek() ==arr[j]){ 
        res[i] = (j-i); 
            }
    }
        }

                   //index of top - i 
    
   st.push(arr[i]); 
    }

System.out.println(Arrays.toString(res)); 
t--; 
   } 
//we can store index and check for arr[index] as top element instead of storing the elements itself.
    
    
    
    t--; 
}
    }







