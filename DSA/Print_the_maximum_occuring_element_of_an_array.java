//print the max^m occuring element in array 

//brute force O(n^2); 
//-> for each element we should have to traverce all next element and also maintain count when two element will be equal. 
//define 3 variable => max for checking whose frequency is more. 
//element => holding that element 
//frequency => count++ 

import java.util.Map;
import java.util.HashMap;

public class Print_the_maximum_occuring_element_of_an_array {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 3, 3, 3, 1 };
        int MaxOccEl = 0;
        int n = arr.length;
        int maxCount = -Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i == n - 1) {
                break;
            } // edge case
              // System.out.println(arr[i]);
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    if (maxCount <= count) {
                        maxCount = count;
                        MaxOccEl = arr[i];
                    }
                }

            }
        }
        System.out.println(MaxOccEl);

        // Approach2: using hasmap -> O(n{frequency}+n{max freq check}) , O(n) => space
        // need to maintain 2 variable maxFreq = -1 and maxFreqEl

        Map<String, Integer> myHashMap = new HashMap<>();

              for(int i=0; i<n; i++){

                String el =Integer.toString(arr[i]); 
                
                 if( !(myHashMap.containsKey(el)) ){
                      myHashMap.put(el,1); 
                 }
                 else{
                       myHashMap.put(el,myHashMap.get(el)+1); 
                 }
              }
    //    System.out.println(myHashMap); 

          int max = Integer.MIN_VALUE;  
           int maxFreqEl = 1;
        // myHashMap.forEach((key,value)->{ //withinForEach loop its not allowed to modify external variable e
        //     // System.out.println(key+" : " +value);
        //   if(myHashMap.get(key) >= max){
        //          max =  myHashMap.get(key); 
        //          maxFreqEl = Integer.parseInt(key) ; 
        //   }
        // });


//Using FOREACH in HashMap
        //  for(String key : myHashMap){  //only for arr or obj  !for hasmap
        //     System.out.println(key+" "+ myHashMap.get(key)); 
        //  }   //for in loop cant run here at java for HashMap



// entrySet() gives you access to both key and value simultaneously
for (Map.Entry<String, Integer> entry : myHashMap.entrySet()) {  
    int currentFreq = entry.getValue(); //
    
    if (currentFreq >= max) {
        max = currentFreq;
        maxFreqEl = Integer.parseInt(entry.getKey()); //
    }
}
        
        System.out.println(maxFreqEl); 







      



















    }

}




/*

myHashMap  //all key value +=1


for(Map.Entry<String, Integer> entry:  myHashMap.entrySet() ){

   System.out.println(entry.getKey()); 
   System.out.println(entry.getValue()); 

myHashMap.put(entry.getKey() , myHashMap.put(entry.getKey(),entry.getValue(entry.getKey())+1 )   )





}



 */