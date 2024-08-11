
//Time Complexity:O(m*n)
//Space Complexity:O(m*n)
import java.util.Arrays;

public class DiagonalTraverse {
    public int[] findDiagonalTraverse(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0;
        int c=0;
        boolean flag=true;
        int [] result=new int[m*n];
        for(int i=0;i<result.length;i++){
            result[i]=matrix[r][c];
            if(flag){
                if(r==0 && c!=n-1){
                    c++;
                    flag=false;
                }
                else if(c==n-1){
                    r++;
                    flag=false;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(c==0 && r!=m-1){
                    r++;
                    flag=true;
                }else if(r==m-1){
                    c++;
                    flag=true;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        DiagonalTraverse dt = new DiagonalTraverse();
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[] result=dt.findDiagonalTraverse(matrix);
        System.out.println(Arrays.toString(result));
    }
}
