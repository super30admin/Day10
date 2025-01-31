#Problem 1: Product of Array Except Self 
# Explanation
#Use two passes: first, store the left product (left[i] = nums[i-1] * left[i-1]), then store the right product (right[i] = nums[i+1] * right[i+1]).
#Compute the result as output[i] = left[i] * right[i].
#Instead of extra arrays, update output in-place using a running product from both left and right directions.
#Time Complexity: O(n), Space Complexity: O(1) (excluding output array).

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [1] * n
        left_product = 1
        
        for i in range(n):  # Left pass
            output[i] = left_product
            left_product *= nums[i]
        
        right_product = 1
        for i in range(n-1, -1, -1):  # Right pass
            output[i] *= right_product
            right_product *= nums[i]
        
        return output
#Problem 2: Diagonal Order Traversal of a Matrix
# Explanation
#Use a dictionary where the key is row + col (diagonal index) and store elements in lists.
#Append elements in order, and for even diagonals, reverse them before adding to the result.
#Iterate over the matrix, storing elements in their respective diagonals.
#Time Complexity: O(M×N), Space Complexity: O(M×N).

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        diagonals = defaultdict(list)
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                diagonals[i + j].append(mat[i][j])
        
        result = []
        for key in sorted(diagonals.keys()):
            if key % 2 == 0:
                result.extend(reversed(diagonals[key]))  # Reverse even diagonals
            else:
                result.extend(diagonals[key])
        
        return result

##Problem 3: Spiral Order Traversal of a Matrix
# Explanation
##Use four boundaries (top, bottom, left, right) and iterate through the matrix in layers.
##Move right, then down, then left, then up, updating boundaries accordingly.
##Repeat until all elements are visited.
##Time Complexity: O(M×N), Space Complexity: O(1) (excluding output array).
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        result = []
        top, bottom, left, right = 0, len(matrix) - 1, 0, len(matrix[0]) - 1
        
        while top <= bottom and left <= right:
            for i in range(left, right + 1):  # Move right
                result.append(matrix[top][i])
            top += 1
            
            for i in range(top, bottom + 1):  # Move down
                result.append(matrix[i][right])
            right -= 1
            
            if top <= bottom:
                for i in range(right, left - 1, -1):  # Move left
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            if left <= right:
                for i in range(bottom, top - 1, -1):  # Move up
                    result.append(matrix[i][left])
                left += 1
        
        return result


