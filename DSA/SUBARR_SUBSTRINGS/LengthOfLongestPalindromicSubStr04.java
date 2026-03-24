// problem: You are Provided a string write a prog. that returns length of longest Palindromic substring of that string 

//Ap:1 -> BruteForceApproach
// "wmam"
// we  have to check each substr 
// is palindrome ?-> leng (maxConcept){O(n^3)}


//Ap:2 -> Expand from center of each character of string      // O{N}
//   for even length  ->  two center => i , i+1  
//   for  odd  length -> one center  =>  i , i 
//start expanding in both direction until i'th char !== j'th char  //O{N/2} 
// we'll mention starting index as i{uptil where the last condition satisfied at left side the palindrome starts from here} & Maxlength = [ j - {i-1}] of the longest palindrome Substring  
//same concept as => Sum(i,j) => Prefsum(j) -PrefSum(i-1) ;  

//the whole logic will take  O(N**2) 


public class LengthOfLongestPalindromicSubStr04{
  
  public static void main (String [] args ){

    String  str ="geekfomadamrgreeks"; 
    int      n =  str.length(); 
   

      int startIndex = 0 ;  
      int Maxlength  = 1 ;//there should be one length palindrome if there is !empty string edge case need to be handeled .  

    for(int i=0; i<n; i++){
       //if string is empty (handel )
       
            int odd=0; 
           for(int j=odd; j<=1; j++){          
            int low = i; 
            int high = low + j; 

             int currLength = 0; 
  
            while( low >=0 && high <= n-1 &&   str.charAt(low) == str.charAt(high)){    
               currLength =( high - ( low - 1)) ; 
                      
                  // System.out.println(currLength);
               if(Maxlength < currLength){    
                 Maxlength = currLength; 
                 startIndex = low;  
               }

             low --; 
             high ++; 
            }

        
       }

    }

 System.out.println( startIndex +" : "+(Maxlength)); 
//  excluding last index
//madam
//  4-(0-1) ->5 
//0 : 5{->length != lastindex}
  }

}
























