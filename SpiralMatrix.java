import java.util.ArrayList;
import java.util.List;

/*
Traverse the matrix. Use variable top, bottom, left and right. Increase top and left as we complete
a row and a column, decrease bottom and right by 1 as we complete a row and column.
*/
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> ll=new ArrayList<>();
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        while(left<=right && top<=bottom){
            //top
            for(int j=left;j<=right;j++){
                ll.add(matrix[top][j]);
                System.out.println("top");
            }
            top++;
            //right
            for(int j=top;j<=bottom;j++){
                ll.add(matrix[j][right]);
                System.out.println("right");
            }
            right--;
            //bottom
            for(int j=right;j>=left && top<=bottom;j--){
                ll.add(matrix[bottom][j]);
                System.out.println("bottom");
            }
            bottom--;
            //left
            for(int j=bottom;j>=top && left<=right;j--){
                ll.add(matrix[j][left]);
                System.out.println("left");
            }
            left++;
        }
        
        return ll;
    }
}
