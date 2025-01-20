class Solution:
    
    def getSolution(self,nums):
        
        # Result List
        resultList = []
        
        # Create ptr's
        lft = 0
        rt = len(nums[0])-1
        top = 0
        bottom = len(nums)-1
        
        # maintain count 
        count = len(nums) * len(nums[0])
        
        # Iterate the matrix
        while top <= bottom and lft <= rt:
            
            # Iterate the top
            for itr in range(lft,rt+1):
                if count > 0:
                    resultList.append(nums[top][itr])
                    count -= 1
                else:
                    break
            top += 1
            
            # Iterate the rt
            for itr in range(top,bottom+1):
                if count > 0:
                    resultList.append(nums[itr][rt])
                    count -= 1
                else:
                    break
            rt -= 1
            
            # Iterate the bottom
            for itr in range(rt,lft-1,-1):
                if count > 0:
                    resultList.append(nums[bottom][itr])
                    count -= 1
                else:
                    break
            bottom -= 1
            
            # Iterate the left
            for itr in range(bottom,top-1,-1):
                if count > 0:
                    resultList.append(nums[itr][lft])
                    count -= 1
                else:
                    break
            lft += 1
        
            continue
        
        return resultList
    
sol = Solution()

print(sol.getSolution(
    [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]
))

print(sol.getSolution(
    [
        [1,2,3,4],
        [5,6,7,8],
        [9,10,11,12],
        [13,14,15,16]
    ]
))

print(sol.getSolution(
    [
        [1,2,3,4],
        [5,6,7,8],
        [9,10,11,12]
    ]
    
))