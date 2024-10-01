class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [] res=new int[m*n];
        int i=0,j=0,k=0;
        while(k<(m*n)){
            while(i>=0 && j<m){
                res[k++] = mat[i--][j++];
            }
            i++;
            if(j>=m){
                j--;i++;
            }
            while(i<n && j>=0){
                res[k++] = mat[i++][j--];
            }
            j++;
            if(i>=n){
                i--;j++;
            }
        }
        return res;
    }
}
