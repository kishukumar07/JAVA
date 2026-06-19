//i have to find product of array except self 
//i will create one result array filled up with left product 
//again within the same result array i'll multiply each one with its right prefixproduct . 
//here it is we got the array containing the productExceptSelf...

import java.util.*; 
public class ProductExpectSelf{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the size of array ");
    int n = sc.nextInt();
    
    int [] arr = new int[n]; 
    System.out.println("Enter New Element...");
    for(int i =0; i<n; i++){
        arr[i] =sc.nextInt() ; 
    }
    
    int[] res = new int[n]; 
    int LProd =1; 
    for(int i=0; i<n; i++){
        res[i] = LProd ; 
        LProd *=arr[i]; 
    }

    int Rprod = 1; 
    for(int i=n-1; i>=0; i--){
        res[i] *= Rprod ; 
        Rprod *= arr[i] ;  
    } 
    System.out.println(Arrays.toString(res));   

    }
}































