//Time - O(m*n)
//Space - O(1)
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] nums) {
        if(nums==null || nums.length==0) return new int[]{};

        int dir = 1;
        int m = nums.length, n = nums[0].length;
        int row = 0, col = 0;
        int[] result = new int[m * n];
        int index = 0;

        while(row>=0 && row<m && col>=0 && col<n){
            result[index] = nums[row][col];
            index++;

            //If moving bottom to top
            if(dir == 1) {
                if(col == n-1) {
                    row++;
                    dir = -1;
                } else if(row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else { //If moving top to bottom
                if(row == m-1) {
                    col++;
                    dir = 1;
                } else if(col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}