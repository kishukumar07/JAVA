class Solution {
    public List<String> maxNumOfSubstrings(String s) {

        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        //1. Track First & Last Occurrences:
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a'; //0-25 index system
            if (first[c] == -1)
                first[c] = i;
            last[c] = i;
        }

        //2. Build Valid Intervals:
        List<int[]> intervals = new ArrayList<>();
        // Find valid minimal substrings starting at first[c]
        for (int i = 0; i < 26; i++) {

            if (first[i] == -1)
                continue;
            int start = first[i];
            int end = last[i];
            boolean valid = true;

            for (int j = start; j <= end; j++) {
                int c = s.charAt(j) - 'a';

                if (first[c] < start) {
                    valid = false; //invalid start 
                    break;
                }
                //range expansion 
                end = Math.max(end, last[c]);

            }
            if (valid) {
                intervals.add(new int[] { start, end });
            }

        }

        // 3. Sort Intervals: by end position
        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));

        //4. Select Non-Overlapping Substrings (Greedy):
           List<String> result = new ArrayList <>(); 
       
           int prevEnd = -1;
         
         for(int[] interval : intervals   ){
             
             if( interval[0] > prevEnd   ){
                     result.add(s.substring(interval[0],interval[1]+1));  // +1 -> end at interval[1] 
                     prevEnd = interval[1];
             }

         }
        
return result ;

    }
}

// given => str 

//Condition:
// non-overlaping , allfrequency of 'c' => good Substr

// return maximum goodString possible .   
// if res.length = 2^n substrings .=>  return the one with minimum total length
//eg.. case2 explanation ... 
// Input: s = "abbaccd"
// Output: ["d","bb","cc"] yes : ["d","abba","cc"] no => "bb".length < "abba".length for same substr abba there is bb at minimum total length. 

//Constrains : O(n) || nlogn     

// -> the string itself , 
// aproach/Technique 1. O{n^2} * O{n} => substring generation + condition checking && O(N):sc 
//             O{n^3} TLE
// fail 

//    Technique/aproach2 : use hints  
//    1. valid/invalid intervals : range expansion -> interval schedule : sort by j asc. 
//    2. greedy swap  : next interval ka i < prev. j {mean:overlap } : elemination
//    3. append Result 



//PSEUDO CODE ...{ALGO}
/*
1. Track First & Last Occurrences:
   - Create two arrays 'first' and 'last' of size 26 initialized to -1.
   - Loop through string 's' to store the first and last index of every character.

2. Build Valid Intervals:
   - For each character present in 's':
     - Set start = first[char], end = last[char].
     - Loop 'j' from start to end:
       - If any character at 'j' has first[char] < start -> Mark INVALID and break.
       - Expand end = max(end, last[char]).
     - If VALID -> Add [start, end] to intervals list.

3. Sort Intervals:
   - Sort intervals by their ending position (end) in ascending order.

4. Select Non-Overlapping Substrings (Greedy):
   - Set prevEnd = -1.
   - For each interval [start, end]:
     - If start > prevEnd:
       - Append substring s[start...end] to result.
       - Update prevEnd = end.

5. Return result list.
 */