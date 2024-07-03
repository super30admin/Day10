#In this code, I implemented a function to traverse a matrix in spiral order. If the matrix is empty, it returns an empty list. For a non-empty matrix, I initialize the top, bottom, left, and right boundaries. I then use a while loop to traverse the matrix in layers. Within the loop, I traverse right along the top row, down the rightmost column, left along the bottom row (if within bounds), and up the leftmost column (if within bounds), adjusting the boundaries after each traversal. This process continues until all elements are added to the result list in spiral order.
#The time complexity is O(m×n), where m is the number of rows and n is the number of columns in the matrix. The space complexity is O(m×n) for storing the result.

def spiralOrder(matrix):
    if not matrix or not matrix[0]:
        return []
    
    result = []
    top, bottom = 0, len(matrix) - 1
    left, right = 0, len(matrix[0]) - 1
    
    while top <= bottom and left <= right:
        # Traverse right
        for col in range(left, right + 1):
            result.append(matrix[top][col])
        top += 1
        
        # Traverse down
        for row in range(top, bottom + 1):
            result.append(matrix[row][right])
        right -= 1
        
        if top <= bottom:
            # Traverse left
            for col in range(right, left - 1, -1):
                result.append(matrix[bottom][col])
            bottom -= 1
        
        if left <= right:
            # Traverse up
            for row in range(bottom, top - 1, -1):
                result.append(matrix[row][left])
            left += 1
    
    return result