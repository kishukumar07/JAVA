// 00 01 02   03       output be like: sum of column 1 even elements only 
// 10 11 12   13                       sum of column 2    ""
// 20 21 22   23                       sum of column 3    ""

public class EvenSumInColm{

public static void main(String[] args){
 
 int[][] arr = {{0,1,2,3},{10,11,12,13},{20,21,22,23}};
 
    int row= arr.length; 
    int colm = arr[0].length; 

    for(int j=0; j<colm; j++ ){
        int EvenElSum=0; 
         for(int i=0; i<row; i++){
            if(arr[i][j]%2==0){
                  EvenElSum+=arr[i][j]; 
            }
         }
         System.out.println(EvenElSum); 
    }
 


}
}
















