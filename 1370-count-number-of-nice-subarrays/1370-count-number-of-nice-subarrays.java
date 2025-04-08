class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        return findTotalSubArrays(nums, k) - findTotalSubArrays(nums, k - 1);
    }

    public int findTotalSubArrays(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int res = 0;
        int oddCount = 0;

        while (right < nums.length) {
            if (nums[right] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }
            res += right - left + 1;
            right++;
        }
        return res;
    }
}