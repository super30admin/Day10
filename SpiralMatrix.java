/**
Have top bottom, right and left variables to mainain the traversal. 
Then loop over each traversal maintaining the two pointers.

TC-O(m*n).  SC--O(1)
 */


 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top=0, right =n-1 , left = 0, bottom = m-1;

        while(top<=bottom && left<=right){
            // right traverse;
            for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);
            }
            top++;
            //bottom traverse
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            //left traverse
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
            //up traverse
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }



        }
        return list;
    }
}