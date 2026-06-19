// Description: you are given a matrix of size n*n :find the N traverse of the matrix
// [[00 01 02 03 04 05],
// [10 11 12 13 14 15],
// [20 21 22 23 24 25],
// [30 31 32 33 34 35],
// [40 41 42 43 44 45],
// [50 51 52 53 54 55]] order=>n*n


public class Ntraversa{
    public static void main(String[] args){
    
     int [][] arr= {{1,2,3},
                    {4,5,6},
                    {7,8,9}}; 
     
     int n = arr.length;  
     
     StringBuilder line1 = new StringBuilder(); 
     StringBuilder line2 = new StringBuilder(); 
     StringBuilder line3 = new StringBuilder(); 
   
    for(int i=n-1 ; i>=0; i--){

        line1.append(arr[i][0]+" ");

    }
    for(int i=1; i<n; i++){
        line2.append(arr[i][i]+" "); 
    }

    for(int i=n-2 ; i>=0; i-- ){
        line3.append(arr[i][n-1]+" "); 
    }

    System.out.println("line1: " + line1.toString()  + " line2: " + line2.toString()  + " line3 : " + line3.toString() ); 
  System.out.println(line1.toString()+ line2.toString()+line3.toString() );

    } 
}






















