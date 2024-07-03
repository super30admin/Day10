# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
The main idea behind this solution is take multiplication of the left side of subarray and take a multiplication of right side of subarray and then multiply both of them. So, first we will store first element as 1 and then in the right side we will keep on multiplying the current element with running product. This will give us left sum of subarray. Then we will trace it back from behind. We will start with n-2 that second last element as there are no elements on the right side for last element. We will keep on multiplying it with running sum first and then we will multiply with stored product of left subarray. Space complexity will be O(1) as we will be storing the product in output array itself. So, auxillary space complexity will be O(1). So, here our output result array will be [1, 1, 2, 6] when we will store left sub array sum. Then, we will get [12*2*1, 4*3*1, 1*4*2, 6].



## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

We will maintain a boolean flag which will tell us in which direction we are going. If we are going up it is set to true and if we are going down it is set to false. First we will store first element in the input array and our flag is true as we will start with upward direction first. In the regular upward traversal without boundary condition row will always decrese and column will always increase. So we put that in else condition. While traversing upwards if we are at last column then our row will increase and we will start traversing downwards setting flag as false. Similaryly, if we are at the top row where row is 0th row we will go to next column and start traversing downwards setting flag as false. Same logic we will apply in the downwards traversal. Everytime we go down row index increases and column index decreases in regular case. In boundary condition if we are at last row our column will increase and we will start traversing upwards and if we are at first column row index will increase and we will start traversing upwards.



## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

The main in this problem is we will traverse through one direction until we reach the boundary condition then we will change the direction. In this way we can complete one spiral and then we will adjust the indices everytime we will change the direction. We will do this until top and bottom indices and left and right indices are equal and doesn't cross each other. Once they cross each other we will stop the loop. First we will go from left to right and at the end we will increase top index as traversal across row is done. Then we will traverse from top to down and decrease the right index. Now we will need to check the indices once if it is crossing each other or not otherwise we will end up repeating same elements. Then we will traverse from right to left and decrease the bottom index and again will traverse from bottom to top and increase the left index. This way will travserse in spiral way.


