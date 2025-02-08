#time complexity o(n)
#space complexity o(1)
#Worked on Leet code:yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        ans= [1]*n
        #left side
        pre=1
        for i in range(n):
            ans[i]=pre
            pre *= nums[i]

        #right side
        rh=1
        for i in range(n-1,-1,-1):
            ans[i]*= rh
            rh *= nums[i]
        return ans
         