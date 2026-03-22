
// Problem: you are given an array A of N elements. You are allowed to remove only one element which makes the sum of all the Remaining Element exactly divisible by 7 
import java.util.*;

public class Find_the_1stIndex_of_smallest_element {

    public static void main(String[] args) {

        /*
         * sumOfall - curr_el % 7 => 0 reminder currel ans
         * [14,7,28] O{n+n} => O{n};
         * minimum concept for removing lowest number ;
         */
        int[] arr = { 14, 8, 2, 14, 7, 4 };

        int sum = 0;
        int index = 0;
        int minimum = Integer.MAX_VALUE; // +Infinity

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        } // sum {N}
        for (int i = 0; i < arr.length; i++) {
            if ((sum - arr[i]) % 7 == 0) {
                if (arr[i] < minimum) { // <= if 7 at index 1 and 7 and 5th index and we have to remove the last one
                    minimum = arr[i];
                    index = i;
                }
            }
        } // {N}

        System.out.println(index + "th index and el is :" + minimum); // O(n)

        /*
         * if question will say witout substracting then ? app2...
         * { prefixsum {n tc + sc } + sliding window }
         * ===>>approach 1 is best : -> without using division operator
         * 
         * but this method is usefull in que like product of array
         * except self
         */

        // prefix sum arrays left and right
        // current index i : left sum Lp[i] whi pe Right sum Rp[i+1] we just have to add
        // itretively and on %7=0 just apply minel logic also index

        int n = arr.length;
        int[] prefixL = new int[n + 1]; // [0,14,22,24,38,45,49]
        int[] prefixR = new int[n + 1]; // [49,35,27,25,11,4,0]

        for (int i = 1; i <= n; i++) {
            prefixL[i] = prefixL[i - 1] + arr[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            prefixR[i] = prefixR[i + 1] + arr[i];
        }

        int min = Integer.MAX_VALUE;
        int index1 = -1;

        for (int i = 0; i <= n - 1; i++) {
            if ((prefixL[i] + prefixR[i + 1]) % 7 == 0) {
                if (arr[i] < min) {
                    min = arr[i];
                    index1 = i;
                }

            }

        }
        System.out.println(index1 + " " + min);

     ;
    }

}
