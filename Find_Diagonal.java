// Time Complexity : O(m*n)
// Space Complexity : O(1)

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] arr=new int[m*n];
        if(mat==null){
            return arr;
        }
        //matrix location
        int i=0;
        int j=0;

        boolean dir=true;
        int idx=0;
        while(idx<m*n){
            arr[idx]=mat[i][j];
            idx++;
            if(dir){
                if(j==n-1){
                    i=i+1;
                    dir=false;
                }else if(i==0){
                    j=j+1;
                    dir=false;
                }else{
                    i=i-1;
                    j=j+1;
                }
            }else{
                if(i==m-1){
                    j=j+1;
                    dir=true;
                }else if(j==0){
                    i=i+1;
                    dir=true;
                }else{
                    i=i+1;
                    j=j-1;
                }
            }
        }
        return arr;
    }
}