import java.lang.module.ModuleDescriptor.Builder;

public class _ArrayToString {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        String str = "";
        for (int num : arr) {
            if (num < 0) {
                str += "-1";
            } else {
                str += num;
            }
        }

        System.out.println(str);
        // System.out.print(((Object)str).getClass().getSimpleName());

        // TC=> O(N) ;
        // SC=>O(N) ;


        
        // this is Good bu better to use String Builder (make string mutable )

        int n = arr.length;
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i <= n - 1; i++) {
            int el = arr[i];
            if (el >= 0) {

                sb.append(el);
            } else {
                sb.append(-1);
            }
        }

        System.out.println(((Object) sb).getClass().getSimpleName()); // StringBuilder

        // return sb.toString(); //this should be returned as leetcode result ...

    }

}
