// Print all the characters in the string whose next are vowels if no vowels exist Print 'NotFoud'


public class WhoseNextVowel{
    public static void main(String [] args){
        
        String str= "piyush" ;
        int n= str.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            
            if(i==0    ) {
                 //we'll check weather its right i+1 forvowel 
                  if( "aeiou".indexOf(str.charAt(i+1)) != -1 ) sb.append(str.charAt(i)); 
            continue; 
            }
            // System.out.println(i == n-1 && ("aeiou".indexOf(str.charAt(i-1)) )!= -1 );
              
           else if(i == n-1 ){
                //we'll check weather its left i-1 for vowel
                  if( ("aeiou".indexOf(str.charAt(i-1)) )!= -1  )  sb.append(str.charAt(i)); 
                    continue; 
            }

           else if(("aeiou".indexOf(str.charAt(i-1)) != -1) ||  ("aeiou".indexOf(str.charAt(i+ 1)) )!= -1  ){ //is vowel
                  sb.append(str.charAt(i)); 

            }
                          }
   System.out.println(sb.toString()); 
    }
}


//O(N)
//O{N} wrost case Sc
