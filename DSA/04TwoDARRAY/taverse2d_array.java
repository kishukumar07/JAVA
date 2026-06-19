
// 00 01 02   03   //rhs to lhs and  downward  to upward 
// 10 11 12   13 
// 20 21 22   23 


// ==> here i is not constant in each iteration so it will be inner loop i->>n-1 to 0
//j=m-1 to 0

import java.util.*;
public class taverse2d_array{
   public static void main(String[] args){

       Scanner sc= new Scanner(System.in); 

   System.out.println("Enter the row size ... "); 
           int row = sc.nextInt(); 
   System.out.println("Enter the colm size ... "); 
           int colm = sc.nextInt(); 
   
   int [][] arr= new int[row][colm];

   System.out.println("Enter the elemnets ...."); 
      for(int i=0; i<row; i++){
        for(int j=0; j<colm; j++){
               arr[i][j]=sc.nextInt(); 
        }
      }

   
   //logic...
   StringBuilder sb = new StringBuilder();

     for(int j = colm-1; j>=0 ; j-- ){
        for(int i=row-1; i>=0; i--){
        sb.append(arr[i][j]+" "); 
        }
     }
   System.out.println(sb.toString()); 
   }
}











































