public class DiagonalOrderOfMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        // 0,0   0,1   0,2  0,3
        // 1,0   1,1   1,2  1,3
        // 2,0   2,1   2,2  2,3
        // 3,0   3,1   3,2  3,3
        //(i,j) m*n
        /*
                1 2 3
                4 5 6
                7 8 9
       */

        int m = matrix.length;
        if(m == 0) return new int[0];
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int dir = 0;
        int r = 0, c = 0;
        for(int i = 0; i < m * n; i++){
            res[i] = matrix[r][c];
            if(dir==0){
                r--;
                c++;
            } else {
                r++;
                c--;
            }

            if(r >= m) {
                r = m - 1;
                c += 2;
                dir = 0;
            }

            if(c >= n) {
                c = n - 1;
                r += 2;
                dir = 1;
            }

            if(r < 0){
                r = 0;
                dir = 1;
            }

            if(c < 0){
                c = 0;
                dir = 0;
            }
        }
        return res;
    }



    public static void main(String[] str){
        DiagonalOrderOfMatrix diagonalOrderOfMatrix=new DiagonalOrderOfMatrix();
       int res[]= diagonalOrderOfMatrix.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
       for(int i:res)
           System.out.println(i+"-");
    }

}

      /*  int rows=matrix.length;
        int cols=matrix[0].length;
        int[] result=new int[rows*cols];
        int i=0;    int idx=0; int j=1;
        int up=0;
        int down=1;
        result[idx++]=matrix[i][i];
        while(idx<=rows*cols-1){
            if(down==1){
                while(j>0)
                {

                        result[idx++]=matrix[i][j];
                        i++;j--;

                }
            }

            up=1;
            down=0;
            if(up==1){
                while(i>0){

                        result[idx++]=matrix[i][j];
                        i--; j++;

                }

            }

            down=1;
            up=0;

        }
        return result;*/