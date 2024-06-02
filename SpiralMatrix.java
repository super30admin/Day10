/**

 Approach: Matrix traversal spirally

 Working:

     iterate through the elements spirally till top<=bottom and left<=right
         move left to right, increment top
         move top to bottom, decrement right
         check top<=bottom since top changed
             move right to left, decrement bottom
         check left<=right since right changed
            move bottom to top, increment left

 Time Complexity: O(m*n)
 Space Complexity: O(1)
 */

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {


        int m = matrix.length;
        int n = matrix[0].length;
        int left=0, right=n-1;
        int top=0, bottom=m-1;
        List<Integer> result = new ArrayList<>(m*n);

        while(left<=right && top<=bottom) {

            //moving left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //moving top to bottom
            for(int i = top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //moving right to left
            if(top<=bottom) { //sinse top hase changed in current iteration
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //moving bottom to top
            if(left<=right) { //since right has changed in current iteration
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }
}
