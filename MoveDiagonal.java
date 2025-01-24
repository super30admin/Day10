// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Very interesting solution.The comments will need to refered for quick revision
public class MoveDiagonal {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null||mat.length==0)
            return null;

        int rows = mat.length;
        int cols = mat[0].length; 
        int r=0,c = 0;
        int[] results = new int[cols*rows];
        for(int i = 0; i < results.length; i++){
            results[i] = mat[r][c];
            //Move up
            if((r+c)%2==0){
                if(c==cols-1){  // Reached last column. Now move to below cell in the same column.
                    r++;
                }
                else if(r==0){  // Reached first row. Now move to next cell in the same row.
                    c++;
                }
                else{           // Somewhere in middle. Keep going up diagonally.
                    c++;
                    r--;
                }
            }
            //Move Down
            else{
                if(r==rows-1){      // Reached last row. Now move to next cell in same row.
                    c++;
                }
                
                else if(c==0){       // Reached first columns. Now move to below cell in the same column.
                    r++;
                }
                else{                // Somewhere in middle. Keep going down diagonally.
                    c--;
                    r++;
                }
            }
        }
        return results;
    }
}
