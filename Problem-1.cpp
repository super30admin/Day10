// Time Complexity : O(n)
// Space Complexity : O(1) because we're only 'n' space as required by answer not more
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> left_prods;
        int rp = 1;
        // Product of all elements to left of first element is 1
        left_prods.push_back(1);
        for(int i=1;i<nums.size();i++)
        {
            rp = rp*nums[i-1];
            left_prods.push_back(rp);
        }

        // Use same rp to maintain right product now
        rp=1;
        for(int i=nums.size()-1;i>=0;i--)
        {
            left_prods[i] = left_prods[i] * rp;
            rp = rp*nums[i];
        }
        return left_prods;
    }
};