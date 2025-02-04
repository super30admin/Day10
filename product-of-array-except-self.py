# Explanation:
# Prefix loop: Computes the product of all elements before the current index and stores it in the output array.
# Suffix loop: Computes the product of all elements after the current index and multiplies it with the value already 
# in the output array.
# Time Complexity:O(n): We go through the list twice (once for prefix and once for suffix).
# Space Complexity:O(n): We use an additional output array of size n.
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [1]*n
        prefix = 1
        for i in range(n):
            output[i] *= prefix
            prefix *= nums[i]
        suffix = 1   
        for i in range(n-1, -1, -1):
            output[i] *= suffix
            suffix *= nums[i]
        return output