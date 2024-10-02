// Time Complexity : 0(m*n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r=0;
        int c=0;
        boolean upDir = true ;
        //up
        for(int i =0; i<m*n ; i++)
        {
            result[i]= mat[r][c];
            if(upDir)
            {
                if(c==n-1)
                {
                    r++;
                    upDir = false;
                }
                else if(r==0)
                {
                    c++;
                    upDir = false;
                }
                else
                {
                    r--; c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    upDir = true;
                }else if(c==0)
                {
                    upDir = true;
                    r++;
                }
                else
                {
                    c--;r++;
                }
            }
        }
        return result;
    }
}