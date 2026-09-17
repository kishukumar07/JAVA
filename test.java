 import java.util.* ; 



/*   
//Rev String...

public class test{
   public static void main(String [] args){      
          Scanner Sc = new Scanner(System.in); 
          System.out.println("Enter a String to reverse");
       String  s = Sc.next();
      int n = s.length();      
                        //  System.out.println(s+" "+n); 
    System.out.println(reverse(s,n));
   }
 static String reverse(String s ,  int n){
              StringBuilder sb = new StringBuilder(); 
            for(int i = n-1; i>=0 ; i--){
                // System.out.println(i); 
                  sb.append(s.charAt(i)); 
            }
        return sb.toString(); 
       }
}
 */


//checking if a string is palindrome or not 

/*
import java.util.Scanner; 

public class test {
  
   public static void main(String[] args){

                        Scanner sc = new Scanner(System.in); 
                        System.out.println("Enter a valid string ..."); 
                        String st = sc.next(); 
                        int n = st.length(); 
                        System.out.println( palindromeCheck(st,n) ); 
          }

       static Boolean palindromeCheck(String st , int n ){
                        
                      StringBuilder sb = new StringBuilder(); 

                    for(int i=n-1; i>=0; i--){
                                     sb.append(st.charAt(i)); 
                             }

                 return sb.toString().equals(st); 
                        
         } 

}


*/



//Finding duplicates in an array ... 
//way 1 brute Force approach ..
//way 2 has map or object ... 

//what is has map or has-set in java how to use it .? 

/*

import java.util.Scanner; 
import java.util.HashMap; 
import java.util.Map; 


public class test{

public static void main(String [] args ){
int [] arr ={2,3,5,2}; 
int n = arr.length; 
Map <String,Integer> obj = new HashMap<>(); 
int found = -1; 
 for(int i =0; i<n; i++){
    String curr = Integer.toString(arr[i]); 
    if(obj.containsKey(curr)){  //here  i made the Syntax err    => [curr]
     found =Integer.parseInt(curr); 
    //  return; 
    break;
    }else{
        obj.put(curr,1); 
    }
 }
    System.out.println(found); 
}

}





*/




