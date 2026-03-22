// Problem. Given a string in lowerCase defining the value a->1 , b->2 ... z->26 Now you have to find the total value 
//  Sample input : str ="aba" 
//  Sample output : 4
public class findValuesof_String_sChar {
    public static void main(String[] args) {

        // with ascii caharacter of the element of string we can easily get the soln ;
        // a-> 97 -96 =>1 =>> we'll sub -96

        String str = "niket"; // 59

        int n = str.length();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int charCode = (int) str.charAt(i);
            sum += charCode - 96;
        }
        System.out.println("'Total Sum : '" + sum); // O(N); , sc-> (1)

    }
}
