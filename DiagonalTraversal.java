//TC: O(m*n)
//SC: O(1)
//Approach: Consider upwards direction as r-1 & c+1 and downwards as r+1 & c-1. Everytime we hit the edges of the matrix , change the index and direction of the traversal accordingly.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];

        int r=0; int c=0; boolean up = true;
        for(int i=0;i<m*n;i++){
            arr[i] = mat[r][c];
            if(up){ //upwards
                if(r == 0 && c!=n-1) { c++; up=false;} //edges & top left
                else if (c==n-1) { r++; up = false;} //top right
                else { r--; c++;}
            }else{ //downwards
                if(c==0 && r!=m-1) { r++; up=true;} // edges & bottom right
                else if(r==m-1) { c++; up=true;} // bottom left
                else { r++; c--;}
            }
        }

        return arr;
    }
}