# TC: O(N)
# SC: O(1)
# For array, if we have input and output as array and we create auxillary array to calculate the logic, SC will always be that auxillary array space and not the Ip/Op arrays.

#Logic is to calculate product of left items from the current index element, and then multiply with right items in the second loop

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        runningProduct = 1
        product_array = []
        product_array.append(runningProduct) #Dont count first element and just add runningproduct as first index

        #Count product of left elements from current element
        for i in range(1,len(nums)):
            runningProduct = nums[i-1]*runningProduct
            product_array.append(runningProduct)

        #Reassign runningproduct as 1 to calculate products of right elements
        runningProduct = 1

        #Instead of recalculating entire array of products of right elements, just multiply right element with runningproduct and multiply that with array with left products
        for j in reversed(range(len(nums))):
            product_array[j] = runningProduct*product_array[j]
            runningProduct = runningProduct*nums[j]
        
        return product_array
        
obj= Solution()
nums = [1,2,3,4,5]
resultant_array = obj.productExceptSelf(nums)
print(resultant_array)