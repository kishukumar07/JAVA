//you are given an array and you need to sort this using the Bubble Sort Algorithm.
import java.util.*; 

public class BubbleSortConcept{

    public static void main(String[] args){

    int[] arr= {4,3,2,1}; 
    System.out.println("Sorting in Ascending...."); 

//        int[] arr= {1,2,3,4}; 
//   System.out.println("Sorting in DES...."); 
   
   //we'll sort this in ascending order then w'll sort the result array  into descending order.  
    int n =arr.length; 
    for(int i =0; i<=n-2 ; i++){
        
        Boolean Swap = false; 
        for(int j=0; j<(n-1-i); j++){
            if(arr[j]  >  arr[j+1]){   // < / > will decide ascending desc  order ... 
                int temp = arr[j]; 
                arr[j]=arr[j+1]; 
                arr[j+1]= temp ; 
                Swap=true; 
            }
        }
      if(!Swap){
        System.out.println("this is already Sorted"); 
        break; 
      }
      
    }
    
 System.out.println(" : Sorted in ASC : " + Arrays.toString(arr));  //final result  

    }

}

//Tc   BEST CASE O(N) 
//     Wrost Case O(N*N) 
//Sc   we modified the previous so  O(1); 

