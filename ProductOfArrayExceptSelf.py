# Time Complexity : O(n)
# Space Complexity : O(n)
class Solution:
    def productExceptSelf(self, nums):
        if not nums:
            return []
        
        n = len(nums)
        l_p = [0] * n
        r_p = [0] * n
        ans = [0] * n
        
        l_p[0] = 1
        r_p[n - 1] = 1
        
        for i in range(1, n):
            l_p[i] = l_p[i - 1] * nums[i - 1]
            r_p[n - i - 1] = r_p[n - i] * nums[n - i]
        
        for i in range(n):
            ans[i] = l_p[i] * r_p[i]
        
        return ans

# Example 1
solution = Solution()
nums = [1, 2, 3, 4]
print(solution.productExceptSelf(nums))  # Output: [24, 12, 8, 6]

# Example 2
nums = [4, 5, 1, 8, 2, 10, 6]
print(solution.productExceptSelf(nums))  # Output: [4800, 3840, 19200, 2400, 9600, 1920, 3200]

# Example 3
nums = [7, 3, 9, 4, 12, 15]
print(solution.productExceptSelf(nums))  # Output: [19440, 45360, 15120, 34020, 11340, 9072]