#Time Complexity :O(n) where n is the size of the array
#Space Complexity : O(n) 
#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english:
#1. Create an array that has products of all elements left of an index, and similarly an array that
# has products to the right of an index. This gives us two arrays - whuich we multiply each element with the other array 
#to get the final array. 

#Your code here along with comments explaining your approach

def productExceptSelf(nums):
    #create the product array filled with 1's:
        productArray = [1 for x in range(len(nums))]
        leftArray = [1 for y in range(len(nums))]
        rightArray = [1 for z in range(len(nums))]
        
        leftProduct = 1
        for i in range(len(nums)):
            leftArray[i] = leftProduct
            leftProduct *= nums[i]
        
        rightProduct = 1
        for i in reversed(range(len(nums))):
            rightArray[i] = rightProduct
            rightProduct *= nums[i]

        
        for i in range(len(nums)):
            productArray[i] = leftArray[i] * rightArray[i]
            
        return productArray

#print(productExceptSelf([1,2,3,4]))
