// you are give a element k and you need to print boths of its diagonals
// 00 01 02   03        
// 10 11 12   13                    
// 20 21 22   23                        let index of k = 12 
// output : diag1 = [01 ,12 ,23 ] 
// output : diag1 = [03 ,12 ,21 ] 

public class printDiagonalsforK{
    public static void main(String [] args){
    
    int [][] arr = {{00, 01,02,03},
                    {11, 12,13,14},
                    {21, 22,23,24}}; 
     int k = 12; 

    int row = arr.length; 
    int colm = arr[0].length; 
    
    int diff = 0; //for left diag 
    int sum = 0; //for right diag
    
    for(int i = 0; i<row; i++){
        for(int j=0; j<row; j++){
            if(arr[i][j]==k){

    // System.out.println(i+" "+j); 
                diff = j-i; 
                sum  = j+i; 
                break; 
            }
        }
    }
    
      StringBuilder leftDiag =new StringBuilder(); 
      StringBuilder rightDiag = new StringBuilder(); 

       for(int i=0; i<row; i++){
  
          for(int j=0; j<colm; j++){
               if(j-i == diff){
                leftDiag.append(arr[i][j]+" "); 
               }
               if(j+i == sum){
                rightDiag.append(arr[i][j]+" "); 
               }
        }
  
       }
    System.out.println("LeftDiag: "+ leftDiag.toString());
    System.out.println("RightDiag: "+ rightDiag.toString());  
    


    }
}





//we need to print both in array format ...










