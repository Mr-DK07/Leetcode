class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l = 0;
        int max = 0;
        long sum = 0;
        Arrays.sort(nums);

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while ((long)nums[r] * (r - l + 1) - sum > k) {
                sum -= nums[l];
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}