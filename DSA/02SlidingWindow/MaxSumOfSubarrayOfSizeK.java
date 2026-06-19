/*
Q.Maximum Sum of Subarrays With Length K 
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
*/


public class MaxSumOfSubarrayOfSizeK{
  
    public static void main (String[] args){
    
     int[] arr= {1,2,3,4,5}; 
     int k = 3;  

     int MaxSum = 0; 
     int n= arr.length; 

     if(arr.length<k){
        System.out.println("not Possible"); 
     }

     for(int i=0; i<k; i++){
        MaxSum +=arr[i]; 
     }

    int currSum = MaxSum; 

    for(int i=1; i<=n-k; i++){

       currSum = ((currSum - arr[i-1]) + arr[i+k-1]); 

       if(currSum>MaxSum ){
            MaxSum = currSum ;  
       }
       

    }
System.out.println(MaxSum); 
    
    
    }
}


