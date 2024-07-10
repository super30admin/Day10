// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//product of all elemnts except self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int rp = 1;
        result[0] = rp;
        //left to right
        for(int i = 1; i < n; i++){
            rp = rp*nums[i-1];
            result[i] = rp;//left to right products in array
        }

        //right to left
        rp = 1;
        for(int i =n -2; i >= 0; i--){
            rp = rp*nums[i+1];//right to left produt
            result[i] = result[i]*rp;//left to right product multiplied by right to left
        }
        return result;
    }
}
//diagonal Traverse
//time complexity = O(m*n)
//space complexity = O(m*n)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int[m*n];
        int r =0; int c=0;
        int idx = 0; //index for result array
        boolean flag = true;
        while(idx < m*n){
            result[idx] = matrix[r][c];
            idx++;
            if(flag){
                if(c==n - 1){
                    r++; flag = false;
                } else if(r == 0){
                    c++; flag = false;
                } else {
                    r--; c++;
                }
            } else{
                if(r==m - 1){
                    c++; flag = true;
                } else if(c == 0){
                    r++; flag = true;
                } else {
                    c--; r++;
                }
            }
        }
        return result;
    }
}
//sprial matrix
//using 4 indicators for traversing right row or column
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0; int bottom = m-1;
        while(top <= bottom && left <= right){
            //top row
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                //bottom row
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                //left col
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}
