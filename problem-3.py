# TC - O(m*n)
# SC - O(1) , the final answer does not add to the space complexity, as it is expected to return a array

# Approach :

# to create a spiral pattern, assign four position variables left=0, top=0 right =len(columns)-1 bottom = len(rows)-1
# first move from left to right
# increment top by 1
# move from top to bottom from the right side
# decrement right
# check if top is less than bottom, because if not, we will endup repeating the elements
# move from right to left
# decrement bottom
# check if left is less than right , else we will endup repeating the same elements

class Solution:
    def spiralOrder(self, arr: List[List[int]]) -> List[int]:

        if not arr:
            return -1

        noRows = len(arr)
        noCols = len(arr[0])

        top = 0
        left = 0
        right = noCols-1
        bottom = noRows-1

        ans = []

        while (left <= right and top <= bottom):

            for i in range(left, right+1):
                ans.append(arr[top][i])
            top = top+1

            for i in range(top, bottom+1):
                ans.append(arr[i][right])
            right = right-1

            if (top <= bottom):
                for i in range(right, left-1, -1):
                    ans.append(arr[bottom][i])
                bottom = bottom-1

            if (left <= right):

                for i in range(bottom, top-1, -1):

                    ans.append(arr[i][left])
                left = left+1

        return ans
