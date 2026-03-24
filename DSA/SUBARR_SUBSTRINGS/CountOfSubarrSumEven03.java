// Problem: you have to find the count of all Subarrays, the sum of whose elements is Even 

//way   :  bruteForce{N*N*N}
//way 2 : prefix sum + Parity O{n}

// "1  12 123 1234 12345" -> 2
// "2 23 234 2345 " -> 2
// "3 34 345   -> 1
// 4 45  -> 1
// 5"  
//
// [0,1,3,6,10,15]
// [e,o,o,e,e,o]
// => 3odd  =>  2+1 Even subarr
// => 3even =>  2+1 Even subarr
// ==> 6 ans 


public class CountOfSubarrSumEven03{

public static void main(String[] args){

int[] arr ={1,2,3,4,5}; 

int  n= arr.length; 


int oddPrefixCount  = 0;  
int evenPrefixCount = 1; //assuming 0 is even for first prefix sum 
int resultCount = 0; 

int currSum = 0; 

for(int i=0; i<n; i++){
    currSum+= arr[i]; 

    if(currSum % 2 == 0){
        resultCount += evenPrefixCount; 
        evenPrefixCount++; 
    }else{
        resultCount+= oddPrefixCount ; 
        oddPrefixCount++; 
    }

}
System.out.println(resultCount); 
}


}
































