// Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

// Example 1:
// Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,4,7,5,3,6,8,9]

// Example 2:
// Input: mat = [[1,2],[3,4]]
// Output: [1,2,3,4]

// Solution:
// Approach: In this we are maintaining a variable dir i.e direction. It's value will be 1 if it goes bottom up and -1 if it goes top bottom.
// Based on that we are applying conditions of rows and columns.

// Time Complexity : O(m*n) m=no of rows, n=no of columns
// Space Complexity : O(1) as we are supposed to return an 1-D array and we are just creating and returning that
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //Base Condition check
        if(mat==null || mat.length==0){
            return new int[] {};
        }
        //Variable declarations
        int dir=1;
        int row=0;
        int col=0;
        // 1-D array of size m*n 
        int[] arr = new int[mat.length*mat[0].length];
        int i=0;
        //we will iterate till row<mat.length && col<mat[0].length or we can also put an condition like i<m*n
        while(row<mat.length && col<mat[0].length){
            //at each pass we are inserting an element present at that row and column and incrementing the index
            arr[i]=mat[row][col];
            i++;
            //Now here there will be 2 cases 1. Bottom Up i.e dir==1 & 2.Top Down i.e dir ==-1
            if(dir==1){
                // if we are at last column
                if(col==mat[0].length-1){
                    dir=-1;
                    row++;
                }
                //If we are at 0th row
                else if(row==0){
                    dir=-1;
                    col++;
                }
                //If we are in middle
                else{
                    row--;
                    col++;
                }

            }
            else{
                //if we are at last row
                if(row==mat.length-1){                
                    dir=1;
                    col++;
                }
                // If we are at first column i.e 0th
                else if(col==0){
                    dir=1;
                    row++;
                }
                // If we are in between
                else{
                    row++;
                    col--;
                }

            }
        }
        // Returning array
        return arr;
    }
}