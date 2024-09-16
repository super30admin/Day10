#timecomplexity O(n)
#Spacecomplexity O(n)
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if len(nums)<2:
            return [0]
        left_prod = [1]*len(nums)        
        for i in range(1,len(nums)):
            left_prod[i] = (left_prod[i-1]*nums[i-1])
        rp = 1 
        for i in (reversed(range(len(nums)))):
            ans = rp*left_prod[i]
            rp = rp*nums[i]
            nums[i] = ans
        return nums
    
#input array
solution = Solution()
nums = [1, 2, 3, 4]
output = solution.productExceptSelf(nums)
print(output)