# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Product of Array Except Self

https://leetcode.com/problems/product-of-array-except-self/description/

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n
        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]
        suffix = 1
        print(result)
        for i in range(n - 1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]
        
        return result

        # result = []
        # n = len(nums)
        # preProd = [1] * n
        # postProd = [1] * n
        # prod = 1
        # for i in range(n):
        #     preProd[i] = prod
        #     prod *= nums[i]
        # prod = 1
        # for i in range(n -1,-1,-1):
        #     postProd[i] = prod
        #     prod *= nums[i]
        # for i in range(n):
        #     product = preProd[i] * postProd[i]
        #     result.append(product)
        # return result

        # result = []
        # for i in range(len(nums)):
        #     product = 1
        #     for j in range(len(nums)):
        #         if i != j:
        #             product = product * nums[j]
        #     result.append(product)
        # return result
