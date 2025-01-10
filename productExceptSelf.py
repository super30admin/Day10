class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # TC: O(n)
        # SC: O(1)
        if nums is None or len(nums) == 0:
            return []
    
        n = len(nums)
        res = [1] * n  # Initialize the result array with 1s
    
        # Calculate prefix product
        runningProduct = 1
        for i in range(n):
            res[i] = runningProduct
            runningProduct *= nums[i]
    
        # Calculate suffix product and multiply with prefix product
        runningProduct = 1
        for i in range(n - 1, -1, -1):
            res[i] *= runningProduct
            runningProduct *= nums[i]
    
        return res

        