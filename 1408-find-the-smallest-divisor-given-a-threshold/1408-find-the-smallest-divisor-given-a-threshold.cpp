class Solution {
public:
    bool isPossible(vector<int>&nums,int mid,int threshold){
        int sum = 0;
        int n = nums.size();
        for(int i = 0;i<n;i++){
            int val = (nums[i]/mid);
           if(nums[i]%mid==0){
            sum+=(val);
           }
           else{
            sum+= val + 1;
           }
        }
        return sum<=threshold;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start = 1;
        int end = *max_element(nums.begin(),nums.end());
        // int res = 0;
        while(start<=end){
            int mid = ((start+end)/2);

            if(isPossible(nums,mid,threshold)){
                // res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
   }
};