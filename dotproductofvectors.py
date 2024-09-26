class SparseVector:
    """

  Time complexity:
O(n) for creating the <index, value> pair for non-zero values; O(L+L 2 ) for calculating the dot product.

Space complexity:
O(L) for creating the <index, value> pairs for non-zero values. O(1) for calculating the dot product.
    """

    def __init__(self, nums: List[int]):
        self.array = []
        for index, item in enumerate(nums):
            if item != 0:
                self.array.append([index, item])

    # Return the dotProduct of two sparse vectors
    def dotProduct(self, vec: 'SparseVector') -> int:
        result = 0
        p = 0
        q = 0
        while p < len(self.array) and q < len(vec.array):
            ###if indexes equal
            if self.array[p][0] == vec.array[q][0]:
                result += self.array[p][1] * vec.array[q][1]
                p += 1
                q += 1
            elif self.array[p][0] < vec.array[q][0]:
                p += 1
            else:
                q += 1
        return result

#         result=0
#         for num1, num2 in zip(self.array, vec.array):
#             result+=num1*num2
#         return result


class SparseVector:


    """ this approach is better
    ON for constructing the sparse vector and  On for calculating the dot product
    space o1 below
    """
    def __init__(self, nums: List[int]):
        self.array=nums


    # Return the dotProduct of two sparse vectors
    def dotProduct(self, vec: 'SparseVector') -> int:
        result=0
        for num1, num2 in zip(self.array, vec.array):
            result+=num1*num2
        return result


# Your SparseVector object will be instantiated and called as such:
# v1 = SparseVector(nums1)
# v2 = SparseVector(nums2)
# ans = v1.dotProduct(v2)