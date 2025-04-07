class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                k--;
            }

            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}