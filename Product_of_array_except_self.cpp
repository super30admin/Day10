// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Initialize a result vector with all 1s.
// 2. Traverse the array from left to right and keep updating the result vector with the product of all elements to the left of the current element.
// 3. Traverse the array from right to left and keep updating the result vector with the product of all elements to the right of the current element.
// 4. Return the result vector.


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int rp = 1; 
        vector<int> result(nums.size(), 1);

        for(int i = 0; i < nums.size(); i++){
            result[i] *= rp;
            rp *= nums[i];
        }
        
        rp = 1; 
        for(int i = nums.size() - 1; i >= 0; i--){
            result[i] *= rp;
            rp *= nums[i];
        }

        return result;
    }
};