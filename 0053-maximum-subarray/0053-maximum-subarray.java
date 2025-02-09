class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}