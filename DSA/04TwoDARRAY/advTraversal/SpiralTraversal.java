// 00 01 02 03 04  
// 10 11 12 13 14 
// 20 21 22 23 24 
// 30 31 32 33 34 
// 40 41 42 43 44


//order can be n*m  

import java.util.*; 

public class SpiralTraversal{
  public static void main(String[] args){
   
   int[][] arr= {{12,34,56,78}
                ,{11,22,33,44},
                 {55,66,77,88} 
                 }; 

   int row = arr.length; 
   int colm = arr[0].length; 


    int count = 0; 
    int left =0; 
    int top =0; 
    int right = colm-1; 
    int bottom = row-1; 
 
   
   ArrayList <Integer> result = new ArrayList<>(); 

    while(count < row*colm){
    //index 3 out of bound for l 3 
    for(int i=left; i<=right && count<row*colm ; i++){
      
      result.add(arr[top][i]); 
      count++;
     
    }
    top++; 

    for(int i = top; i<=bottom && count< row*colm ; i++){
        result.add(arr[i][right]); 
        count++;
    }
    right--; 

    for(int i=right; i>=left && count<row*colm; i--){
        result.add(arr[bottom][i]); 
    count++;
    }
    bottom--; 

    for(int i = bottom; i>=top && count<row*colm; i--){
        result.add(arr[i][left]); 
    count++;
    }
    
    left++; 
   
    }


System.out.println(result);

}
}

