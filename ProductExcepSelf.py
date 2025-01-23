# The approach uses O(n) time complexity and O(1) extra space (excluding the result array).  
# It computes the product of all elements except self using two passes: a forward pass for left products  
# and a backward pass for right products, updating the result array in place.  
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return []
        
        n = len(nums)
        rp = 1  # running product
        result = [0 for i in range(n)]
        result[0] = 1  # Initialize first element of result to 1
        
        # Forward pass to calculate left products
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp
        
        rp = 1  # Reset running product
        
        # Backward pass to multiply with right products
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = rp * result[i]
        
        return result
