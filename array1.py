# LeetCode 238

class Solution(object):
    def productExceptSelf(self, nums):
        ans = [1]
        index = 1
        while index < len(nums):
            ans.append(ans[index-1] * nums[index-1])
            index += 1
        index = index - 2
        rp = 1
        while index > -1:
            rp *= nums[index+1]
            ans[index] = ans[index] * rp
            index -= 1
        return ans
    
#LeetCode 498
    
class Solution(object):
    def findDiagonalOrder(self, mat):
        ans = []
        iterate = 0
        bound = len(mat) * len(mat[0])
        i = 0
        j = 0
        dir = True
        while iterate < bound:
            ans.append(mat[i][j])
            if dir == True:
                if i == 0 and j != len(mat[0]) - 1:
                    j += 1
                    dir = False
                elif j == len(mat[0]) - 1:
                    i += 1
                    dir = False
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != len(mat) - 1:
                    i += 1
                    dir = True
                elif i == len(mat) - 1:
                    j += 1
                    dir = True
                else:
                    i += 1
                    j -= 1
            iterate += 1
        return ans
    
#LeetCode 54
    
class Solution(object):
    def spiralOrder(self, matrix):
        top = 0
        left = 0
        right = len(matrix[0]) - 1
        buttom = len(matrix) - 1
        result = []
        while left <= right and top <= buttom:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            for i in range(top, buttom + 1):
                result.append(matrix[i][right])
            right -= 1
            if left > right or top > buttom:
                break
            j = right
            while j >= left:
                result.append(matrix[buttom][j])
                j -= 1
            buttom -= 1
            i = buttom
            while i >= top:
                result.append(matrix[i][left])
                i -= 1
            left += 1
        return result