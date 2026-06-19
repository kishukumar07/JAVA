//you have to print true/ false on behalf of weather there is any subarray whose sum = k 
import java.util.*; 

public class IsThereAnyWindowOfSumK{

    public static void main(String[] args){

    int[] arr={1,2,3,4}; 
    int k = 7; 
    int n1 = arr.length; 

    int currentSum = 0; 
    for(int i=0; i<n1; i++){
      int j=i; 
      while(j<n1 && currentSum < k ){
        currentSum+=arr[j]; 
      }
      if(currentSum==k){
        System.out.println("there is one"); 
            //or count++ ,no break
      break ; 
      }
      if(currentSum > k){
            currentSum -=arr[i];  
      }
    }
   if(0==currentSum) System.out.println("not possible"); 


   //Way2 . storing the prefixSum on hasmap and checking weather the current sum - k is present on hashmap or not if present there is hasmap[diff] will be added to the result . //O{N} /O{N}
   int[] arr2 ={1,2,3,4,5}; 
//    int El = 8;  //k will be taken from first code  
   int n = arr2.length; 
   


   Map<Integer, Integer> myHashMap = new HashMap<>();
  
   // BASE CASE: To handle subarrays that start from index 0
        myHashMap.put(0 , 1);
   
   int currSum = 0; 
   int res = 0; 
   for(int i=0; i < n; i++){
       currSum+=arr2[i]; 
       int diff = currSum-k; 
     
       if(myHashMap.containsKey(diff)){
          res+=myHashMap.get(diff); 
       } 
       //entry making 
   myHashMap.put(currSum ,( myHashMap.getOrDefault(currSum,0) + 1)); 
   }



  if(res==0){
    System.out.println(res);
  }else{
    System.out.println(res);
  }

    }
}
















