import java.util.*;

public class MaxFreqEl{
    public static void main(String[] args){
 

     int[] arr ={111,111,111,222,222,111}; 
     int n= arr.length;

     Map<Integer,Integer> myHashMap = new HashMap<>(); 

       for(int el : arr){
            // if(!myHashMap.containsKey(el)){
            //     myHashMap.put(el,1);
            // }else{
            //     myHashMap.put(el,myHashMap.get(el)+1); 
            // }

       myHashMap.put(el, myHashMap.getOrDefault(el, 0) + 1);
               
       
       
       }



       int MaxElFreq = Integer.MIN_VALUE;  
       int MaxEl = -1; 
       for(Map.Entry<Integer,Integer> entry : myHashMap.entrySet()){
          
        //   System.out.println(entry.getKey() +" " +entry.getValue()); 
                 if(entry.getValue()>=MaxElFreq){
                        MaxEl= entry.getKey(); 
                 }

       }
       System.out.println(MaxEl);   //TC -> O{N} for array -> HashMap + O{N} -> HashMap ->MaxmELfind
                                    //SC -> O{N} for HashMap 


 


    }
}