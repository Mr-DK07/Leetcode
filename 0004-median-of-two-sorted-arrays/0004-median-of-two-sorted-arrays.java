class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int p = m + n;
        int[] mergeArr = new int[p];
        double median;

        System.arraycopy(nums1, 0, mergeArr, 0, m);
        System.arraycopy(nums2, 0, mergeArr, m, n);

        Arrays.sort(mergeArr);

        int i = p / 2;

        if (p % 2 == 0) {
            double x = mergeArr[i];
            double y = mergeArr[i - 1];
            median = (x + y) / 2;
        } else {
            median = mergeArr[i];
        }
        return median;
    }
}