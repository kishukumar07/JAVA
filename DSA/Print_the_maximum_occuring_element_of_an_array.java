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

        Map<String, Integer> MyHashMap = new HashMap<>();
        MyHashMap.put("apple", 2);
        System.out.println(MyHashMap.get("apple"));

    }

}
