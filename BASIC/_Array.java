
import java.util.Arrays; //for printing arrays 
import java.util.Collections;

public class _Array {
    public static void main(String[] args) {
        int[] arr = new int[5]; // by default 0 will be filled in java

        // arr = {1,2,3,4,5} ; //this will be wront cause its work with declaration .

        // injava array are objects ->
        int[] arr2 = { 23, 43 };
        System.out.println(arr2); // this will print object
        System.out.println(Arrays.toString(arr)); // this will print array format .

        float[][] Farray = new float[4][3];
        System.out.println(Arrays.deepToString(Farray));

        // int[][] arr3 = {{1, 2}, {3, 4}, {5, 6}};
        // System.out.println(Arrays.deepToString(arr3));

        for (int i = 0; i < Farray.length; i++) {

            System.out.println(Arrays.toString(Farray[i])); // while printing arr
            System.out.println((Farray[i][2])); // while printing elements
        }

        // for Each ()
        for (int i : arr) {
            System.out.println(i + 1); // all elements +1 will be printed

            // lets initilize values
            // no this cant be done think logically

        }

        // in js arr.fill(0) ;
        // injava
        int[] arr4 = new int[3];
        Arrays.fill(arr4, 77); // this will work
        System.out.println(Arrays.toString(arr4));

        int[] copiedArr = Arrays.copyOf(arr4, arr4.length); // this line will copy the whole array arr4
        System.out.println(Arrays.toString(copiedArr)); // this will convert into human readable format &print

        int[] halfarrCopied = Arrays.copyOfRange(copiedArr, 0, 2); // should give you warning if range bounded
                                                                   // //excluded 2 = > index 0 and 1 will be copied

        System.out.println(Arrays.toString(halfarrCopied));

        // ARRAY.SORT() -> DEFAULT :ACENDING ->BinarySearch -> inplaceModification
        // happens : (lexicographically-for alphabets {Dual-Pivot Quicksort algorithm}
        int[] num = { 1, 2, 3, 4 };
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        // in java we need to pass a callback as 2nd,argument to the Arrays.sort() in
        // order to get Desc. results
        // Collections.reverseOrder()

        // Arrays.sort(num,Collections.reverseOrder()); //cause the datatype of num is
        // int ->Sort wont work

        Integer[] arr5 = { 1, 2, 3, 4 };
        Arrays.sort(arr5, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr5)); // desc

        // Arrays.binarySearch() //logically its going to take the arr as first argument
        // and the element as 2nd and return the index ; BinarySearch always works upon
        // sorted array

        int index = Arrays.binarySearch(num, 2);
        System.out.println(index + " this is the index of 2 in " + Arrays.toString(num));
        // dont you think it will going to give you 1 as index of 2

    }
}

// in java we use array methods llike => Arrays.xyz(we pass array here ) ;
// in javaScript it like arr.fill(0);