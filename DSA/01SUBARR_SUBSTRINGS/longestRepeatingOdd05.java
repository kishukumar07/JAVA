// longestRepeatedOdd(10,[2,1,1,2,1,1,1,1,1,0]);  //5 times oddno 1repeated so ==> output:5

//AP : 1 Brute force : subarr {n^2} => {n^3} to check ... 
//Ap : 2 for loop  => O{N} {Logic}

public class longestRepeatingOdd05{
public static void main(String [] args){

     int[] arr= {2,1,1,2,1,1,1,1,1,0};
      int n= arr.length; 

       int maxlength = 0; 
       int count = 1;        
 
     for(int i =0; i<n-1; i++){
         //if empty arr is there  well return" 0 "
            int currEl =arr[i]; 
            int nextEl =arr[i+1]; 
             

            if(currEl==nextEl && currEl%2==1){
                  count++; 

            }else{
               if(count > maxlength){
                maxlength = count ; 
               }
               count =1; 
            }


      }
   System.out.println(maxlength); 

}


}




