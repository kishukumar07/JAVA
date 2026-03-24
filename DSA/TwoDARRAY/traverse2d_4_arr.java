// 00 01 02   03   // go in zig-zag 
// 10 11 12   13 
// 20 21 22   23 

// output: 03 02 01 00  10 11 12 13  23 22 21 20 


import java.util.*; 

public class traverse2d_4_arr{
    public static void main(String[] args){
     
      int[][] arr ={{00,01,02,03},{10,11,12,13},{20,21,22,23}}; 

          int row = arr.length; 
          int colm =arr[1].length; 
  
            StringBuilder sb = new StringBuilder(); 

          for(int i=0; i<row; i++){
            

             if(i%2==0){
                for(int j=colm-1; j>=0; j--){
                      sb.append(arr[i][j]+" "); 
                }
             }else{
 for(int j=0; j<colm; j++){
                      sb.append(arr[i][j]+" "); 
                }
             }
          } 
      
    System.out.println(sb.toString()); 

    }
}






























