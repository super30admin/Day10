########### Method 1: two pointer ############
class Solution:
    # Time Complexity : O(N)
    # Space Complexity: O(1)
    def productExceptSelf(self, nums: List[int]) -> List[int]:
    # Initialize left and right products
        left_prod = 1
        right_prod = 1
        
        # Initialize pointers for left and right ends of the list
        l = 0
        r = len(nums) - 1
        
        # Initialize the result list with 1s, of the same length as the input list
        result = [1 for i in range(len(nums))]
        
        # Loop through the list from both ends
        while l < len(nums) and r > -1:
            # Update the result list for the current positions l and r
            result[l] = result[l] * left_prod
            result[r] = result[r] * right_prod
            
            # Update the left and right running products
            left_prod = left_prod * nums[l]
            right_prod = right_prod * nums[r]
            
            # Move the left pointer to the right and the right pointer to the left
            l += 1
            r -= 1
        
        # Return the final result list
        return result

############# Method 2: Without 2 pointer #############

# class Solution:
#     # Time Complexity : O(N)
#     # Space Complexity: O(1)
#     def productExceptSelf(self, nums: List[int]) -> List[int]:
#     # Check if the input list is None or empty
#     if nums == None or len(nums) == 0:
#         return []
    
#     # Initialize the running product to 1
#     rp = 1
#     # Create a result list initialized with 1s, of the same length as the input list
#     result = [1 for x in range(len(nums))]
    
#     # First pass: Calculate the running product of elements to the left of each index
#     for i in range(1, len(nums)):
#         rp = rp * nums[i - 1]
#         result[i] = rp
    
#     # Reset the running product to 1
#     rp = 1
    
#     # Second pass: Calculate the running product of elements to the right of each index
#     for i in range(len(nums) - 2, -1, -1):
#         rp = rp * nums[i + 1]
#         result[i] = rp * result[i]
    
#     # Return the final result list
#     return result
