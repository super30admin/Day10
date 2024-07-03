// Time Complexity : O(mn)
// Space Complexity :O(mn)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// The solution involves traversing the matrix diagonally. 
// Depending on whether the sum of the current row and column indices is even or odd, 
// the traversal direction is adjusted accordingly. The algorithm ensures that the traversal stays within the bounds of the matrix by checking edge conditions for rows and columns.

// Your code here along with comments explaining your approach
public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int res[] = new int[m*n];

        int r = 0;
        int c = 0;

        int index = 0;
        while(index<m*n){
            res[index]=mat[r][c];
            index++;

            if((r+c)%2==0){
                if(r==0 && c!=n-1){
                    c++;
                }else if(c==n-1){
                    r++;
                }else{
                    r--;c++;
                }
            }else{
               if(c==0 && r!=m-1){
                    r++;
                }else if(r==m-1){
                    c++;
                }else{
                    c--;r++;
                } 
            }
        } 
        return res;     
    }
} 
