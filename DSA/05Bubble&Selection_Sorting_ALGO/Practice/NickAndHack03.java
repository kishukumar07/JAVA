/* Nick and Hacks...
tom and nick are good friends Once. Tom asked nick exactly N rupees, but nick has only 1 rupees in his bank account .
Nick wants to help his friend so he wrote two hacks can multiply the amount of money he owns by 10 
while the Second can multiply it by 20. These hacks can be used at y number of times .
Can Nick help tom with his hacks?
sampleInput          sampleOutput
5                       No 
1                       Yes 
2                       No 
10                      Yes
25                      No
200                    Yes  
10                     yes

//this one is tricky question => the logic will be simple the number should be completely divisible by either 10 or 2 . and after that it should be left with 1.   
//if(TenPow>=TwoPow && num == 1){ 
            System.out.println("YES"); 
         }else{
            System.out.println("No"); 
         }
*/




import java.util.*;
  public class NickAndHack03{
   public static void main(String[] args){

   String  input = "3 500 400 200 ";  //testcase -> Ivalues   
   
   Scanner sc= new Scanner(input); 

   int testCase = sc.nextInt();  

while (testCase > 0){

   int TenPow = 0; 
   int TwoPow = 0; 
   int num = sc.nextInt(); 
    
        while (num%10==0){
              num = num/10; 
              TenPow++; 
                         }
          
            //this is importand we divide only those who is completly divisible by 2 if its not we'not divided let the num be reminder more than 1 
         while(num %2 ==0){
          num = num /2; 
          TwoPow++ ; 
         }
         
         if(TenPow>=TwoPow && num == 1){ 
            System.out.println("YES"); 
         }else{
            System.out.println("No"); 
         }

  testCase--; 
}

   }
  }













