public static void main(String[] args){


 int[][] arr= {{0,1,2,3},{11,12,13,14},{21,22,23,24}};

 int row = arr.length;
 int colm = arr[0].length; 

 for(int i=0; i<row; i++){
     int EvenElsum=0; 
    for(int j=0; j<colm; j++){
        if(arr[i][j]%2==0){
            EvenElsum+=arr[i][j]; 
        }
    }
    System.out.println(EvenElsum); 
 }

  
 



}