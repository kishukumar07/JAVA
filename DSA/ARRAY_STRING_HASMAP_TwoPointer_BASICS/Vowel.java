// you have to find the vowels that are not present in the string 
import java.util.*; 

public class Vowel{
    public static void main(){

    String str ="piyush232"; 
     //iu ->"aeo"

        char[]   vowel  = {'a','e','i','o','u'}; 
     Boolean[]   vowelPresent ={false,false,false,false,false};  

       int n= str.length(); 

       for(int i=0; i<n; i++){
           char currEl = str.charAt(i);
           if("aeiou".indexOf(currEl) == -1){
               continue; 
           }  
        for(int j=0; j<5; j++){
           if(currEl == vowel[j]){

                vowelPresent[j]=true;
           }
        }

       }

        StringBuilder sb= new StringBuilder(); 
            // System.out.println(Arrays.toString(vowelPresent)); 
                for(int i=0; i<5; i++){
                    if(!vowelPresent[i]){
                        sb.append(vowel[i]); 
                    }
                }

                System.out.println(sb.toString()); 


    }
}


