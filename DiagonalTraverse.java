class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n=mat[0].length;
        int idx=0;
        int [] result = new int[m*n];
        if(mat == null)
        return result;
        int i=0;
        int j=0;
        boolean dir = true;
        while(idx<m*n)
        {   
            result[idx] =mat[i][j];
            idx++;

        if(dir)
        {
            //up
            if(j==n-1){
                i++;
                dir = false;
            }
            else if(i==0)
            {
                j++;
                dir = false;
            }
            else{
                i--;
                j++;
            }

        }
        else{
            //down
            if(i==m-1){
                j++;
                dir = true;
            }
            else if(j==0)
            {
                i++;
                dir = true;
            }
            else{
                j--;
                i++;
            }
        }

        }   
        return result;
         }
}

//tc : O(m*n) m is the rows and n is the columns
//sc : O(m*n) m is the rows and n is the columns if we consider teh result array else it is O(1)