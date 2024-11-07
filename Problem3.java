// Time Complexity : O(N*M)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
// take 4 pointers place it at each corner then decrement and increment while moving spirally

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/spiral-matrix/
//take 4 pointers place it at each corner
class Problem3 {

    //take 4 pointers place it at each corner
    public List<Integer> spiralOrder(int[][] matrix) {

        int top= 0;
        int bottom = matrix.length -1;
        int right = matrix[0].length -1;
        int left = 0;

        List<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right){
            if(top<=bottom && left<=right){
                for(int i=top ;i<=right;i++){
                    result.add(matrix[left][i]);
                }
                top++;

            }

            if(left<=right){
                for(int j=top ;j<=bottom;j++){
                    result.add(matrix[j][right]);
                }
                right--;
            }


            if(top<=bottom){
                for(int k=right ;k>=left;k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int l=bottom ;l>=top;l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }

        }

        return result;
    }
}