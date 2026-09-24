class Solution {
    public int smallestIndex(int[] nums) {

        int res = -1;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            int num = nums[i];

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            System.out.println(sum);
            if (sum == i) {

                res = i;
                break;
            }

        }
        return res;
    }
}