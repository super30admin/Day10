
/**
Approach: Have a direction up and down as boolean. 
According to direction move = ros and cols by utilizing edge cases as well

TC---(O(m*n)), SC---(O(1))
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean dir = true;
        int rlength = mat.length;
        int clength = mat[0].length;
        int row =0;int col =0;
        int[] result = new int[rlength*clength];
        for(int i=0;i< rlength*clength;i++){
            result[i]=mat[row][col];

        // up condition
        if(dir){
            if(row==0 && col !=clength-1) {
                col++; 
                dir = false;
            } 
            else if (col ==clength-1){
                row++; 
                dir = false;
            }
            // no boundary condition
            else {
                row--;
                col++;
            }
        } else {
        //down condition
            if(col==0 && row !=rlength-1) {
                row++; 
                dir = true;
            } 
            else if (row ==rlength-1){
                col++; 
                dir = true;
            }
            // no boundary condition
            else {
                row++;
                col--;
            }
        }
    }

    return result;  
    }
}
    
