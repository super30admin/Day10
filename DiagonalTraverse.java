class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return null;
        }

        int m = mat.length;
        int n = mat[0].length;
        int row =0, col=0;
        int dir = 1;
        int[] result = new int[m*n];
        for(int index=0; index<m*n; index++){
            result[index] = mat[row][col];
            if(dir == 1){
                if(col==n-1){
                    dir = -1;
                    row++;
                } else if (row==0){
                    dir = -1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            } else {
                if(row==m-1){
                    dir=1;
                    col++;
                } else if(col == 0){
                    dir = 1;
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
