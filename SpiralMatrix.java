import java.util.ArrayList;
import java.util.List;

//Time - O(m*n)
//Space - O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums==null || nums.length==0) return result;

        int m = nums.length, n = nums[0].length;
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;

        while(left<=right && top<=bottom){
            //Move left to right
            for(int i=left; i<=right; i++){
                result.add(nums[top][i]);
            }
            top++;

            //Move top to bottom
            if(left<=right){
                for(int i=top; i<=bottom; i++){
                    result.add(nums[i][right]);
                }
                right--;
            }

            //Move right to left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(nums[bottom][i]);
                }
                bottom--;
            }

            //Move bottom to top
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(nums[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
