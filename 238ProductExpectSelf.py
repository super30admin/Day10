def productExceptSelf(nums):
    n = len(nums)
    answers = [1]*n

    left = 1
    for i in range(n):
        answers[i] = left
        left *= nums[i]
    
    right = 1 
    for j in range(n-1,-1,-1):
        answers[j] = right
        right += nums[j]
    
    return answers