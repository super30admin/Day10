class Solution:
    def findBuildings(self, heights: List[int]) -> List[int]:
        """
        TC- O(n)
        SC- O(1)
        """
        #         n=len(heights)
        #         maxheight=-1
        #         answer=[]
        #         for i in range(len(heights)-1, -1,-1): ###O(n)
        #             if heights[i]>maxheight:
        #                 answer.append(i)
        #                 maxheight=heights[i]
        #         answer.reverse() ##O(n)
        #         return answer ###O(1)


        n = len(heights)
        maxheight = -1
        q = collections.deque()
        for i in range(len(heights) - 1, -1, -1):  ###O(n)
            if heights[i] > maxheight:
                q.appendleft(i)
                maxheight = heights[i]
        # answer.reverse() ##O(n)
        return q  ###O(1)




