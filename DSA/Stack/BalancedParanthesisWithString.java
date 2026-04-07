import java.util.*; 

public class BalancedParanthesisWithString{
   public static void main(String[] args){

   String input = " 3 \n (((((())))[])) \n [a[v[k(df)dd]]] \n {a[(])a}"; 
                        
     Scanner sc = new Scanner(input); 
    int t =  sc.nextInt(); 
    
    while(t > 0){
    Stack<Character> st = new Stack<>();    

    String str = sc.next(); 

    int n= str.length(); 

    for(int i=0; i<n; i++){
       
      char ch = str.charAt(i) ; 

       if(ch == '{' || ch=='(' ||ch=='['){
              st.push(ch);
       } 

    else if (ch == '}' || ch == ')' || ch == ']' )
           {
            if (st.isEmpty()) {
                    st.push('!'); // Use a dummy char to ensure stack isn't empty at the end
            break; 
                              }
       if (checkPair(st.peek(), ch)) {
            st.pop();
                                     }
         else {
            st.push('!'); 
            break;
               }
           }        
    }
     

     if(st.size() == 0){
          System.out.println("valid");  
     }else{
        System.out.println("invalid"); 
     }
    
    t--; 

    }
   sc.close(); 
   }

   static Boolean checkPair(char l , char r){
   return 
   (l=='['&&r==']') ||
   (l=='{'&&r=='}') ||
   (l=='('&& r==')') ; 
   }

}