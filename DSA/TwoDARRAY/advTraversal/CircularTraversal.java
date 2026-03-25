// Description: you are given a matrix of size n*m:find the circular traverse of the matrix
// [[00 01 02 03 04 05],
// [10 11 12 13 14 15],
// [20 21 22 23 24 25] ] order=>n*m

public class CircularTraversal{
    public static void main(String[] args){
     
    int[][] arr= {{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12}}; 
    int n=arr.length; 
    int m= arr[0].length; 

    StringBuilder line1 =new StringBuilder (); 
    StringBuilder line2 = new StringBuilder(); 
    StringBuilder line3 = new StringBuilder(); 
    StringBuilder line4 = new StringBuilder(); 
    
    for(int i=0; i<m; i++){
          line1.append(arr[0][i]+" " ) ;
    }
    for(int i=1; i<n; i++  ){
        line2.append(arr[i][m-1] +" "); 
    }
    for(int i=m-2; i>=0; i--){
    
      line3.append( arr[n-1][i] +" "); 
    
    }
    for(int i=n-2; i>0 ; i--){

        line4.append(arr[i][0]+" "); 
    
    }

     System.out.println(line1.toString()+line2.toString()+line3.toString()+line4.toString()); 

    }
}