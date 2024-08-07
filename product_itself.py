# Time Complexity - O(n)
# space complexity - O(1)
# tested on leetcode
# compute running product from left to right and store in result array
# compute running product from right to left and multiply with values in result array
# for first and last number use 1

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        result = [1]
        prod = 1
        for i in range(len(nums)):
            result.append(prod)
            prod *= nums[i]
        prod = 1
        for i in range(len(nums)-2,-1,-1):
            result[i] *= prod
            prod *= nums[i]
        return result

        
        
        
