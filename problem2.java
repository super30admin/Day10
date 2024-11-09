// Time Complexity : o(m*n)
// Space Complexity : o(1) for answer array; constant space O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : We calculate by checking out the change in row, column and direction
// while moving from one cell to another; analyzing this we form the if and else logic for row and column variables in
// the negative and positive directions




public class problem2 {

    public int[] findDiagnolOrder(int[][] mat)
    {
        int m=mat.length;
        int n=mat[0].length;

        int [] res= new int[m*n];
        boolean dir=   true;
        int r=0, c=0;

        for (int i=0; i<m*n; i++)
        {
            res[i]= mat[r][c];

            if (dir)
            {
                if (r==0 && c!=m-1)
                {
                    c++;
                    dir= false;
                }
                else if (r==n-1)
                {
                    r++;
                    dir= false;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (c==0 && r!=m-1)
                {
                    r++;
                    dir= true;
                } else if (r==m-1) {
                    c++;
                    dir= true;
                }
                else {
                    c--;
                    r++;
                }
            }
        }
        return res;
    }


}
