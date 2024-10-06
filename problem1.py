class Solution(object):
    # Time Complexity: O(n), where n is the length of the input list `nums`.
    # Space Complexity: O(n) for the result array, but O(1) extra space if output array doesn't count towards space complexity.
    # Approach:
    # 1. Initialize the `result` array with 1s of the same length as `nums`.
    # 2. Compute the prefix product for each element and store it in `result`. 
    #    The prefix product for an index `i` is the product of all elements before `i` in the `nums` array.
    # 3. Then compute the postfix product for each element and multiply it with the corresponding element in `result`.
    #    The postfix product for an index `i` is the product of all elements after `i` in the `nums` array.
    # 4. The result array now contains the product of all elements in the array except the element at that index.
    
    def productExceptSelf(self, nums):
        result = [1] * len(nums)

        # Prefix product pass
        prefix = 1
        for i in range(len(nums)):
            result[i] *= prefix
            prefix *= nums[i] 
        
        # Postfix product pass
        postfix = 1
        for i in range(len(nums)-1, -1, -1):
            result[i] *= postfix
            postfix *= nums[i]

        return result
