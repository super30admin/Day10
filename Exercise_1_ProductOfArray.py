# Time Complexity :

# O(N)


# Space Complexity :  

# O(1)  , Since answer is expected in form of array, array size for "result" doen't count towards increasing space complexity 




# Approach:
# Use running sum to first calculate the left product for each element in input array
# and then caluclate right product by multipying the elemnts on right and current left product.

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums or len(nums)==0:
            return []
        
        n = len(nums)

        # running product to store the product of numbers
        rp = 1

        # result array
        product = [1]*n

        # start filling the array for left-side product
        for i in range(1, n):
            rp = rp * nums[i-1]
            product[i] = pr
        
        # reset the running-product variable
        rp = 1

        # start filling the array for right-side product
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            product[i] = product[i] * rp

        return product