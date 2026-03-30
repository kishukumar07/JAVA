/*Description : you are playing the popular game "AgeOF-Empire" you are the king of the empire where you have 2n workers will be grouped in the association with size 2 , so a total of N associations have to be formed . 
*THe building speed of the i-th  worker is A[i]. 
*To make an association , you pick up 2 workers. let the minimum building speed b/w both workers be X then the association has the resultant building speedX . 
You have to print the maximum value possible of the sum of building speed of N.Associations if you make the associations Optimally ..

Input : first line contains an integer N. representing the number of association to be made next line contians 2n space separated integers denoting the building speeds of 2n workers 
sample input              sample output        

2                             3
1 3 1 2 
*/

import java.util.*; 

public class AgeOfImpire10{
     
     public static void main(String[] args){
     
     int[] emp = {1,3,1,2};  
     int n = emp.length; 

     System.out.println(soln(emp , n)); 
     }
 
 static int soln(int[] arr ,int n ){
 
 //Implementing via selection sort 

 for(int i =0; i<n-1; i++){

int minElIndex = Integer.MAX_VALUE ;
int minEl =   Integer.MAX_VALUE  ; 

    for(int j = i+1 ; j<n; j++){
        if(( arr[j] < arr[i]) &&  (arr[j] < minEl )  ){
          minElIndex = j; 
          minEl =  arr[j]; 
        }
    }
    
    if(!( minEl == Integer.MAX_VALUE)){    
    int temp = arr[i]; 
    arr[i] =  arr[minElIndex]; 
    arr[minElIndex] = temp; 
    }

 }

// System.out.println(Arrays.toString(arr)); 

int res = 0  ; 

  for(int i =0;  i<n; i++){
    if(i%2!=1) res+=arr[i]; 
  }

return res; 


 }


} 