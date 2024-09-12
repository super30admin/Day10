#Time Complexity :O(n ^ 2) where n is the size of the array
#Space Complexity : O(n) 
#Did this code successfully run on Leetcode :
#Three line explanation of solution in plain english:
#Brute force approach -
#1. Traverse through the array and caclulate the product when i is not equal to j. 

#Your code here along with comments explaining your approach

def productExceptSelf(nums):
    #create the product array:
    productArray = [1 for x in range(len(nums))]
    for i in range(len(nums)):
        product = 1
        for j in range(len(nums)):
            if i != j:
                product *= nums[j]
        productArray[i] = product
    return productArray

#print(productExceptSelf([1,2,3,4]))