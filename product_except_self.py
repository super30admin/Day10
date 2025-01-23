def product_except_self(nums):
    n = len(nums)
    output = [1] * n
    
    # First pass: compute left products
    left = 1
    for i in range(n):
        output[i] = left
        left *= nums[i]
    
    # Second pass: compute right products and multiply with left products
    right = 1
    for i in range(n-1, -1, -1):
        output[i] *= right
        right *= nums[i]
    
    return output

# time complexity O(n)
# space complexity O(n)
