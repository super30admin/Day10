// Problem1: https://leetcode.com/problems/product-of-array-except-self/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: It calculates the product of all elements in the array except the current element (nums[i]). It does this by first calculating the product of all elements to the left of nums[i] and storing it in result[i]. Then, it calculates the product of all elements to the right of nums[i] and multiplies it with the value stored in result[i] to get the final result. This process is done for each element in the array, and the final result array is returned.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}

// Problem 2: https://leetcode.com/problems/diagonal-traverse/description/
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach: It traverses the
// matrix diagonally and stores the elements in the result array. It uses a
// boolean variable dir to keep track of the direction of traversal. If dir is
// true, it means the traversal is happening in the upward direction, and if dir
// is false, it means the traversal is happening in the downward direction. It
// also uses two variables r and c to keep track of the current row and column.
// It updates the values of r and c based on the direction of traversal. If dir
// is true, it checks if c is at the last column or r is at the first row. If
// either of these conditions is true, it updates the direction to false and
// increments the value of r or c accordingly. If dir is false, it checks if r
// is at the last row or c is at the first column. If either of these conditions
// is true, it updates the direction to true and increments the value of r or c
// accordingly. It continues this process until all the elements are traversed,
// and the result array is returned.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        boolean dir = true;
        int r = 0, c = 0;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];
            if (dir) {
                if (c == n - 1) {
                    r++;
                    dir = false;
                } else if (r == 0) {
                    c++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = true;
                } else if (c == 0) {
                    r++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}

// Problem 3: https://leetcode.com/problems/spiral-matrix/description/
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach: It traverses the
// matrix in a spiral order and stores the elements in the result array. It uses
// four variables top, bottom, left, and right to keep track of the boundaries
// of the matrix. It starts by traversing the top row from left to right, then
// increments the value of top. It then traverses the right column from top to
// bottom, then decrements the value of right. It continues this process until
// all the elements are traversed, and the result array is returned.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}