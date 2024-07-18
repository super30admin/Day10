/*
    1. Time Complexity : O(m*n)
    2. Space Complexity : O(1)  
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

 class Solution {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m*n];
        boolean flag = true;
        int i = 0, j = 0, k = 0;
        while (i<m && j<n) {
            res[k++]= mat[i][j];
            if (flag) {
                if (i>0 && j<n-1) {
                    --i;
                    ++j;
                } else {
                    flag = false;
                    if (j == n-1) ++i;
                    else ++j; 
                } 
            } else {
                if (i <m-1 && j>0) {
                    ++i;
                    --j;
                } else {
                    flag = true;
                    if (i==m-1)  ++j;
                    else ++i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{4,5,6,5},{7,8,9,1}};
        int[] res = findDiagonalOrder(nums);
        System.out.println("Diagonal Travers of Matrix is");
        for (int n: res)
            System.out.print(n+" ");
    }
}