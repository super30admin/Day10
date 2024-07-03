# // Time Complexity : O(n)
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : it was a bit tricky when i was combining the 2 arrays of product into one array.


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        rp = 1
        result.append(rp)
        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            result.append(rp)
        print(result)
        rp = 1
        for i in range(len(nums)-2, -1,-1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp
        
        return result
    

    # Approach:
    # intitally my thought was to use 2 for loops and iterate over the array calculating the product. 
    # Then i tried the running product approach where i take the running product from left andf then running product from right in the second array and then multiply them.
    # after that i tried to reduce the space complexity by using only one array.