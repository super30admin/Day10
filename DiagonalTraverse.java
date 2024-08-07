// the idea is to get a pattern between the various indexes of the matrix
// and then look at direction (upward or downward)
// the find edge cases.
// the time complexity = O(m*n)
// the space complexity = O(1)
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;// thr no. of rows
        int m = mat[0].length;// the no. of columns.
        int[] res = new int[n*m];
        boolean direction = true;// go upward first
        int r = 0;
        int c = 0;
            for(int k=0;k< res.length;k++ ) {
                res[k] = mat[r][c];
                // direction = upward
                if(direction) {
                    // where will it break
                    if(r==0 && c!=m-1) { // the edge case of r==0 and c= m-1(0,3) in a 3x3 matrix.
                        direction = false;
                        c++;
                    } else if(c== m-1) {
                        direction = false;
                        r++;
                    }else {
                        // normal case.
                        r--;
                        c++;                    
                    }
                    
                } else { // direction = downward
                    // where will it break
                    if(r== n-1) {
                        direction = true;
                        c++;
                    }
                    else if(c==0 && r!= n-1) { // the edge case of 1,0 in a 2x2 matrix.
                        direction = true;
                        r++;
                    } else {
                        // normal case.
                        r++;
                        c--;                        
                    }                                    
                }

    }
        return res;
    }
}