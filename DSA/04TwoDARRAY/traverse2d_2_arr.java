// 00 01 02   03   //rhs to lhs and  up to downward 
// 10 11 12   13 
// 20 21 22   23 


// =>   here for each iteration i is moving so i will be inner loop 

import java.util.*; 
public class traverse2d_2_arr{

   public static void main(String[] args){

   int[][] arr = {{00, 01,02,03},{10,11,12,13},{20,21,22,23}}; 
     
   int row = arr.length; 
   int colm = arr[1].length; 



   StringBuilder sb= new StringBuilder(); 

// System.out.println(row + colm); 
   for(int j=colm-1; j>=0; j--){
    for(int i=0; i<row; i++){
        // System.out.println(arr[i][j]); 
        sb.append(arr[i][j]+" "); 
    }
   }
 System.out.println(sb.toString()); 


   }
}