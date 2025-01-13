 //Product of Array Except Self

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// we use the running product from the left array fiest. That means, create a result array with product of items to the left of the given index
// Next, using the result array i.e computed in the previous result, again do the running product but this time, do from the right.
//The resulting array will be your result. 
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
     if(nums == null || nums.length == 0)
     {
        return new int[] {};
     }   
     int n = nums.length;
     int[] result = new int[n];
     int rp = 1;
     result[0] = rp;
     for (int i =1; i < n; i ++)
     {
        rp = rp * nums[i-1];
        result[i] = rp;
     }
     rp = 1;
     for (int i = n-2 ; i >=0; i--)
     {
        rp = rp * nums[i+1];
        result[i] = result[i] * rp;
     }
     return result;
    }
}


//Problem 2
//Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
// Time Complexity : O(m *n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// There are 2 directions, downward and upward, Lets consider upward as dir = 1 and downward as -1. So on the first row, we are traversing upward then go to 2nd column and then start travesring downward.
// As we traverse, we keep changing directions and based on this keep increasing and decreasing the colums and rows accordingly. 

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
        return new int[] {}; }
    

    int m = mat.length;
    int n = mat[0].length;
    int[] result = new int[m * n];
    int index = 0;
    int row = 0;
    int col = 0;
    int dir = 1;
    //Consider the dir to be 1 i.e we are going upward
    while(index < m * n) {
        result[index] = mat[row][col];
        index++;
        if(dir ==1)
        {
            if(col == n-1)
            {
               dir = -1;
               row++;
            }
            else if (row == 0) {
                dir = -1;
                col++;
            }
            else {
                row--;
                col++;
            }
        }
        else 
        {
            if( row == m-1) {
                dir = 1;
                col++;
            }
            else if (col == 0)
            {
                dir =1;
                row++;
            }
            else
            {
                row++;
                col--;
            }
        } 
    }
    return result;
  }
}

// ## Problem 3
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//Time complexity = O(m*n)
// Space complexity = O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0 ) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> result = new ArrayList<>();
        //result[0][0] = matrix[0][0];
        while (top <= bottom && left <= right)
        {
            
            for(int i =left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
            for(int i= right; i>=left; i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right) {
            for(int i= bottom; i>= top; i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
      return result;
    }
}