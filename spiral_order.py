def spiral_order(matrix):
    if not matrix or not matrix[0]:
        return []
    
    result = []
    M, N = len(matrix), len(matrix[0])
    top, bottom = 0, M - 1
    left, right = 0, N - 1
    
    while top <= bottom and left <= right:
        # Traverse from Left to Right
        for j in range(left, right + 1):
            result.append(matrix[top][j])
        top += 1
        
        # Traverse Downwards
        for i in range(top, bottom + 1):
            result.append(matrix[i][right])
        right -= 1
        
        if top <= bottom:
            # Traverse from Right to Left
            for j in range(right, left - 1, -1):
                result.append(matrix[bottom][j])
            bottom -= 1
        
        if left <= right:
            # Traverse Upwards
            for i in range(bottom, top - 1, -1):
                result.append(matrix[i][left])
            left += 1
    
    return result

# time : O(m+n)
# space : O(m+n)
