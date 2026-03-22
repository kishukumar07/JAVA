//you only have to print a array with no repeating elements from the given array . 
// import java.util.Map; 
// import java.util.HashMap; 
import java.util.*; 


public class repetingelinarray{

     public static void main(String[] args){
   
               int[] arr = {111,111,111,333,333,111,444}; 
          
               HashSet <Integer> set  = new HashSet();    
               
               for(int item : arr){
                 
                 if(!set.contains(item) ){
                        set.add(item); 
                 }
               }

            //    System.out.println(set);


      int[] newArr =new int[set.size()];  

          int i=0; 
       for(int el :set){
           
           newArr[i]=el;
           i++;   

       }


      

System.out.println(Arrays.toString(newArr)); 

}
}







