// ## Problem 3 : https://leetcode.com/problems/spiral-matrix/
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example 1:

// Input:

// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:

// Input:

// [

// [1, 2, 3, 4],

// [5, 6, 7, 8],

// [9,10,11,12]

// ]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Solution:
// Approach: Here in this we are maintaining 4 variables top, bottow, left right
// m=matrix.length;
// n=matrix[0].length;
// top=0;
// bottom=m-1;
// left=0;
// right=n-1;
// and we are iterating the while loop with the condition left<=right && top<=bottom
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new ArrayList<>();
        }

        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        List<Integer> list =new ArrayList<Integer>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}

//With the above solution it will fail for the matrix of size 3*4 
// [
//     1 2 3 4
//     5 6 7 8
//     9 10 11 12
//     ]

// It will give o/p as [1,2,3,4,8,12,11,10,9,5,6,7,6]
// It will again print 6
// This is because we are checking condition at the start and running 4 for loops. what if the top crosses the bottom or left crosses the right 
// in such cases we shouldn't iterate further so one solution is checking condition before iterating every loop. This is a brute force approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new ArrayList<>();
        }

        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        List<Integer> list =new ArrayList<Integer>();
        while(left<=right && top<=bottom){
            if(left<=right && top<=bottom){
                for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            }
            if(left<=right && top<=bottom){
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if(left<=right && top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right && top<=bottom){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}

//Optimal Approach is
