#TC: O(N)
#SC: O(N)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        #nums=[1,2,3,4]
        #answer=[24,12,8,6]

        length = len(nums)
        answer =[0]*length

        answer[0]=1
        for i in range(1,length):
            answer[i] = nums[i-1]*answer[i-1]

        temp=1
        for j in reversed(range(length)):
            answer[j]= answer[j]*temp
            temp*=nums[j]

        return answer



        