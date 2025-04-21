class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);

        if (n > 0) {
            ans = nums[n / 2];
        }
        return ans;
    }
}