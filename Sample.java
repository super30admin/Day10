// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 238. Product of Array Except Self
class Solution(object): //O(N)
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left = []
        right = [1]*len(nums)
        left.append(1)
        right[-1] = 1
        result = []
        #left
        for i in range(0,len(nums)-1):
            temp = left[i]*nums[i]
            left.append(temp)
        print(right)
        for i in range(len(nums)-2,-1,-1):
            # print(i)
            temp = right[i+1] * nums[i+1]
            right[i] = temp
        for i in range(len(nums)):
            result.append(left[i]*right[i])
        return result

//498. Diagonal Traverse
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])

        #intialize row and column and direction
        r = 0
        c = 0
        upDir = True

        #intialize result array
        result = [0]*(m*n)

        for i in range(0,m*n): //O(M*N)
            result[i] = mat[r][c]
            if(upDir):
                if(c == n-1):
                    r+=1
                    upDir = False
                elif(r == 0):
                    c+=1
                    upDir = False
                else:
                    r-=1
                    c+=1
            else:
                if(r == m-1):
                    c+=1
                    upDir = True
                elif(c == 0):
                    r+=1
                    upDir = True
                else:
                    r+=1
                    c-=1
        return result


//54. Spiral Matrix
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m=len(matrix)
        n=len(matrix[0])
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        result = []

        while top <= bottom and left <= right: //O(M*N)
            #check from left to right[top]
            if(top <= bottom and left <= right):
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                top+=1

            #check from top to bottom[right]
            if(top <= bottom and left <= right):
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right-=1

            #check from right to left[bottom]
            if(top <= bottom and left <= right):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            
            #check from bottom to top[left]
            if(top <= bottom and left <= right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result



