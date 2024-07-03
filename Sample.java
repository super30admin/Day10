// Time Complexity : O(n) as we will be going over the array twice
// Space Complexity : O(1) as we will be storing the product in output array itself. So, auxillary space complexity will be O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// The main idea behind this solution is take multiplication of the left side of subarray and take a multiplication of right side of subarray and then multiply
// both of them. So, first we will store first element as 1 and then in the right side we will keep on multiplying the current element with running product.
// This will give us left sum of subarray. Then we will trace it back from behind. We will start with n-2 that second last element as there are no elements
// on the right side for last element. We will keep on multiplying it with running sum first and then we will multiply with stored product of left subarray.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int n = nums.length;
        int[] result = new int [n];
        int rp = 1;

        result[0] = rp;

        for (int i = 1; i < n; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;

        for (int i = n-2; i >= 0; i--) {
            rp = rp * nums[i+1];
            result[i] = rp * result[i];
        }

        return result;
    }
}


// Time Complexity : O(m*n) as we will be going over all the elements in the matrix.
// Space Complexity : O(1) as  we will be storing the traversal in output array itself. So, auxillary space complexity will be O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We will maintain a boolean flag which will tell us in which direction we are going. If we are going up it is set to true and if we are going down it is set 
// to false. First we will store first element in the input array and our flag is true as we will start with upward direction first. In the regular upward 
// traversal without boundary condition row will always decrese and column will always increase. So we put that in else condition. While traversing upwards if we
// are at last column then our row will increase and we will start traversing downwards setting flag as false. Similaryly, if we are at the top row where row is 0th
// row we will go to next column and start traversing downwards setting flag as false. Same logic we will apply in the downwards traversal. Everytime we go down
// row index increases and column index decreases in regular case. In boundary condition if we are at last row our column will increase and we will start 
// traversing upwards and if we are at first column row index will increase and we will start traversing upwards.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null) {
            return new int[]{};
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        int idx = 0;
        boolean flag = true;

        while(idx < m*n) {
            result[idx] = mat[r][c];
            idx++;

            if(flag) {
                if(c == n-1) {
                    r++;
                    flag = false;
                } else if (r == 0) {
                    c++;
                    flag = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m-1) {
                    c++;
                    flag = true;
                } else if (c == 0) {
                    r++;
                    flag = true;
                } else {
                    c--;
                    r++;
                }
            }
        }

        return result;
    }
}


// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
// The main in this problem is we will traverse through one direction until we reach the boundary condition then we will change the direction. In this way we can
// complete one spiral and then we will adjust the indices everytime we will change the direction. We will do this until top and bottom indices and left and right
// indices are equal and doesn't cross each other. Once they cross each other we will stop the loop. First we will go from left to right and at the end we will
// increase top index as traversal across row is done. Then we will traverse from top to down and decrease the right index. Now we will need to check the indices
// once if it is crossing each other or not otherwise we will end up repeating same elements. Then we will traverse from right to left and decrease the bottom 
// index and again will traverse from bottom to top and increase the left index. This way will travserse in spiral way.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while(top <= bottom && left <= right) {
            
            for(int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for(int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for(int i = bottom; i>= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
}


