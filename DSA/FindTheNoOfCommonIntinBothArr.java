import java.util.Arrays;

public class FindTheNoOfCommonIntinBothArr {

    public static void main(String[] args) {

        // 1.bruteforce approcah =>O{n**2} //whereEverI'll find the matching condn i'll
        // return;

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 5, 6, 7 };
        // int n1 = arr1.length, n2 = arr2.length; //requires for basic loops
        for (int el1 : arr1) {
            for (int el2 : arr2) {
                if (el1 == el2) {
                    // return el1 ;
                    System.out.println(el2);
                }
            }

        }

        // 2. sorting(n log-n) + two pointer {n} ==> if array is already sorted O{n}
        // else O{nlogn}

        int[] arr3 = { 1, 2, 1 }, arr4 = { 2, 2, 2 };

        Arrays.sort(arr3); // inplace modification unlilke js _> returns array ;
        Arrays.sort(arr4); // for desc order-> Collections.reverseOrder()

        // System.out.println(Arrays.toString(arr3) + " " + Arrays.toString(arr4));

        int n3 = arr3.length, n4 = arr3.length;
        int i = 0, j = 0;

        // System.out.println(n3+" "+n4);
        while (i < n3 || j < n4) {
            if (arr3[i] == arr4[j]) {
                System.out.println("from 2nd method :" + arr3[i]);
                break;
            } else if (arr3[i] < arr4[j]) {
                i++;
            } else if (arr3[i] > arr4[j]) {
                j++;
            }
        }
        // we can handel edge case taking another Boolean variable for -1 case

    }

}
