// 00 01 02   03       output be like: sum of row  1 
// 10 11 12   13                       sum of row 2  
// 20 21 22   23                       sum of row 3  



import java.util.*; 
public class SumOfRow{
public static void main(String[] args){
     
       int [][] arr= {{00,01,02,03},{10,11,12,13},{20,21,22,23}};
       

       for(int i=0; i<arr.length; i++){
           int sum=0; 
        for(int j=0; j<arr[0].length; j++){
            sum +=arr[i][j]; 
        }
         System.out.println(sum); 

       } 



}
}

