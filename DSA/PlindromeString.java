//you need to check weather is palindrome or not 




public class PlindromeString{

    public static void main(String args[]){

     String str= "madam"; //madaM , mada ... 

     int n= str.length(); 
    
     StringBuilder sb= new StringBuilder(n); 
    
     for(int i=n-1; i>=0; i--){
         sb.append(str.charAt(i)); 
     }
  
     System.out.println(str.equals(sb.toString())); 

    }
}