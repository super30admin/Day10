#Time complexity - 0(n) & space complexity - o(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums == None or len(nums)==0:
            return []
        n= len(nums)
        rp=1
        result=[0 for i in range(n)]
        result[0]=1
        for i in range (1, n):
            rp = rp * nums[i-1]
            result[i]=rp
        rp =1
        for i in range (n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i]* rp
        return result