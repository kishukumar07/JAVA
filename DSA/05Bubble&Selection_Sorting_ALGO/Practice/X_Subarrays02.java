/* Description: Given a array A having N positive integers. count all the subarrays  having length X, such that each subarray has no integer greater than k 

Input : first line : single integer T denoting the number of test cases
        2ndline  : three space separated integers denoting the value of N,K and X .
        next line: N single space separated integers denoting the elements of array A. */

import java.util.*; 
public class X_Subarrays{
 public static void main(String[] args){
// sample Input :        sampleoutput : 2
//    final String input1 = "1 \n 4 3 2 \n 1 3 2 5"; 
   final String input2 = "2\n4 3 2\n1 3 2 5 \n4 4 2\n1 3 5 6"; 
    
   Scanner sc = new Scanner(input2); 
   
   int testCase = sc.nextInt(); 
   while(testCase>0){
    
   int n = sc.nextInt(); 
   int k = sc.nextInt(); 
   int x = sc.nextInt(); 

   int[] arr = new int[n]; 
   
   for(int i=0; i<n; i++){
       arr[i] = sc.nextInt(); 
   }

   System.out.println(Arrays.toString(arr)); 


  //all logic goes here ...  (O{N^2})  ==> (O{N})
  //we have to count those subarray of length x where element  is not greater than k; fixed size sliding window...
   //fixed sized sliding window ...

  
   int result = 0; 

   for(int i=0; i<=n-x; i++){
       Boolean check =true; 
       for(int j = i; j < i+x; j++){
            if(arr[j]>k){
              check = false; 
            }
       }
       if(check){
        result++; 
       }

   } //O(n^2)
   System.out.println(result); 

  // THE SAME THING WE CAN DO THIS USING THE LOGIC : we only need to mention two variables ... 1. count =0; we'll increase it when currentCount >= x  and when we get that currentEl > k we'll reset count from here ...

  int NoOfSubArr=0; 
  int count =0; 

  for(int i=0; i<n; i++){
      int currEl= arr[i]; 
    if(currEl > k ){
      count=0 ;
    }else{
      count++; 
    }
    if(count>=x){
     NoOfSubArr++; 
    }

  }//O(N) 
  
  System.out.println("form another logic : "+ NoOfSubArr); 



    
    testCase--; 
   }
 }

}























