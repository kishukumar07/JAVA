/*Description: You brought virtual reality glasses.
There is only one game installed to it called "The Abondend City"
You are lost in an abondoneed city in order to Escape you have to pay at least the target K number of golden coins. So you decided to collect the gold in the houses of that city. The city contains N houses of that city. the city contains N houses aligned in a straight line. each house contains a number of gold coins.
You need to find out the shortest distance you have to travel untill you collect the needed amount of golden coins to get out . 
you can start from any house i and continue i+1th or i-1th house but  you cant stop at any house 
Note : if it's not possible to collect at least the target number of gold coins then in that case you will ultimately lose the game and you must print -1

//goal=>>  shortest distance to collect the target gold coins 
 sample input 1:                                       sample output 1:
let inp=[1,2,3,4,5];                                       2    
let k=7; 

sample input 2: 
let inp2=[5,1,2,3,4]                                    sample output 2: 
let k=15;                                                 5 

sample input 3: 
let inp3=[5,2,3,4]                                    sample output 2: 
let k=15;                                                  -1 
*/



//technique :-> 
       //finding the same element index or the top most element 
       //we'll traverse  one side collect the sum =< k  and track the distance
       //we'll traverse  another side collect the sum <=k and track the distance 
       //within both taacked distance whicever is minimum we'll got that ...

//Algorithm : -> 
        //    1. searching for index of k if not present in the arr then for the one maxM if its not present then one minimum el  if its not there we'll return -1; 
        //    2. distance = j-1+1

public class Aboundant_City06{
 public static void main(String[] args){


/*
  int[] arr = {1,2,3,4,5}; 
  int k = 7;  
  int n = arr.length; 

   if(n==0){
    //return -1 we loose the game .... 
   }
  int Start = Integer.MIN_VALUE;
  
  for(int i =0; i<n; i++){
  if(arr[i]>k){
    Start  = i; 
    System.out.println("GOt it ...EDGE CASE MIN DIST: 1") ;
   return; 
  }
  } //edgeCase

  if(Start == Integer.MIN_VALUE){
    for(int i = 0; i<n; i++){
        if( arr[i] == k  ){
           System.out.println("GOt it ...EDGE CASE MIN DIST:  1");  
         return; 
        }
    }
  }//edgeCase 
  
  if(Start == Integer.MIN_VALUE){
   int prevEl = Integer.MIN_VALUE ; 
      for(int i = 0; i<n; i++){
            if( arr[i] < k && prevEl < arr[i] ){       
          Start = i; 
      } 
    }
  
  }
     
// System.out.println(Start); 

int j = Start;
int shortDist = -1; 
int sum = 0; 
while((sum < k) && (j >= 0)  ){
  sum += arr[j--]; 
}

int newdist =( ( Start - j) );
if(shortDist < newdist && sum >= k ){
    shortDist = newdist ; 
}

//traverse Right  ...  i->>>>> n-1 {including n-1 }
j = Start; 
int ShortDist = -1;
int sum1 = 0 ; 

while((j<=n-1) && (sum1 < k)){
 sum1 += arr[j++]; 
}

int mindist = (j - Start) ;
if(ShortDist <  mindist  && sum1 >= k ){
 ShortDist = mindist ; 
}
// System.out.println(ShortDist); 

//logic ...
if(shortDist == ShortDist || ShortDist == -1 || shortDist < ShortDist){
    System.out.println(shortDist); 
}else{
    System.out.println(ShortDist); 
}



 */


//Best optimised approach variable size sliding window :  we have to track for the minLengthed window whose sum <= k ; 


 int[] arr = {1,2,3,4,5}; 
  int k = 1;
  int n = arr.length; 

  int i =0;
  int j=i  ;  

int sum =0; 
 int minDis = Integer.MAX_VALUE; 
  while (i<n){
       
      while(j < n && sum < k){
        sum += arr[j++]; 
      } 
        
      if( sum >= k && (j-i) < minDis ){
            minDis = j-i ; 
            sum  -= arr[i++]; 
      }else {
         //if sum < k && j reached end no window possible 
            break; 
    }
      }


  } 

  if(minDis == Integer.MAX_VALUE ) {
    System.out.println(-1); 
    return; 
  }

System.out.println(minDis); 

//we can solve it using the shrink until sum <=k check notecopy...

 }
}


























