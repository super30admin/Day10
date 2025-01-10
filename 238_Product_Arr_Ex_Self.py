#T= O(n)
#S= O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr=list()
        rp=1
        n= len(nums)
        for i in range(n):
            arr.append(rp)
            rp = rp*nums[i]
        rp=1
        for i in range(n-2,-1,-1):
            rp = nums[i+1] * rp
            arr[i]= arr[i]*rp

        return arr
        
        
