    // TC = O(n)
    // SC = O(n)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
    
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        // maintain running product till that index from L & R and then multiply it at the index. eg. result[i] = left[i] * right[i]
        int n = nums.size();
        vector<int> result(n, 1);
        // null
        if(n == 0) return result;
        // left pass
        int rp = 1;
        for(int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }
        // right pass
        rp = 1;
        for(int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }
};