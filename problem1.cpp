# Time Complexity : O(n)
# Space Complexity : O(1) (without considering output array)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

// We will firstly calculate cummulative product from left to right and store it in output array. Then we can store right cummulative product from current element and multiply it by previous element's left product to find current position's product without self.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> output;
        if(n<1)
            return output;
        
        int product = 1;
        for(int i=0;i<n;++i)
        {
            product *= nums[i];
            output.push_back(product);            
        }
        
        product = 1;
        for(int i=n-1;i>0;--i)
        {
            output[i] = output[i-1]*product;
            product *= nums[i];
        }
        output[0] = product;
        
        return output;  
    }
};