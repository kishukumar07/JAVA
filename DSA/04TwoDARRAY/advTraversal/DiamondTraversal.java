// 00 01 02 03 04  
// 10 11 12 13 14 
// 20 21 22 23 24 
// 30 31 32 33 34 
// 40 41 42 43 44  

//   order=>n*n

// 00 01 02 03' 04 05 06
// 10 11 12' 13 14' 15 16
// 20 21' 22 23 24 25' 26
// 30' 31 32 33 34 35 36'
// 40 41'42 43 44 45' 46
// 50 51 52' 53 54' 55 56
// 60 61 62 63' 64 65 66
 

// Approach=>
// n -> odd  --> index ->even---> midPoint-->> lastIndex/2 or n-1/2     ~so odd length is compulsory 
// n-> even --> index ->odd  ->> mid Point not possible so we return "oddlengthedArray";   
//execute line by line1 +line2+line3+line4



public class DiamondTraversal{
 
 public static void main(String[] args){  


  int[][] arr ={{1, 2, 3, 4, 5},
               {11,12,13,14,15},
               {11,21,31,32,33},
               {33,34,54,23,12},
               {22, 4,66,77,99}
               };  
int n = arr.length; 

    if( n%2 ==0){
    // return "notPossible"; 
              }
   
StringBuilder line1=new StringBuilder(); 
StringBuilder line2 = new StringBuilder(); 
StringBuilder line3 =new StringBuilder(); 
StringBuilder line4 = new StringBuilder(); 

for(int i=0,j=(n-1)/2; i<= (n-1)/2 && j<=n-1; j++,i++     ){
        line1.append(arr[i][j]+" "); 
}

for(int i = ((n-1)/2)+1,j=n-2 ; i<n && j>=(n-1)/2 ; j-- ,i++   ){
    line2.append(arr[i][j]+" "); 
}

for(int i = n-2 , j = ((n-1)/2)-1; j>=0 && i>=(n-1)/2 ; i-- ,j-- ){
    line3.append(arr[i][j]+" "); 
}

for(int i=((n-1)/2)-1 , j = 1 ;   j<(n-1)/2 && i>0 ;  i-- ,j++        ){
    line4.append(arr[i][j]+" "); 
}



System.out.println(line1.toString()+line2.toString()+line3.toString()+line4.toString()); 


 }


}










































