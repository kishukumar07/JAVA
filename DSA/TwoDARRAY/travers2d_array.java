// 00 01 02   03 ^
// 10 11 12   13 ^
// 20 21 22   23 ^
// ----------->  ^
// order =m*n (if is a squire matrix : m=n we always have to solve like ye toh rectangular v ho sakta hai ) 
// To solve this type of que you need to check which pointer varies at a iteration 
// here i vary so i will be the inner loop  thats it ...

// output ->> 20 10 00 21 11 01 22 12 02  23 13 03 



import java.util.*; 

public class travers2d_array{
  public static void main(String[] args){
 
            Scanner sc = new Scanner(System.in); //case

     System.out.println("Enter row number");
                  int row = sc.nextInt(); 
     System.out.println("Enter colm number"); 
                  int colm = sc.nextInt();  
              
            int[][] arr = new int[row][colm]; 

     System.out.println("Enter elements in 2d array ... "); 
       for(int i=0; i<row; i++){
                         for(int j=0; j<colm; j++){
                                 arr[i][j]= sc.nextInt(); 
                                              }
                              }

          System.out.println(Arrays.deepToString(arr));


    //bag printing  -> according to question

        StringBuilder sb = new StringBuilder();
            for (int j=0; j<colm; j++){
                         for(int i = row-1; i>=0; i--){
                                    sb.append(arr[i][j]);   
                                    }
                                   }
 
        System.out.println(sb.toString()); 


sc.close(); 



}
}

















