class Solution:
    def prodExNo(self, nums):
        prodArr = [None]*len(nums)
        i = 0
        while i < len(nums):
            j = 0
            while j < len(nums):
                
                if i == j:
                    j += 1
                elif prodArr[j] is None:
                    prodArr[j] = nums[i]
                    j += 1
                else:
                    prodArr[j] = prodArr[j] * nums[i]
                    j += 1
            i += 1
        return prodArr
    #O(n) TC Solution
    def prodInO_n(self,nums):
        output = [None]*len(nums)
        i= 0
        
        #Calculating prefix
        while i < len(nums):
            if i == 0:
                output[i] = nums[i]
            
            else:
                output[i] = output[i-1] * nums[i]
            i += 1
        
        #Calculate post fix
        i = len(nums)-1
        postfix = 1
        while i > -1:
            if i == len(nums)-1:
                output[i] = output[i-1] 
            elif i == 0:
                output[i] = postfix * nums[i+1]
            else:
                postfix = postfix * nums[i+1]
                output[i] = output[i-1] * postfix
            i -= 1
                
                
        return output

    
s = Solution()

print(s.prodExNo([1,2,3,4]))
print(s.prodInO_n([1,2,3,4]))