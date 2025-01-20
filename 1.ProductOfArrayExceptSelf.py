"""
Time Complexity: 0(n)
Space Complexity: 0(1) -- excluding the result array
Approach:
    1. Perform runProd from lhs->rhs
    2. Perform runProd from rhs->lhs
    3. Multiply both 
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        # return the result
        result = [1 for i in range(0,len(nums))] 

        # perform product from lhs to rhs
        for i in range(1,len(nums)):
            result[i] = result[i-1] * nums[i-1]
        # end of lhs to rhs product

        # perform rhs to lhs result
        rhsProd = 1

        for j in range(len(nums)-2, -1, -1):
            # update rhsProd
            rhsProd = rhsProd * nums[j+1]

            # update the result lis
            result[j] = result[j] * rhsProd
        # end of rhs to lhs prod

        return result