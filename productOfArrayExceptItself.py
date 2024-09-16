#Leetcode Problem 238
class Solution:
    def productExceptSelf(self, nums):
        l=[1]*len(nums)
        r=[1]*len(nums)
        
        for i in range(1,len(nums)):
            l[i]=l[i-1]*nums[i-1]
            
        for i in range(len(nums)-2,-1,-1):
            r[i]=r[i+1]*nums[i+1]
            
        for i in range(len(nums)):
            nums[i]=l[i]*r[i]
        return nums

#TC: O(n)
#SC: O(n)