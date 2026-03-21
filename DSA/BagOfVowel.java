// Print all the characters the string that are vowels if no vowels exists print
// 'NotFound';

public class BagOfVowel {
    public static void main(String[] args) {

        String str = "nature";
        StringBuilder sb = new StringBuilder();
        Boolean foundVowel = false;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char el = str.charAt(i);
            if (el == 'a' || el == 'e' || el == 'i' || el == 'o' || el == 'u'
                    || el == 'A' || el == 'E' || el == 'I' || el == 'O' || el == 'U') {
                sb.append(el);
                foundVowel = true;
            }
        }

        if (!foundVowel) {
            // return "NotFound";
            System.out.println("NotFound");

        } else {

            // return sb.toString() ;
            System.out.println(sb.toString());
        }

    }
}

// O(N) => { tc+Sc }