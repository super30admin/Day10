# // Time Complexity :O(n) for traversal
# // Space Complexity :O(n) for result array
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# We create product of all elements to the left(running product) and store in result array.
# We don't touch OG nums, we use the resultant array itself to multiply with original array.
# Store product of left* right in resultant array, essentially excluding number ar current index.

# // Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        
        size = len(nums)
        rp = 1
        result = [1]*size
        result[0] = rp 
        # [1,2,3,4]
        for i in range(1,size):         # left product 
            rp = rp*nums[i-1]           
            result[i] = rp              # [1,1,2,6]
            # print(rp)

        rp2 = 1                         # right product 
        for i in range(size-2,-1,-1):   # //second last to last
            rp2 = rp2*nums[i+1]         # [24,12,4,1] in rev :[1,4,12,24]   
            result[i] = result[i] * rp2 # lp* rp -> [24,12,8,6]
            # print(rp2)
        return result
    


print(Solution().productExceptSelf([-1,1,0,-3,3]))
print(Solution().productExceptSelf([1,2,3,4]))
print(Solution().productExceptSelf([-30,1,0,5,-10,20]))