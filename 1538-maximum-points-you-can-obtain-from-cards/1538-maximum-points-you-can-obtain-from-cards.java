class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        if (n < k) {
            return -1;
        }

        int leftSum = 0;
        
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int currSum = leftSum;
        int maxSum = leftSum;
        int l = k-1;
        int r = n-1;

        while(l >= 0 && r>=n-1-k) {
            currSum = currSum - cardPoints[l];
            l--;
            currSum = currSum + cardPoints[r];
            r--;

            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

}