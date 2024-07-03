#I implemented a function to traverse a matrix in diagonal order. If the matrix is empty, it returns an empty list. For a non-empty matrix, it iterates through each diagonal, starting from the top row or the rightmost column. For each diagonal, I collect the elements in a temporary list while moving from top-right to bottom-left. If the diagonal index is even, I reverse the collected elements before adding them to the result list; otherwise, I add them directly. This ensures that the traversal alternates between left-to-right and right-to-left for each diagonal. The final result is a list of matrix elements in diagonal order.
#The time complexity is O(m×n), where m is the number of rows and n is the number of columns in the matrix. Space complexity is O(m×n) for storing the result.

def findDiagonalOrder(matrix):
    if not matrix or not matrix[0]:
        return []
    
    m, n = len(matrix), len(matrix[0])
    result = []
    
    for diagonal in range(m + n - 1):
        temp = []
        row = 0 if diagonal < n else diagonal - n + 1
        col = diagonal if diagonal < n else n - 1
        
        while row < m and col >= 0:
            temp.append(matrix[row][col])
            row += 1
            col -= 1
        
        if diagonal % 2 == 0:
            result.extend(temp[::-1])
        else:
            result.extend(temp)
    
    return result