# // Time Complexity : O(n) we need to visit all other elements in the array except the self
# // Space Complexity : O(n) we are using result array to store the output.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#Took running product and the first and last element considered as 1 then multiplying with the next element and storing it in result array from the left to right. 
#Same approach and updating the result array by multiplying from right to left.

from typing import List
import numpy as np


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        self.bruteForceSolution(nums)
        return

    def OptimizedSolution(self, nums: List[int]) -> List[int]:
        np.array([0]*len(nums))
        LList = np.array([0]*len(nums))
        RList = np.array([0]*len(nums))
        result = np.array([0]*len(nums))
        LeftProd = 0
        RightProd = 0
        for i in range(len(nums)):
            if i == 0:
                LeftProd = 1
            else:
                LeftProd *= nums[i - 1]
            
            LList[i] = LeftProd

        for i in range(len(nums) - 1, -1, -1):
            if i == len(nums) - 1:
                RightProd = 1
            else:
                RightProd *= nums[i + 1]
            
            RList[i] = RightProd
            result[i] = LList[i] * RList[i]

        print(LList)
        print(RList)
        print(result)
        return

    def bruteForceSolution(self, nums: List[int]) -> List[int]:
        lstProduct = []
        for i in range(len(nums)):
            totalProduct = 1
            for j in range(len(nums)):
                if i != j:
                    totalProduct *= nums[j]

            lstProduct.append(totalProduct)
        print(lstProduct)
        return lstProduct


obj = Solution()
# obj.bruteForceMethod([1, 2, 3, 4])
obj.OptimizedSolution([1, 2, 3, 4])