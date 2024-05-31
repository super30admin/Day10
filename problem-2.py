# TC - O(m*n)
# SC - O(1) , the final answer does not add to the space complexity, as it is expected to return a array

# Approach :

# consider two directions one for top to bottom, and another for bottom to top
# while traversing bottom to top
# column increases, row decreases
# first check if column index is equal to the last index, if so increment the row
# then check if row is zero ( do not check if row is zero first as column gets incremented, it will throw index range)
# while traversing top to bottom
# column decreases, row increases
# first check if row index is equal to the last index, if so increment the coulmn
# then check if column is zero ( do not check if column is zero first as row gets incremented, it will throw index range)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        if not mat:
            return -1

        noRows = len(mat)
        noCols = len(mat[0])

        ans = []
        direction = 1
        index = 0
        i = 0
        j = 0

        while (index < noRows*noCols):
            ans.append(mat[i][j])
            index = index+1

            if (direction == 1):

                if j == noCols-1:
                    direction = -1
                    i = i+1

                elif i == 0:
                    direction = -1
                    j = j+1

                else:
                    i = i-1
                    j = j+1

            else:

                if i == noRows-1:
                    direction = 1
                    j = j+1

                elif j == 0:
                    direction = 1
                    i = i+1

                else:
                    j = j-1
                    i = i+1

        return ans
