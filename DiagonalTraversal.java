class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int col = mat[0].length;
        int[] result = new int[rows*col];
        int cr = 0;
        int ccl = 0;
        boolean flag = true;
        int i = 0;
        while(i != result.length) {
            if (flag) {
                while(cr >= 0 && ccl < col) 
                    result[i++] = mat[cr--][ccl++];
                if (ccl >= col) {
                    cr += 2;
                    ccl--;
                } else 
                    cr++;
                flag = false;
            } else {
                while(ccl >= 0 && cr < rows) 
                    result[i++] = mat[cr++][ccl--];
                if (cr >= rows) {
                    cr--;
                    ccl += 2;
                } else 
                    ccl++;
                
                flag = true;
            }
        }
        return result;
    }
}