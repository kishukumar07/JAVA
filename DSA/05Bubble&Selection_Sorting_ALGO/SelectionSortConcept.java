//you are given an array and you need to sort this using the Insertion Sort Algorithm.

import java.util.*; 

public class SelectionSortConcept{

    public static void main(String[] args){
    
    
    int[] arr = {4,3,2,1}; 
    // int[] arr = {1,2,3,4}; 
    // //see for this to convert in Desc ... what should be our changes ... 
    int n = arr.length; 

    for(int i=0 ; i<=(n-2); i++){
       int  currel=arr[i]; 
       int minElIndex  = currel ;

    for(int j=(i+1); j<=n-1; j++){
             if( currel > arr[j] ){
                minElIndex = j; 
             }
    }
    
    int temp = arr[i]; 
    arr[i]   =  arr[minElIndex];
    arr[minElIndex] = temp; 


    }
    
    System.out.println(Arrays.toString(arr)); 

    }

}
