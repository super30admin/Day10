import java.util.Arrays;
class problem_2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int[m*n];
        int idx = 0;
        if(matrix ==null) return result;
        int i = 0;// matrix location
        int j =0;
        boolean dir = true;
        while(idx < m*n){
            result[idx] = matrix[i][j];
            idx++;
            //find new location of i and j
            if(dir){
                //up
                if(j == n-1){
                    i++;
                    dir = false;

                }else if(i ==0){
                    j++;
                    dir=false;

                }else{
                    i--; j++;
                }
            }else{
                //down
                if(i == m-1){
                    j++;
                    dir = true;

                }else if(j ==0){
                    i++;
                    dir=true;

                }else{
                    j--; i++;
                }
            }

        }
        return result;
        
    }
    public static void main(String args[]){
        problem_2 obj = new problem_2();
        // test case 1
        int [][] mat ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(obj.findDiagonalOrder(mat)));
    }
}