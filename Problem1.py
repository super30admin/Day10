#Time Complexity: O(n)
#Space Complexity: O(n)
#LeetCode: Yes

from operator import pos


class Solution:
    def findProduct(self, arr):
        output = [1]*(len(arr))
        prefix = 1
        for i in range(len(arr)):
            output[i] = prefix
            prefix*=arr[i]

        postfix = 1
        for i in range(len(arr)-1, -1,-1):
            output[i]*=postfix
            postfix*=arr[i]

        return output

if __name__ == "__main__":
    obj = Solution()
    a = [1,2,3,4]
    print(obj.findProduct(a))

