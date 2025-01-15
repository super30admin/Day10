######### Diagonal Order of Matrix #######

# Time Complexity : O(n*m) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Challenges faced while coding this problem : Made mistakes in the ordering of the conditions and swapped the m & n.

# keep two variables row and column and based on if they are at the first or last row analyse the various situations in upwards or downwards and update their values accordingly.

def diagonal_order_matrix(matrix):
        if not matrix:
            return []
            
        m = len(matrix)
        n = len(matrix[0])
        
        result = []
        
        r,c = 0, 0
        dir = 1
        i = 0
        while r < m and c < n:
            result.append(matrix[r][c])
            i+=1
            if dir == 1:
                if c==n-1:
                    dir  = dir*(-1)
                    r +=1
                elif r == 0:
                    dir  = dir*(-1)
                    c+=1   
                else:
                    r-=1
                    c+=1  
            else:
                if r==m-1:
                    dir  = dir*(-1)
                    c+=1   
                elif c == 0:
                    dir = dir*(-1)
                    r+=1
                else:
                    r+=1
                    c-=1      
                    
        return result
