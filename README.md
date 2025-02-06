# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
## SOLUTION
class Solution {

    public int[] productExceptSelf(int[] nums) {

        //edge

        if(nums == null || nums.length == 0) return new int [0];

        int [] result = new int [nums.length];

        int rp = 1; int temp = 1;

        //left pass

        for(int i = 0; i < nums.length; i++){

            rp = rp * temp;

            result[i] = rp;

            temp = nums[i];

        }

        //[1,1,2,6]

        rp = 1; temp = 1;

        //right pass 

        for(int i = nums.length - 1; i >=0; i--){

            rp = rp * temp;

            result[i] = result[i] * rp;

            temp = nums[i];

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
## SOLUTION
class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
      if(matrix == null || matrix.length == 0) return new int[0];
      int m = matrix.length;
      int n = matrix[0].length;
      int [] result = new int[m*n];
      int r = 0, c = 0;
      int i = 0;
      int dir = 1;
      while(i < m*n){
          result[i] = matrix[r][c];
          if(dir == 1){
              if(c==n-1) {
                  r++;
                  dir = -1;
              } else if (r==0) {
  //common mistake if r == 0 is checked before c== n-1
                  c++;
                  dir = -1;
              } else{
                  r--;
                  c++;
              }
          } else {
              if(r == m-1) {
                  c++;
                  dir = 1;
              } else if(c==0) {
                  r++;
                  dir = 1;
              } else {
                  r++; c--;
              }
          }
          i++;
      }
      return result;
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
## SOLUTION
class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List <Integer> result = new ArrayList<>();

         if(matrix.length == 0) return result;

        int left = 0;

        int top = 0;

        int right = matrix[0].length - 1;

        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom){

            // Top row 

            for(int i = left; i <= right; i++){

                result.add(matrix[top][i]);

            }

            top++;


            // right column 

            for(int i = top; i <= bottom; i++){

                result.add(matrix[i][right]);

            }

            right--;


            if(top <= bottom){

               for(int i = right; i >= left; i--){

                    result.add(matrix[bottom][i]);

                } 

            }

            bottom--;

            if(left <= right){

               for(int i = bottom; i >= top; i--){

                    result.add(matrix[i][left]);

                }  

            }

            left++;

        }

        return result;

    }

}