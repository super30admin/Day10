############# Product of element except self ########

# Time Complexity : O(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes

# compute the left product then while computing the right product multiply the left and right.

def product_except_self(nums):
    if not nums:
            return []
            
    left_product = [1]*len(nums)
    for i in range(1,len(nums)):
        left_product[i] = nums[i-1]*left_product[i-1]
            
    right_product = 1
    for j in range(len(nums)-1,-1,-1):
        left_product[j] = left_product[j] * right_product
        right_product *= nums[j]
    return left_product
