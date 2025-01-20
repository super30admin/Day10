class Solution:
    
    def getSolution(self,nums):
        
        # result list
        resultList = []
        
        # Set direction
        '''
        dir = 1 (upward)
        dir = -1 (downward)
        '''
        dir = 1
        
        # traverse the matrix
        rows = len(nums)
        cols = len(nums[0])
        count = rows * cols
        
        # row and columns counter
        row = 0
        col = 0
        
        while count > 0:
            # do the stuff
            resultList.append(nums[row][col])
            
            # Direction is upward i.e. dir = 1
            if dir == 1:
                
                # Case 1: 0th row but not last-column
                if row == 0 and col != cols-1:
                    dir = -1
                    # row will be same
                    col +=1
                
                # Case 2: mth row but last-column
                elif col == cols-1:
                    dir = -1
                    row +=1
                    # col will be same
                
                # Case 3: general traversal
                else:
                    row -= 1
                    col += 1
                
            # Direction is downward i.e. dir = -1
            elif dir == -1:
                
                # Case 1: 0th col but not last-row
                if col == 0 and row != rows-1:
                    dir = 1
                    row += 1
                    # col will be same
                
                # Case 2: nth col but last-row
                elif row == rows-1:
                    dir = 1
                    # row will be same
                    col += 1
                # Case 3: general traversal
                else:
                    row += 1
                    col -= 1
            
            
            count -=1
            continue
        
        return resultList
        

sol = Solution()
print(sol.getSolution(
    [
        [1,2,3,4],
        [5,6,7,8],
        [9,10,11,12],
        [13,14,15,16]
    ]
))

# [[1,2,3],[4,5,6],[7,8,9]]

print(sol.getSolution(
    [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]
))