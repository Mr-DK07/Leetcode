class Solution {
    public int possible(int[] weights, int mid) {
        int n = weights.length;
        int day = 1;
        int load = 0;

        for (int i = 0; i < n; i++) {
            if (load + weights[i] > mid) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0; // low: maxWeight, high: totalWeight
         for (int w: weights) {
            low = Math.max(low, w);
            high += w;
        }

        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(weights, mid) <= days){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}