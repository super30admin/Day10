# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
def productExceptSelf(self, nums: List[int]) -> List[int]:
        running_product = 1
        n = len(nums)
        result = [1] * n
        #  left to right
        for i in range(1,n):
            running_product = running_product * nums[i-1]
            result[i] = running_product
        running_product = 1
        # right to left
        # for loop i python excludes the upper boundary so set up stop 1 greater than desired(i.e. -1)
        for i in range(n - 2,-1, -1):
            running_product = running_product * nums[i+1]
            result[i]  = result[i] * running_product
        return result

