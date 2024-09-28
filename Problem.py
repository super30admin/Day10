def findingmissing(nums):
    l = 0
    r = len(nums) -1

    while l <=r:
        mid = (l + r) // 2

        if nums[mid] - mid == 1:
            l =  mid + 1
        elif nums[mid] - mid == 2:
            r = mid -1
    return l +1


nums = [1, 2, 3, 5]
print(findingmissing(nums))