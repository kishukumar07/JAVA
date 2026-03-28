/* leetcode que1196.
description: you have some apples in  basket  that can carry up to W units of weight .
Given integer array weight of size N where weight[i] is the weight of the ith apple , return the maximum number of apples you can put in the basket.  

Input :  
the first line contains the number of apples N and weight that the basket can carry  W. 
The 2nd line contains N integer as weight of the aples 

Output : a single integer telling the no of max apple you can store in the basket 

sampleInp :        sampleOutput : 
4 20                3
3 10 4 4

SampleInp2:    sampleOutput :      
4 20               3
20 4 4 3 

*/
import java.util.*; 
public class MaximumApples{
    public static void main(String[] args){

      final String input = "4 20\n20 4 4 3";
   
      Scanner sc = new Scanner(input);//!System.in  
       
       int n =sc.nextInt(); 
       int W = sc.nextInt(); 

       int[] arr= new int[n];
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt(); 
       }
       
    //    System.out.println(Arrays.toString(arr)); 
    

    for(int i=0; i<=n-2; i++){
     
        Boolean Swap = false; 
        for(int j=0; j<n-1-i; j++){
            //bound
         if(arr[j]>arr[j+1]){
            Swap = true; 
            int temp =arr[j]; 
            arr[j]=arr[j+1]; 
            arr[j+1]=temp; 
         }
    
    }
    if(!Swap){
     System.out.println("just for dev.process its swaped"); 
    }
    }
System.out.println(Arrays.toString(arr)); 



int count = 0; 
int currW   = 0;

for(int i=0; i<n; i++){
   
    currW += arr[i] ; 
    count++;  

   if(currW == W){
     System.out.println("Max Apples : "+ count ); 
     break ; 
   }
   if(currW > W){
    System.out.println("Max Apples : "+ --count); 
    break; 
   }

   }
}

    }

















