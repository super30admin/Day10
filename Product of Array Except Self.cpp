// as done in class
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> result;
        int rp = 1;
        result.push_back(rp);
        for(int i = 1; i < n; i++) {
            rp = rp*nums[i-1];
            result.push_back(rp);
        }
        rp = 1;
        for(int i = n-2; i >= 0; i--) {
            rp = rp*nums[i+1];
            result[i] = result[i]*rp;
        }
        return result;

    }
};