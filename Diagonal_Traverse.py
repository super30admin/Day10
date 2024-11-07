# Approach: Traverse the matrix diagonally by iterating over each diagonal's starting points and switching direction with each new diagonal.
# Use a dictionary to collect elements by their diagonal index (row + col), and then construct the output array by appending elements in reverse order for alternating diagonals.
# This approach ensures that elements are traversed in the required diagonal order and simplifies handling direction changes.

# Time Complexity: O(M * N), where M is the number of rows and N is the number of columns, as each element is visited once.
# Space Complexity: O(M * N), required to store the output and diagonal groups in the dictionary.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

from typing import List
from collections import defaultdict

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        # Initialize a dictionary to group elements by their diagonal indices
        diagonals = defaultdict(list)
        M, N = len(matrix), len(matrix[0])
        
        # Populate the dictionary with elements grouped by their diagonal level (row + col)
        for row in range(M):
            for col in range(N):
                diagonals[row + col].append(matrix[row][col])
        
        # Build the result array by adding diagonals in alternating order
        result = []
        for k in range(M + N - 1):
            if k % 2 == 0:
                # Reverse order for even diagonals (top-right to bottom-left)
                result.extend(diagonals[k][::-1])
            else:
                # Maintain order for odd diagonals (bottom-left to top-right)
                result.extend(diagonals[k])
        
        return result
