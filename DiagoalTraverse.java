class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] arr=new int[m*n];
        int idx=0;
        int i = 0, j = 0;

        boolean dir=true;
        while (idx < m * n) {
            arr[idx++] = mat[i][j];
            if(dir){
                if(i==0 && j!=n-1){
                    j+=1;
                    dir=false;
                }
                else if(j==n-1){
                    i+=1;
                    dir=false;
                }else{
                    i-=1;
                    j+=1;
                }
            }
            else{
                if(j==0 && i!=m-1){
                    i+=1;
                    dir=true;
                }
                else if(i==m-1){
                    j+=1;
                    dir=true;
                }else{
                    j-=1;
                    i+=1;
                }
            }
        }

        return arr;
    }
}