class Solution:
    # Time Complexity: O(N*M)
    # Space Complexity: O(1) for the extra space used, not counting the output list

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        minr = 0
        minc = 0
        maxr = len(matrix)-1
        maxc = len(matrix[0])-1
        result = []
        while minr <= maxr and minc <= maxc:
            #left to right (row remain the min row and col will inc)
            for i in range(minr, maxc+1):
                result.append(matrix[minr][i])
            minr += 1

            # top to bottom (row will inc and col will remain the max col)
            for i in range(minr, maxr+1):
                result.append(matrix[i][maxc])
            maxc -= 1

            # Right to left(col(maxc) will dec and row(maxr) will remain the same)
            if minr <= maxr:
                for i in range(maxc,minc-1,-1):
                    result.append(matrix[maxr][i])
                maxr -= 1

            # Bottom to top (maxr will dec and col(minc) will remain the same)
            if minc <= maxc:
                for i in range(maxr,minr-1,-1):
                    result.append(matrix[i][minc])
                minc += 1
        return result


########### Method 2 ##########
# Time Complexity: O(N*M)
# Space Complexity: O(1) for the extra space used, not counting the output list

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        minr = 0
        minc = 0
        maxr = len(matrix)-1
        maxc = len(matrix[0])-1
        result = []
        cnt =0
        tne = len(matrix) * len(matrix[0])
        while cnt < tne:
            #left to right
            if cnt <tne:
                for i in range(minr,maxc+1):
                    result.append(matrix[minr][i])
                    cnt +=1
                minr += 1
            #top to bottom
            if cnt <tne:
                for i in range(minr,maxr+1):
                    result.append(matrix[i][maxc])
                    cnt +=1
                maxc -=1
            # right to left (row (max) remain the same col will dec)
            if cnt <tne:
                for i in range(maxc,minc-1,-1):
                    result.append(matrix[maxr][i])
                    cnt +=1
                maxr -=1
            # bottom to top(row will dec and col(min) remain same)
            if cnt <tne:
                for i in range(maxr,minr-1,-1):
                    result.append(matrix[i][minc])
                    cnt +=1
                minc += 1    
        return result   

        
