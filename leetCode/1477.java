class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        Arrays.fill(prefix, Integer.MAX_VALUE);
        Arrays.fill(suffix, Integer.MAX_VALUE);

        int l = 0, currSum = 0;

        for (int r = 0; r < n; r++) {
            currSum += arr[r];

            while (currSum > target) {
                currSum -= arr[l++];
            }

            if (currSum == target) {
                int dist = r - l + 1;
                prefix[r] = dist;
                suffix[l] = dist;
            }
        }

        //sweeping prefix and suffix ... 

        int minVal = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.min(prefix[i], prefix[i - 1]);
        }

        int minVal2 = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.min(suffix[i], suffix[i + 1]);
        }

        int resultSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {

            if (prefix[i] != Integer.MAX_VALUE && suffix[i + 1] != Integer.MAX_VALUE)
                resultSum = Math.min(resultSum, prefix[i] + suffix[i + 1]);

        }

        return (resultSum == Integer.MAX_VALUE) ? -1 : resultSum;

    }

}
//App1:- O(NlogN)
//breaking the arr in two halves ...
//for each halves shortest subbaray of sum k # logic.. and mention prefix[i],suffix[i] {min pref./suffix -window leng. sum=k }
//return min(prefix[i]+suffix[i]); 

//arr [3,2,2,4,3]
//ps  [0 3 5 7 11] 
//ss  [11 9 7 3 0]     //only one subarray computations
// l <= r no chance for overlappings . 
// for index 2  ps[2] = 5  , ss[n-1-2] = 7  //this proves 
//product of array except self hai ...

//arr = [3.2.2.4.3]    , target = 3
//p =   [1,∞,∞,∞,1] //min len ka subarr or infinity starting from  i 
//s=    [1,∞,∞,∞,1]  //min len ka subarr  //bs  //only one subarry comput. + minLength arr
//return min (p[i]+s[i]) = 2 ; 

//passed !

//arr = [7,3,4,7], target = 7
//int i=0 => n-1
// p [1,2,∞,1]
// s [1,∞,2,1]    //building minIndex 2 contains overlapping
//min + =>       2 pass

// arr = [4,3,2,6,2,3,4], target = 6

//p [∞,∞,∞,∞,1,∞,∞]
//s [∞,∞,∞,∞,1,∞,∞]

// this will return -1 but 2 here no two subbarr... 

//approach 2 ...   #sweepingConcept O(N)

//arr [3,2,2,4,3] , k = 4
// ps [∞,∞,2,1,∞]   
// ss [∞,2,∞,1,∞]
//after Sweep ps , ss on specific direction. 
// ps [∞,∞,2,1,1]   
// ss [1,1,1,1,∞]  
//means final : correct build prefix and suffix arrray is this one 

// arr = [4,3,2,6,2,3,4], target = 6
//p [∞,∞,∞,1,∞,∞,∞]
//s [∞,∞,∞,1,∞,∞,∞]
// #sweeped arrays
//p [∞,∞,∞,1,1,1,1]
//s [1,1,1,1,∞,∞,∞]
//ans = min(p[i] + s[i+1])  
// ret. ans? ans : -1  ; 