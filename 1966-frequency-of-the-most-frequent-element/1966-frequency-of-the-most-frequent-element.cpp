class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        int l = 0;
        int r  = 0;
        int n = nums.size();
        sort(nums.begin(),nums.end());

        long long currSum = 0;
        int maxLen = 1;
        while(r<n){
            currSum += nums[r];
            while(currSum+k <   (nums[r]*1LL*(r-l+1))){
                currSum-=nums[l];
                l++;
            }
            maxLen = max(maxLen,r-l+1);
            r++;
        }   
        return maxLen;
    }
};