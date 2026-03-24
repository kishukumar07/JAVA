// 00 01 02   03       output be like: sum of column 1 
// 10 11 12   13                       sum of column 2  
// 20 21 22   23                       sum of column 3  

import java.util.*; 
public class SumOfColm{
    public static void main(String [] args){

    int[][] arr ={{00,01,02},{10,11,12},{20,21,22}}; 
    int row = arr.length; 
    int colm = arr[0].length; 
    
    for(int j=0; j<colm; j++){
           int sum =0; 
           for(int i=0; i<row; i++){
             sum+=arr[i][j]; 
           }
         System.out.println(sum); 
    }




    }
}


