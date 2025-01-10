// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 283: Product of Array Except Self
// Approach: Dynamic Programming
// Time Complexity: O(n)

class Solution
{
public:
    vector<int> productExceptSelf(vector<int> &nums)
    {

        vector<int> dp(nums.size(), 1);

        if (nums.empty())
        {
            return dp;
        }

        // Init running product as 1
        int rp = 1;

        dp[0] = rp;

        // Store in result array product of left elements
        for (int i = 1; i < nums.size(); i++)
        {
            rp = rp * nums[i - 1];
            dp[i] = rp;
        }

        // Multiply the right product with the current value in result array at current index and store the result of the product
        rp = 1;
        for (int i = nums.size() - 2; i >= 0; i--)
        {
            rp = rp * nums[i + 1];
            dp[i] = dp[i] * rp;
        }

        // Return result array
        return dp;
    }
};