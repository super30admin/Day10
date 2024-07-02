#time = O(n)
#space = O(n)
def product_except_self(nums):
    n = len(nums)
    
    # Initialize the left and right arrays
    left = [0] * n
    right = [0] * n
    output = [0] * n
    #print(output)
    
    # Populate the left array
    left[0] = 1
    #print(left)
    for i in range(1, n):
        left[i] = nums[i - 1] * left[i - 1]
        #print(left)
    
    # Populate the right array
    right[n - 1] = 1
    print(right[n-3])
    for i in range(n - 2, -1, -1):
        right[i] = nums[i + 1] * right[i + 1]
        print(right)
    
    # Generate the output array
    for i in range(n):
        output[i] = left[i] * right[i]
    
    return output

# Test the function with the given input
nums = [1, 2, 3, 4, 5]
print(product_except_self(nums))  # Output: [24, 12, 8, 6]