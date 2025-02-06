/// Time complexity:O(m*n)
// Space complexity:O(1)


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m =mat.length;
        int n=mat[0].length;
        int[]result=new int[m*n];
        int idx=0;
        boolean dir=true;
        if(mat.length==0||mat==null) return result;
        int i=0;int j=0;
        while(idx<(m*n)){
            result[idx]=mat[i][j];
            idx++;
            if(dir){
                if (i==0&&j!=n-1){
                    j++;
                    dir=false;
                }
                else if(j==n-1){
                    i++;
                    dir=false;
                }
                else{
                    i--;j++;
                }
            }else{
                if (j==0&&i!=m-1){
                    i++;
                    dir=true;
                }
                else if(i==m-1){
                    j++;
                    dir=true;
                }
                else{
                    i++;j--;
                }
            }
        }
        return result;
        
    }
}