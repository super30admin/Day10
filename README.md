# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

# At any given element we need the product of elements to the left of the element and right of the 
# element.
# Create a result array by taking product of the left elements except the number itself.
# On this result array now we will take product of the right elements except the number itself.
# The resultant array will return us the products.

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

# Get the number of rows and columns and initialize a result array of size product of rows & columns
# to store the result.
# Initialize an index as '0' and start parsing the matrix by appending the first element
# First we go in the upward direction, by incrementing the row index and change the direction to False
# until we reach the roof condition of the matrix
# Second we go down once the roof is reached and collect all the column index elements and change 
# direction to True until we hit the bottom row of the matrix. The condition 'True' indicates to go UP. 
# Return the result array.

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

# Initialize an array of size that is rows times columns
# First we move from left to right on the top row, by parsing on each column and same row, collect 
# all elements
# Move from top to bottom by parsing each row and same column, collect all elements
# Move from right to left but check the condition top <= bottom so that we don't collect
# duplicates, collect all elements
# Move from bottom to top but check the condition that left <= right to make sure we don't collect
# duplicates. Parse each row element and same column, collect all elements.