# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


res = [1] * len(nums)

for i in range(1, len(nums)):
    res[i] = res[i-1] * nums[i-1]

mul = 1
for i in range(len(nums)-1, -1, -1):
    res[i] *= mul
    mul *= nums[i]

return res