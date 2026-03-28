/* Description : 2 players  Ram and shyam are playing a game where in they both stand opposite to each other and there are n boxes  b/w them 
each boxes contains some numbers of stone in it . They can move in these boxes in one direction ie .. ram can move only towars shayam and shayam  towards ram , also they cannot cross each other . 
as nd when they step foot in a box they collect all the stones  in their bag and then they can decide weather to move forward or not 
the task is that at the end of the game the total number of stones in both the bags should be same . they cannot cross each other and cannot stand in the same box as well.  

Find the maximum no of stones each can collect so that they both can have same no of stones after covering X1 and X2 boxes  respectively (X1+X2<=n)

if they cannot have equal number of stones the output 0
if there exists some numbers of stones they can collect so that they have equal stone then they are said to win the game . Description 

*/

// sampleInput:               sampleoutPut
// arr=[100 ,8,97 ,2,1]        100 


public class StoneAgeGame05{
    public static void main(String[] args){
    
    int[] arr= {100,8,97,2,1}; 
    int n = arr.length; 
    
    int RamBag = arr[0]; 
    int ShyamBag = arr[n-1]; 
    
    int i=0,j=n-1;
    int maxComman = Integer.MIN_VALUE; 

    while(i<j){

    if(RamBag == ShyamBag){
       if(RamBag>maxComman){
        maxComman = RamBag ; 
       }
       i++ ;
       j-- ; 
     RamBag+=arr[i]; 
     ShyamBag+=arr[j]; 
    }

    if(RamBag < ShyamBag){
        i++;
        RamBag+=arr[i]; 
    }
    if(ShyamBag < RamBag ){
     j--; 
    ShyamBag+=arr[j] ;
    }
    
    
    }
    

    System.out.println(maxComman); 
    }
}


