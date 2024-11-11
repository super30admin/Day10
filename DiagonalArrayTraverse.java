// Time Complexity :O(m*n) n is number of elements in array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class DiagonalArrayTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int[] result = new int[m+n];

        int r=0, c=0;
        boolean dir= true;

        for(int i=0; i<m+n; i++){
            result[i]= matrix[r][c];

            if(dir){
                if(r==0 && c!=n-1){
                    c++;
                } else if(c==n-1){
                    r++;
                    dir=false;
                }else{
                    r--; c++;
                    dir = false;
                }
            }
            else{
                if(c==0 && r!=m-1){
                    r++;
                }else if(r==m-1){
                    c++;
                    dir = true;
                }else{
                    c--; r++;
                    dir = true;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        DiagonalArrayTraverse prob2 = new DiagonalArrayTraverse();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Output "+prob2.findDiagonalOrder(matrix));
    }
}
