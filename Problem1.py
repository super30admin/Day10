#In this code, I solved the "Product of Array Except Self" problem without using division and in O(n) time. First, I initialized an output list with 1s, which will store the final products. I then iterated through the input list nums to calculate the products of all elements to the left of each index, storing these in the output list. Next, I iterated through nums from right to left to calculate the products of all elements to the right of each index and combined these with the corresponding values in output. This results in each output[i] containing the product of all elements in nums except nums[i].
#The time complexity is O(n), where n is the length of nums and space complexity is O(n) for the output list. 

def productExceptSelf(nums):
    n = len(nums)
    output = [1] * n
    
    # Calculate left products
    left_product = 1
    for i in range(n):
        output[i] = left_product
        left_product *= nums[i]
    
    # Calculate right products and combine with left products
    right_product = 1
    for i in range(n - 1, -1, -1):
        output[i] *= right_product
        right_product *= nums[i]
    
    return output