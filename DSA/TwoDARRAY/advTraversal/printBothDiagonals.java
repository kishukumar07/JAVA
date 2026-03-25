
public class printBothDiagonals{
 
 public static void main(String[] args){
 
  int [][] arr ={{1,2,3},{4,5,6},{7,8,9}}; 
  int row =arr.length; 
  int colm = arr[0].length; 

if(row!=colm){
    System.out.print("-1"); //edge case
}
 
StringBuilder leftDiag =  new StringBuilder(); 
StringBuilder rightDiag = new StringBuilder(); 

for(int i=0; i<row; i++){

           leftDiag.append(arr[i][i]+" "); 
           rightDiag.append(arr[i][row-i-1]+" "); 
 
} //O(N); 
  
  System.out.println(leftDiag.toString()); 
  System.out.println(rightDiag.toString()); 



 }

}
