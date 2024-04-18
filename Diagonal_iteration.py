# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# traverse each element element in the matrix, 
# create a hashmap , store the items in key value pair, key will be the sum of the index , and value will be the value on the certain index
# even key means, is reverse order is stored in the result

# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        hmap = {}
        result = []
        for i in range(len(mat)):
            for j in range (len(mat[i])):
                _sum = i + j
                if _sum in hmap:
                    hmap[_sum].append(mat[i][j])
                else:
                    hmap[_sum] = [mat[i][j]]

        for k , v in hmap.items():
            if k % 2 == 0 :
                reverse_val = v[::-1]
                result = result + reverse_val
            else:
                print(v)
                result = result + v

        return result
