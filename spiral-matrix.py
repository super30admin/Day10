# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


startrow, endrow = 0, len(matrix) - 1
startcol, endcol = 0, len(matrix[0]) - 1
spiral_order = []

while startrow <= endrow and startcol <= endcol:
    # first row
    for col in range(startcol, endcol+1):
        spiral_order.append(matrix[startrow][col])

    # last col
    for row in range(startrow+1, endrow+1):
        spiral_order.append(matrix[row][endcol])

    # last row
    if startrow != endrow:
        for col in range(endcol-1, startcol-1, -1):
            spiral_order.append(matrix[endrow][col])

    # first col
    if startcol != endcol:
        for row in range(endrow-1, startrow, -1):
            spiral_order.append(matrix[row][startcol])
    
    startrow, endrow, startcol, endcol = startrow+1, endrow-1, startcol+1, endcol-1

return spiral_order