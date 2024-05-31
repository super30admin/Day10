//time complexity:O(m*n)
//space complexity:O(1)

import java.util.*;
public class Spiral {
        public List<Integer> spiralOrder(int[][] matrix)
        {
            if(matrix==null || matrix.length==0)
            {
                return new ArrayList<>();
            }
            List<Integer> list= new ArrayList<>();
            int m= matrix.length;
            int n= matrix[0].length;
            int top=0, bottom=m-1;
            int right= n-1, left=0;

            while(top<=bottom && left<=right)
            {
                // left to right
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
                //top to bottom
                if(top<=bottom && left<=right)
                {
                    for(int i=top;i<=bottom;i++)
                    {
                        list.add(matrix[i][right]);
                    }
                    right--;
                }
                //right to left
                if(top<=bottom && left<=right)
                {
                    for(int i=right; i>=left;i--)
                    {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                // bottom to top
                if(top<=bottom && left<=right)
                {
                    for(int i=bottom;i>=top;i--)
                    {
                        list.add(matrix[i][left]);
                    }
                    left++;
                }

            }
            return list;
        }
        public static void main(String[] args) {
            Spiral spiral = new Spiral();
            int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
            List<Integer> list = spiral.spiralOrder(matrix);
            list=spiral.spiralOrder(matrix);
            System.out.println(list);
        }
    }

