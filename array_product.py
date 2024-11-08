# The code defines a productExceptSelf method to compute the product of all elements in an array except the current element, without using division.
# The result for each element at index 'i' is the product of all elements to the left of 'i' and all elements to the right of 'i'.

# Initial Setup:
#   - A result array 'res' is initialized with ones. This will store the final product for each index.

# Prefix Pass:
#   - We initialize a variable 'prefix' to keep track of the product of elements to the left of each index.
#   - As we iterate over the array from left to right:
#       - res[i] is set to 'prefix', which holds the cumulative product of all elements before 'i'.
#       - 'prefix' is then updated by multiplying it with nums[i], moving the prefix product forward.

# Postfix Pass:
#   - We initialize a variable 'postfix' to track the product of elements to the right of each index.
#   - We iterate over the array from right to left:
#       - res[i] is updated by multiplying it with 'postfix', giving the product of all elements except nums[i].
#       - 'postfix' is then updated by multiplying it with nums[i], shifting the postfix product backward.

# Final Result:
#   - After both passes, res contains the product of all elements except the current one for each index, which is returned.

# TC: O(n) - Each element is processed twice (once in the prefix pass and once in the postfix pass).
# SC: O(1) - The space complexity is constant as we only use a result array (considered output space) and two variables (prefix and postfix).


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * (len(nums))

        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res