class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      if nums == None or len(nums) == 0:
        return [] 

                      # 1, 2, 3, 4
                    #   1. 1. 2. 6
                    #  24.12. 4. 1

      prefix = [1 for _ in range(len(nums))]
      suffix = [1 for _ in range(len(nums))]
      # for prefix product

      for i in range(1,len(nums)):
        prefix[i] = prefix[i-1] * nums[i-1]

      #For suffix product
      for i in range(len(nums)-2, -1,-1):
        suffix[i] = nums[i+1] * suffix[i+1]

      res = [1 for _ in range(len(nums))]
      for i in range(len(res)):
        res[i] = prefix[i] * suffix[i]
      return res

      # brute force solution O(n^2)
      # res = []
      # for i in range(len(nums)):
      #   prod = 1
      #   for j in range(len(nums)):
      #     if i != j :
      #       prod *= nums[j]
      #   res.append(prod)

      # return res

      



        