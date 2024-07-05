// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// iterate over the elements in a up down fashion, make sure not to go out of bounds

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int m = mat.length;
        int n = mat[0].length;
        int k = 0;
        int[] res = new int[m*n];
        while(k<res.length){
            // up
            while(isPossible(i,j,k,mat)){
                res[k] = mat[i][j];
                k++;
                if(isPossible(i-1,j+1,k,mat)){
                    i--;
                    j++;
                }
                else{
                    break;
                }
            }
            if(isPossible(i,j+1,k, mat)){
                j++;
            }
            else{
                if(isPossible(i+1,j,k, mat)){
                    i++;
                }
            }


            // down

            while(isPossible(i,j,k,mat)){
                res[k] = mat[i][j];
                k++;
                if(isPossible(i+1,j-1,k,mat)){
                    i++;
                    j--;
                }
                else{
                    break;
                }
            }
            if(isPossible(i+1, j,k, mat)){
                i++;
            }
            else{
                if(isPossible(i,j+1,k,mat)){
                    j++;
                }
            }

        }
        return res;
    }

    public boolean isPossible(int i, int j,int k,int[][] mat){
        return i>=0 && i<mat.length && j>=0 && j<mat[0].length && k<mat.length*mat[0].length;
    }
}
