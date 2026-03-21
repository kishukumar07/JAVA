// given a string containing both uper and lower case letters u need to convert
// both uppercase to lowercase and lower case to upperCase

// first we'll  create two  lexicographical string of small and upper case & for each element in string we have to iterate both of the string together if we'll get the index of that element we'll save and replace the el with the element present in another lexicographical string 
// TC => n*K && SC =>n+n+26 

public class ConvertCaseOfString {
    public static void main(String[] args) {

        String name = "n3iKeT";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        int n = name.length();
        StringBuilder bag = new StringBuilder(n); // bag

        for (int i = 0; i < n; i++) {
            char el = name.charAt(i);

            Boolean isfound = false; // edge case

            for (int j = 0; j <= 25; j++) {
                if (el == lowerCase.charAt(j)) {
                    isfound = true;
                    bag.append(upperCase.charAt(j));
                } else if (el == upperCase.charAt(j)) {
                    isfound = true;
                    bag.append(lowerCase.charAt(j));
                }
            }
            if (!isfound) { // just edge case
                bag.append(el);
            }
        }
        System.out.println(bag.toString());

        // way 2 using ascii tc=N SC=N

        // System.out.println() //i want asscii =>>>>> str.codePointAt(i)
        // System.out.println() //i want char from 65 (Ascii) =>>>>>

        // i'll try to check ascii values of each item in the string weather it resides
        // between 65-90 (UpperCase) or 97-112 (Lowercase ) if its a lowercase we'll
        // subtract 32 from the character ascii or +32 if its a lowercase by doing this
        // we'll get the resultant ascii and converting we'convert it character and
        // append it to the bag

        // .Implementation
        // first i have to take two things * StringBuilder bag -> for appending the
        // Updated chars here (N-worst case);
        // using for loop i can get each element character ascii (O{N}) we'll check it
        // using if else
        // if condition wll do work for conversion for UC else if will do
        // conversion for LC
        // let say else for edge case
        // at last we'll return the stringbuilder variable just by changing it to the
        // required format;

        String str = "nature*Fd";
        int n2 = str.length();
        StringBuilder Bag = new StringBuilder(n2);

        for (int i = 0; i < n2; i++) {

            char el = str.charAt(i);

            // i need the ascii here
            // int code = str.codePointAt(i); // get element ascii //in js
            // 'd'.getCharCode(0)
            int code = (int) el;
            // System.out.println(el + " " + code);
            if (code >= 65 && code <= 90) {
                code += 32;
                // conversion Ascii-> char
                // str.fromCharCode(65) // need modification /get element
                char newel = (char) code;

                Bag.append(newel);
                //
            } else if (code >= 97 && code <= 122) {

                code -= 32;
                char newel = (char) code; // need modification get element

                Bag.append(newel);

            } else {
                Bag.append(el);
            }

        }
        System.out.println(Bag.toString()); // can return

    }
}
