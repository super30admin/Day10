//time complexity:O(m*n)
//space complexity:O(1)

public class DiagonalTraverse {
        public int[] findDiagonalOrder(int[][] mat)
        {
            if(mat==null || mat.length==0)
            {
                return new int[]{};
            }
            int m=mat.length;
            int n= mat[0].length;
            int[] result= new int[m*n];
            int index=0;
            int row=0, col=0;
            int dir=1;
            while(index<m*n)
            {
                result[index]=mat[row][col];
                index++;
                //bottom to top
                if(dir==1)
                {
                    if(col==n-1)
                    {
                        dir=-1;
                        row++;
                    }
                    else if(row==0)
                    {
                        dir=-1;
                        col++;
                    }
                    else
                    {
                        row--;
                        col++;
                    }

                }
                //top to bottom
                else
                {
                    if(row==m-1)
                    {
                        dir=1;
                        col++;
                    }
                    else if(col==0)
                    {
                        dir=1;
                        row++;
                    }
                    else
                    {
                        row++;
                        col--;
                    }
                }
            }
            return result;

        }
    public static void main(String[] args) {
            DiagonalTraverse obj=new DiagonalTraverse();
            int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
            int[] result=obj.findDiagonalOrder(mat);
            for(int i=0;i<result.length;i++)
            {
                System.out.print(result[i]+" ");
            }
    }
    }

