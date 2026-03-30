/*Given an array of integers , find if there Exists two numbers in the array whose sum is equal to the third number c , which is also present in  the array
ie ..  a+b=c
if there exist any such triplet in the array output 1 else 0.
Note : a,b,c all need to be different indices 
ie.. you can not use any element twice ... */

import java.util.*; 

public class Triplate_Sum07{
    public static void main(String[] args){
    //given 
    int k = 25; 
    int[] arr = {4,58,542,44,21,65,25} ;
    int n= arr.length; 
    System.out.println(triplate(n,arr,k)); //if true return 1 else  0 
    }

    static int triplate(int n , int[] arr, int k ){

            //  System.out.println(Arrays.sort(arr));//err : void type 
            Arrays.sort(arr);   //Collection.reverseOrder()                     //O{nlog.n}
             
            int i =0; 
            int j =n-1 ;

                while(i<j){
                     
                     int sum = arr[i]+arr[j]; 

                     if(sum==k){
                        return 1; 
                     }
                     if(sum<k){
                        i++; 
                     }
                     if(sum > k){
                        j--;
                     }

                }
              return 0; 
    }
    
}



