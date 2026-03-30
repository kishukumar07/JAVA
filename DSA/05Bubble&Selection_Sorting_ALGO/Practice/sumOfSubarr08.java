/* Description :
You are given an array of size N. 
You will given Q queries. Each query has L and R such that (0<=L<=R<=N)
You need find sum from L TO R for each queries.

Sampleinputs                         SampleOutputs
4  -->N                                   
3 2 1 5  --->arr 
4    -->>>>Q, no of queries
1 3   --->L & R                           6
4 4  --->L & R                            5
1 4 --->L & R                             11
3 3--->L & R                              1

*/
import java.util.* ; 

public class sumOfSubarr08{

   public static void main(String[] args){
   
   String input = "4 \n 3 2 1 5 \n 4 \n 1 3 4 4 1 4 3 3 "; 
   Scanner sc = new Scanner(input); 

   int n = sc.nextInt(); 
   int[] arr =new int[n]; 
  int[] cf =new int[n+1];

   for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();  
       cf[i+1]  = cf[i]+arr[i]; 
   }
   

   int Q = sc.nextInt(); 
while(Q>0){
   int l = sc.nextInt(); 
   int r = sc.nextInt(); 
// System.out.println(l+" "+r);
// System.out.println(Arrays.toString(cf));  
System.out.println(cf[r]-cf[l-1]); 
   Q--; 
} //O{n}
   }
}


