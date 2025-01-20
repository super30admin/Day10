class Solution:
    
    def __init__(self):
        self.prodList = []
    
    def getSolution(self,nums):
        
        # running prod on the lhs
        for i in range(0,len(nums)):
            
            if i == 0:
                self.prodList.append(1)
            
            else:
                rpLHS = self.prodList[-1]*nums[i-1]
                self.prodList.append(rpLHS)
        
        # print running prod on lhs
        # print('running product of lhs is:\t',self.prodList)
        
        # running prod on the rhs [Start from behind]
        rpRHS = 1 # for the last (nums-1) index
        
        for j in range(len(nums)-1,-1,-1):
            
            if j == len(nums)-1:
                # Last index
                self.prodList[j] = self.prodList[j] * rpRHS
            
            else:
                rpRHS = rpRHS * nums[j+1] # calculate the rp from rhs
                self.prodList[j] = self.prodList[j] * rpRHS
        
        # print running prod on rhs
        # print('running product of rhs is:\t',self.prodList)
        
        return self.prodList

sol = Solution()
sol.getSolution([1,2,3,4])