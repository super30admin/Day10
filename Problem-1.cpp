// https://leetcode.com/problems/product-of-array-except-self/description/
// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(1) only prefix and suffix int variables are used, it is given that output array is not considered as extra space.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Calculate prefix product for each element in the output.
// Calculate suffix by multiplying each element's prefix product with the suffix in the output
// Return the ouput array.

// Your code here along with comments explaining your approach

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> output(n,1);
        int prefix = 1;
        for(int i=0; i<n; i++){
            output[i] *= prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] *= suffix;
            suffix *= nums[i];
        }
        return output;
    }
};