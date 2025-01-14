import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// maintain four variables T, B < l, R. , while (top <= bottom), run 4 loops to traverse along 4 directions
// and also check if left <= right when going from T to B or B to T and if (top<= bottom) when going from L to R and R to L.

public class SpiralMatrix {

        public List<Integer> spiralOrder(int[][] mat) {
            if(mat == null || mat.length ==0){
                return new ArrayList<>();
            }
            int n = mat.length;
            int m = mat[0].length;
            int left =0, right =m-1, top=0, bottom =n-1;
            List<Integer> result = new ArrayList<>();

            while(top <= bottom){

                // L to R
                for(int i = left;i<=right;i++){
                    result.add(mat[top][i]);
                }
                top++;

                // T to B
                if( left<= right){
                    for(int i = top;i<=bottom;i++){
                        result.add(mat[i][right]);
                    }
                    right--;
                }

                // R to L
                if(top <= bottom){
                    for(int i = right;i >= left;i--){
                        result.add(mat[bottom][i]);
                    }
                    bottom--;
                }

                // B to T
                if(left <= right){
                    for(int i = bottom;i>=top;i--){
                        result.add(mat[i][left]);
                    }
                    left++;
                }
            }
            return result;
        }

}
