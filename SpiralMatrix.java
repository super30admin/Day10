// essentially use 4 pointers.
// 2 for top and bottom rows
// 2 for left and right columns.
// Time complexity = O(m*n)
// Space complexity = O(1)

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<Integer> li = new ArrayList<>();
        int top= 0;
        int bottom = n-1;// last row.
        int left = 0; // left column
        int right = m-1; // last column
        int k=0;
        while(left<= right && top<= bottom ) {
            // top
                for(int i=left;i<=right;i++) {
                    li.add(mat[top][i]);
                }

                top++;
                

            // right
            if(top<= bottom && left<= right) {
                for(int i=top;i<=bottom;i++) {
                    li.add(mat[i][right]);
                }
                right--;
            }

            // bottom
            if(top<= bottom && left<= right) {
                for(int i=right;i>=left;i--) {
                    li.add(mat[bottom][i]);                    
                }

                bottom--;
            }
            // left
            if(top<= bottom && left<= right) {
                for(int i=bottom;i>=top;i--) {
                    li.add(mat[i][left]);
                }

                left++;
            }
        }
        return li;
        
    }
}