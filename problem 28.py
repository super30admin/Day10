# https://leetcode.com/problems/product-of-array-except-self/description/

# Time Complexity : O(n)
# Space Complexity : O(3n) ~ O(n)
# Did this code successfully run on Leetcode : YES

# Three line explanation of solution in plain english:
# took a prefix multiplication array and calculated the running multiplication in the left excluding itself
# and stored in it, similarly did it for swuffix as well
# and in the result we need to multiply the left and right from the corresponding arrays for the result


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pm = [None] * n
        pm[0] = 1
        for i in range(1,n):
            pm[i] = pm[i-1] * nums[i-1]
        
        sm = [None] * (n)
        sm[n-1] = 1
        for i in range(n-2, -1, -1):
            sm[i] = sm[i+1] * nums[i+1]
        
        result = [None] * (n)
        for i in range(n):
            result[i] = pm[i] * sm[i]
        
        return result


# solution 2: with just one list (space optimization)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [None] * n
        result[0]=1
        for i in range(1,n):
            result[i] = result[i-1] * nums[i-1]
        #print(result)
        
        mul = 1
        for i in range(n-2, -1, -1):
            mul *= nums[i+1]
            result[i] = result[i] * mul
        
        return result