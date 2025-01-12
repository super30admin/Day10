/***********************PROBLEM-1*******************/

// Time Complexity : O(N) N=length of nums
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : YES
// Get the left product and right product and multiply and return the array

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0){
            return new int[]{};
        }
        int rp=1,n=nums.length;
        int[] left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            left[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            left[i]=left[i]*rp;
        }
        return left;
    }
}

/***********************PROBLEM-2*******************/

// Time Complexity : 0(M*N) M=No of rows in matrix,N=no of columns in matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// take the matrix traversal in two directions upwards and downwards and write cases for
    // direction change and the next element depending on the behaviour

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat==null){
            return new int[]{};
        }

        int dir=1,index=0;
        int m=mat.length,n=mat[0].length,i=0,j=0;
        int[] result=new int[m*n];
        while(index<m*n){
            result[index++]=mat[i][j];
            if(dir==1){ //upward direction
                if(j==n-1){
                    dir=-1;
                    i++;
                }else if(i==0){
                    dir=-1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else{ //downward direction
                if(i==m-1){
                    dir=1;
                    j++;
                }else if(j==0){
                    dir=1;
                    i++;
                }else{
                    i++;
                    j--;
                }

            }
        }
        return result;
    }
}

/***********************PROBLEM-3*******************/

// Time Complexity : 0(m*n) m=no of rows, n= no of cols of matrix given
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>();
        }

        int m = matrix.length, n = matrix[0].length, index = 0;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // go left to right
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            // go top to bottom
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // go right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // go bottom to top
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