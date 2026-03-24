/* Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array. solve this in TC=> O(N) 

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Input: nums = [1,2,3], k = 3
Example 2:
Output: 2
*/

import java.util.* ;

public class CountOFSubarrayEqk02{
    public static void main(String[] args){
// int[] nums = {1,2,3}; 
// int k = 3 ; 
//way 1 BF : O(n^2); 

//slidingwindowO(n^2) fail -ve value
/*
int n= nums.length; 

int currPrefSum = 0; 
int count = 0; 

int i=0 ; 
while(i<n){  //O(N)
           int j=i; 
    while(k > currPrefSum  && j<n){  //O(N)
      currPrefSum += nums[j];
        j++;  
    }

   if(currPrefSum==k){
    // System.out.println(currPrefSum+" "+i + j ); 
      count++ ; 
      currPrefSum = 0; 
   }else if(currPrefSum>k){
            currPrefSum -= nums[i] ;        
   }
 i++; 
}
System.out.println(count); 


//HashMap...{Prefer js Code for understanding the logic }

/*

 { 
    "0":1
  
   }
 count  1 -> 2


*/





  int [] arr = {1,2,3}; 
  int n=arr.length; 
  int k=3; //already above defined
                  //given

   int Currsum = 0; 
    int i=0; 
int counT = 0; 
Map <Integer,Integer> hashMap =new HashMap<>();  
//need to assign one entry by us . 
   hashMap.put(0,1); 

    while(i<n){
       Currsum += arr[i] ; 
       int diff = Currsum - k ;

       if(hashMap.containsKey(diff)){
            //this mean there are subbarr whose sum =k; 
                counT += hashMap.get(diff); 
            //    System.out.println(counT+": " +Currsum); 
            //reset  currsum 
            //    Currsum = 0; //no we cant do that ... cause we have to mention the dairy  next
        }         
       //maintaing Entry of Prefix sum
        //if obj has the diff key++
        //else new entry 
           if(hashMap.containsKey(Currsum)){
             hashMap.put(Currsum,hashMap.get(Currsum) + 1 ); 
           }else{
             hashMap.put(Currsum,1); 
           }
      i++; 
    }

System.out.println(counT); 





    }
}












