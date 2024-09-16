# Time Complexity: O(N), where N is length of nums
# Space Complexity: O(1)
# Executed Successfully: Yes
# Challenges faced: No


#CODE
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        temp = [None for _ in range(len(nums))]
        temp[0] = 1
        rp = 1
        for i in range(1,len(nums)):
            rp *= nums[i-1]
            temp[i] = rp
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp *= nums[i+1]
            temp[i] *= rp
        return temp