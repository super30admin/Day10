"""
Given two integer arrays nums1 and nums2,
return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return
the result in any order.
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

"""


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        """
        TC onlogn, m+logn
        sc -1
        """
        nums1.sort()
        nums2.sort()
        i, j = 0, 0
        result = []
        while i < len(nums1) and j < len(nums2):
            if nums1[i] > nums2[j]:
                j += 1
            elif nums1[i] < nums2[j]:
                i += 1
            else:
                result.append(nums1[i])
                i += 1
                j += 1
        return result

        """
        Time: O(m+n), space- o(min(m,n))
        """

        if len(nums2) < len(nums1):
            return self.intersect(nums2, nums1)
        hashmap = {}  ##put smaller length in hashmap
        result = []
        for c in nums1:
            if c in hashmap:
                hashmap[c] += 1
            else:
                hashmap[c] = 1
        for c in nums2:
            if c in hashmap and hashmap[c] > 0:
                result.append(c)
                hashmap[c] -= 1
        return result






