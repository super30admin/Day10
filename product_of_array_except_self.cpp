// time : O(n)
// space : O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> answer(nums.size());

        // running product from left side
        answer[0] = nums[0];
        for(int i = 1; i < nums.size(); i++)
        {
            answer[i] = answer[i-1]*nums[i];
        }

        // running product from right end
        int running_product = nums[nums.size()-1];

        answer[nums.size()-1] = answer[nums.size()-2];
        for(int i = nums.size()-2; i > 0; i--)
        {
            answer[i] = running_product*answer[i-1];
            running_product *= nums[i];
        }
        answer[0] = running_product;

        return answer;
    }
};