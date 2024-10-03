class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        res = [1] * n  # Initialize result array with 1s

        rp = 1  # Running product from the left
        for i in range(1, n):
            rp = nums[i - 1] * rp  # Update running product
            res[i] = rp  # Store product so far

        rp = 1  # Reset running product for right pass
        for i in range(n - 2, -1, -1):
            rp = nums[i + 1] * rp  # Update running product from the right
            res[i] = res[i] * rp  # Multiply with left-side product

        return res


# time complexity is O(n) where n is length of nums
# space complexity is O(1) since res and rp is not considered as negligible
