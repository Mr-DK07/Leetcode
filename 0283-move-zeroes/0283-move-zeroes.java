class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0; // left

        for (int r = 0; r < n; r++) { // r-> right
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}