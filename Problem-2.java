class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int r = 0, c =0;
        boolean flag = true; // true - up, false - down
        int [] result = new int[m*n];
        int index = 0;

        for(int i = 0; i< result.length; i++){
            result[i] = mat[r][c];

            if(flag){
                if(r == 0 && c!= n-1){
                    c++;
                    flag = false;
                }else if (c == n -1){
                    r++;
                    flag = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(c == 0 && r != m-1){
                    r++;
                    flag = true;
                }else if (r == m -1){
                    c++;
                    flag = true;
                }else{
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
}