// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
We traverse the matrix up and down diagonally. Lets say when we go up, direction is true
and when we go down direction is false. As we go up and down we store elements in result array.
When we go up and i becomes 0 we need to change the direction and go to next column, or when j becomes n-1 
we go to next row and change direction. Similarly for going down. Edge case when we go up and i becomes 0 and j becomes n-1 then
we have to i=t+1 and change direction. Same way, when we go down and in cornet (i==m-1 and j==0) then we have to make j=j+1 and change direction.
*/

public class DiagonalTraverse {
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
