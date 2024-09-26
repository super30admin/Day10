"""
Leetcode: https://leetcode.com/problems/product-of-array-except-self/
Given an array nums of n integers where n > 1,
return an array output such that output[i] is equal to the product of all the
elements of nums except nums[i].
Example: Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).
:return
"""


class Solution:
    def productExceptSelf(self, nums):
        leftrunningproductList=[None]*len(nums)
        # print(len(leftrunningproductList))
        rightrunningproductList=[None]*len(nums)

        ##for calculating left
        rp=1
        leftrunningproductList[0]=1
        for i in range(1, len(nums)):
            rp=rp*nums[i-1]
            leftrunningproductList[i]=rp
        print(leftrunningproductList)

        # return leftrunningproductList

        rp = 1
        rightrunningproductList[len(nums)-1]=1
        for i in range(len(nums)-2,-1,-1):
            rp=rp*nums[i+1]
            rightrunningproductList[i]=rp
        print(rightrunningproductList)


        for i in range(len(nums)):
            leftrunningproductList[i]=leftrunningproductList[i]* rightrunningproductList[i]

        return leftrunningproductList











nums = [1, 2, 3, 4]
print(nums)
solve=Solution()
print(solve.productExceptSelf(nums))
