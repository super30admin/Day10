// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Traverse in 4 directions using four seperate loops. maintain 4 pointers that take care of the boundries of each spiral. check while condition each time a update to pointer is made.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList();
        int t = 0; int b = m-1; int l = 0; int r = n-1;

        while(t <= b && l<=r){
            //top
            for(int j=l;j<=r;j++) result.add(matrix[t][j]);
            t++;
            //right
            if((t <= b && l<=r)){
                for(int i=t;i<= b; i++) result.add(matrix[i][r]);
                r--;
            }
            //bottom
            if((t <= b && l<=r)){
                for(int j=r;j>=l;j--) result.add(matrix[b][j]);
                b--;
            }
            //left
            if((t <= b && l<=r)){
                for(int i=b;i>=t; i--) result.add(matrix[i][l]);
                l++;
            }
        }
        return result;
    }
}