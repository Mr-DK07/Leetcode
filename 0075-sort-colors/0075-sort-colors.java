class Solution {
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public void sortColors(int[] nums) {
        int size = nums.length;
        int left = -1, mid = 0, right = size;

        while (mid < right) {
            if (nums[mid] == 0) {
                left++;
                swap(nums, left, mid);
                mid++;
            } else if (nums[mid] == 2) {
                right--;
                swap(nums, right, mid);
            } else {
                mid++;
            }
        }
    }
}