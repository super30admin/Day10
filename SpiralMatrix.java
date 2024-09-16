class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //o(m x n) time and o(1) space
        List<Integer> nums = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return nums;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;

        while (nums.size() < size) {

            for (int i=left; i<=right && nums.size() < size; i++) {
                nums.add(matrix[top][i]);
            }
            top++;

            for (int i=top; i<=bottom && nums.size() < size; i++) {
                nums.add(matrix[i][right]);
            }
            right--;

            for (int i=right; i>= left && nums.size() < size; i--) {
                nums.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i=bottom; i>= top && nums.size() < size; i--) {
                nums.add(matrix[i][left]);
            }
            left++;
        }

        return nums;

    }
}

class Recursion {

    List<Integer> result=new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length == 0) return result;

        helper(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1);

        return result;

    }

    public void helper(int[][] matrix, int left, int right, int top, int bottom){

        if(left > right || top > bottom) return;

        for(int i = left; i <= right; i++){
            result.add(matrix[top][i]);
        }
        top++;

        for(int i = top; i <= bottom; i++){

            result.add(matrix[i][right]);

        }

        right--;

        if(top <= bottom){
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);

            }

        }

        bottom--;

        if(left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);

            }

        }

        left++;
        helper(matrix,left, right, top, bottom);

    }

}