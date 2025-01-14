// Time Complexity :O(m*n)
// Space Complexity :O(1)-> as the result array we're using is what the problem ask us to return.
// Did this code successfully run on Leetcode :Yes
public class Problem2 {

//Things to  notice : we can either go up or down so we're using dir which has 1 and -1
    //1-> go up.
    //-1-> go down.
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null ||mat.length == 0){
            return new int[]{};
        }
        int rowLength = mat.length;
        int colLength = mat[0].length;

        int[] result = new int[rowLength * colLength];

        int index = 0;
        int row =0 , col =0;

        int dir = 1;
        //we've to go to each and every index of given matrix
        while(index < rowLength*colLength){
            result[index] = mat[row][col];
            index++;
            if(dir == 1){
                //why this first because if we use the row ==0  condition then what if the col index reaches the last index.
                if(col == colLength-1){
                    dir = -1;
                    row++;
                }
                else if(row == 0){
                    dir = -1;
                    col++;
                }else{
                    //this is generic condition if the direction is up.
                    row--;
                    col++;
                }
            }else {
                if(row == rowLength-1){
                    dir = 1;
                    col++;
                }
                else if(col == 0){
                    dir =1;
                    row++;
                }else{
                    //this is generic condition if the direction is down.
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
