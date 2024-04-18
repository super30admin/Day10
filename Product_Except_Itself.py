# // Time Complexity :O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# create a result array and store prefix product while traverse
# from n to 1 traverse , calcualte postfix and multiply with the result on paticular index.


# // Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        n = len(nums)
        result = [1] * n
        rp = 1

        for i in range(1, n) :
            rp = rp * nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-1 , -1 , -1):
            result[i] *= rp
            rp *= nums[i]
        return result