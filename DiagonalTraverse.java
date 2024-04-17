// Time Complexity : O(m*n) , m is the no of rows , n is the no of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int noOfRows = mat.length;
        int noOfColumns = mat[0].length;

        int result[] = new int[noOfRows * noOfColumns];

        boolean dir = true;
        int r=0, c=0;

        for(int i=0; i<noOfRows * noOfColumns; i++) {
            result[i] = mat[r][c];

            if(dir) { //travelling upwards
                if(c == noOfColumns - 1) { // last column in the matrix, we go downwards
                    r++; dir = false;
                } else if(r == 0) {
                    c++; dir = false;
                } else {
                    r--;c++;
                }
            } else { //travelling downwards
                if(r == noOfRows-1) { //last row in the matrix, we go upwards
                    c++; dir = true;
                } else if(c == 0) {
                    r++; dir = true;
                } else {
                    r++; c--;
                }
            }
        }
        return result;
    }
}