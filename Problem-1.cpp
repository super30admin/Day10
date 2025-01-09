// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution
{
public:
    vector<int> productExceptSelf(vector<int> &nums)
    {
        vector<int> res;
        if (nums.empty())
        {
            return res;
        }

        int n = nums.size(), rp = 1;
        res.resize(n);
        res[0] = rp;
        // calculate the running product from left to right
        for (int i = 1; i < nums.size(); i++)
        {
            rp *= nums[i - 1];
            res[i] = rp;
        }

        // calculate the running product from right to left
        rp = 1;
        for (int i = n - 2; i >= 0; i--)
        {
            rp *= nums[i + 1];
            res[i] *= rp;
        }

        return res;
    }
};