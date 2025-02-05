// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans(nums.size());
        int sum = 1;
        int n = nums.size();
        ans[0]=1;
        for (int i=1; i<n; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }
        for( int i = n-2; i>=0; i--) {
            sum*=nums[i+1];
            ans[i]*=sum;
        }
        return ans;
    }
};