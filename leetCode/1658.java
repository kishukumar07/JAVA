class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int target = totalSum - x; //target = max subaary sum 

        if (target == 0)
            return n;
        if (target < 0)
            return -1;

        //sliding window concept 

        int currSum = 0;
        int l = 0, r = 0;

        int maxSubArrLen = -1;

        while (r < n) {
            currSum += nums[r];
            while (currSum > target && l <= r) {
                currSum -= nums[l++];
            }

            if (currSum == target) {
                int dist = r - l + 1;
                maxSubArrLen = Math.max(maxSubArrLen, dist);
            }

            r++;
            //   l++ ; 

        }

     return maxSubArrLen == -1 ? -1 : n - maxSubArrLen;

    }
}
