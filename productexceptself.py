"Time Complexity is O(N)"
"Space Complexity is O(N)"

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [1] * n

        # Left pass to calculate the product of all elements to the left of each index
        left_product = 1
        for i in range(n):
            output[i] = left_product
            left_product *= nums[i]

        # Right pass to calculate the product of all elements to the right and multiply
        right_product = 1
        for i in range(n - 1, -1, -1):
            output[i] *= right_product
            right_product *= nums[i]

        return output
        