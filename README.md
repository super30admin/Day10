# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

## Solution 1
## Time Complexity:O(2n) Space Complexity:O(1)
## Here we have taken running product and done two passes one left to right which takes the previous elements product and add to resultant array.
## In second pass we take the right side or later elements product and  multiply it with the previous elements product in the resultant array.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        int rp=1;
        result[0]=rp;


        for(int i=1;i<n;i++)
        {
            rp=rp*nums[i-1];
            result[i]=rp;
        }

        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=result[i]*rp;
        }
        return result;
    }
}

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

## Solution 2
## Time Complexity:O(m*n) Space Complexity:O(1)
## I am having a direction flag which makes me aware if I am traversing in upwards or downwards direction to find the next element to traverse.
##  I have also handled the edge case to prevent going out of bounds in the first and last rows and columns.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean dir=true;
        int arr[]=new int[m*n];
        int r=0,c=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=mat[r][c];
        if(dir)
        {
            if(c==n-1)
            {
                r++; dir=false;
            }
            else if(r==0)
            {
                c++; dir=false;
            }
            else{
                r--;c++;
            }
            
        }
        else{
          if(r==m-1){
            c++;dir=true;
          }
          else if(c==0)
          {
            r++; dir=true;
          }
          else{
            r++;c--;
          }
         
        }
         
        }
        return arr;

    }
}


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


## Solution 3
## Time Complexity:O(m*n) Space Complexity:O(1)
## I am using a four pointer approach where I am maintaining the left right , top and bottom boundaries and after each traversal.
## I am accordingly updating the boundaries also I am check within the loop so that we dont go out of bound while traversing spirally.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,left=0,bottom=m-1,right=n-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;}
        }
        return result;
    }
}