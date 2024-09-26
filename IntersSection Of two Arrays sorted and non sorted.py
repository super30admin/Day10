"""https://leetcode.com/problems/intersection-of-two-arrays/submissions/"""


class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1.sort()  # assume sorted
        nums2.sort()  # assume sorted
        result = []
        i, j = 0, 0
        print(nums1, nums2)
        while i < len(nums1) and j < len(nums2):
            if nums2[j] > nums1[i]:
                """remember to increment the smaller pointer"""
                i += 1
                print(j)
            elif nums2[j] < nums1[i]:
                j += 1
            else:
                # to avoid duplicates
                if not result or (result and nums1[i] != result[-1]):
                    result.append(nums1[i])
                i += 1
                j += 1
        return result


        ###approach using popping
        nums1.sort()  # assume sorted
        nums2.sort()  # assume sorted
        result = []
        while nums1 and nums2:
            if nums2[-1] > nums1[-1]:
                nums2.pop()
            elif nums2[-1] < nums1[-1]:
                nums1.pop()
            else:
                # to avoid duplicates
                if not result or (result and nums1[-1] != result[-1]):
                    result.append(nums1[-1])
                nums1.pop()
                nums2.pop()
        return result

        """"Approach ising sets"""
        ###O(n+m)
        ###intersection2 using sets
        set1 = set(nums1)
        set2 = set(nums2)
        self.result = []
        if len(set1) < len(set2):
            return self.returnintersection(set1, set2)
        else:
            return self.returnintersection(set2, set1)

    def returnintersection(self, s1, s2):
        for v in s1:
            if v in s2:
                self.result.append(v)
        return self.result

