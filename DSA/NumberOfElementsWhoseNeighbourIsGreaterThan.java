public class NumberOfElementsWhoseNeighbourIsGreaterThan{
    public static void main(String[] args){
     
        int []arr =new int[5]; 

      for(int i=0; i<arr.length; i++){
        arr[i]=i+1; 
      }

    int n= arr.length;   
    int count =0; 


       for(int i=0; i<n; i++){
        if(i==0 && arr[i] < arr[i+1]){
            count++; 
            continue;
        }   

        if(i==n-1 && arr [i-1]>arr[i] ){
            count++; 
            continue;
        }

        if(arr[i-1]>arr[i] && arr[i]<arr[i-1]){
            count++; 
        }
    
       

       }

 //return count; 
 System.out.println(count); 




    }
}