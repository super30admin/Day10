# TC - O(n)
# SC - O(1) , the final answer does not add to the space complexity

# Approach :

# compute the left running product and the right running product
# store the answers of the left running product in a ans array
# compute the right running product and update the exisiting answer array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        if not nums:
            return -1

        lenNums = len(nums)
        result = []
        result.append(1)
        prod = 1

        for i in range(1, lenNums):
            prod = prod * nums[i-1]
            result.append(prod)

        prod = 1

        for i in range(lenNums-2, -1, -1):
            prod = prod * nums[i+1]
            result[i] = prod * result[i]

        return result
