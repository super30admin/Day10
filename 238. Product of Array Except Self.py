#for prefix, assign 1 at the start of the array. multiply prefix by array element.
#store the result in another array, update prefix
#do a back pass, track a postfix variable,


# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        n = len(nums)
        outputArr = [int] * n

        #prefix run
        prefix = 1
        for i in range(0, n):
            outputArr[i] = prefix
            prefix = prefix * nums[i]
        
        # post fix run
        postfix = 1
        for j in range(n-1, -1, -1):
            outputArr[j] *= postfix
            postfix = nums[j] * postfix

        return outputArr


        
