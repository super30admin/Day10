# TC: O(n)
# SC: O(1)



def product_of_itself(arr):
    n = len(arr)
    mul_arr = [1] * n

    # left product
    left = 1
    for i in range(1, n):
        mul_arr[i] *= left
        left *= arr[i]

    right = 1
    for i in range(n - 1, -1, -1):
        mul_arr[i] *= right
        right *= arr[i]
    
    return(mul_arr)


    # Right product 


print(product_of_itself([1, 2, 3, 4, 5]))