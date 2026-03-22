
//change those elemhient wch is divisible by divisor to  -1;
import java.util.*;

public class ifDivisiblebymchangeto_1 {
    public static void main() {

        int[] arr1 = { 2, 4, 6, 7, 5, 8 };
        int divisor = 2;

        int[] arr = arr1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % divisor == 0) {
                arr[i] = -1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}


//O(N) tc -> O(N) sC  


