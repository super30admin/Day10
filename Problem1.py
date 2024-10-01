#238. Product of Array Except Self
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix = []
        prefix.append(1)
        postfix = [32 for _ in range(n)]
        output = []
        postfix[-1] = 1
        pre = 1

        for i in range(1,n):
            pre = pre * nums[i-1]
            prefix.append(pre)

        post = 1
        for i in range(n-2, -1,-1):
            post = post * nums[i+1]
            prefix[i] = post * prefix[i]

        print(prefix)
        return prefix
        

        

        