#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes

#Three line explanation of solution in plain english
#--> Multiple all the elements which are left to existing iterating and store it in an array
#--> Multiple all the elements which are right to existing iterating element and multiple it with the left product array

#Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # We are appending with all 1's in result to define it's length
        result = [1 for i in range(n)]
        # Initialise left product as 1 to so that the first element can be multiplied to itself
        lp = 1
        result[0]=lp
        # Iterate from first index to last as lp of 1st index is 0th index
        for i in range(1,n): #In range first element is inclusive and last is exclusive
            lp = nums[i-1]*lp
            result[i]=lp
        # Initialise right produc as 1 to so that the first element can be multiplied to itself
        rp = 1
        # Iterate from last but one index to first as rp of last index is 1
        for i in range(n-2,-1,-1): #Last -1 is step count
            rp = nums[i+1]*rp
            #Multiply rp with exist lp in result array
            result[i]=result[i]*rp
        return result