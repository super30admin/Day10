// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Approach: we found out the pattern for each direction: up and down. Took Up direction as true condition and changed the row and
// column values accordingly. same case with the down direction for false direction condition. added each value to a new array.
// Your code here along with comments explaining your approach

public class Diagonal_Traverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;
            int r=0,c=0;
            int[] arr=new int[m*n];
            boolean dir=true;
            for(int i=0;i<m*n;i++)
            {
                arr[i]=mat[r][c];
                if(dir)
                {
                    if(c==n-1){r++;dir=false;}
                    else if(r==0){c++;dir=false;}
                    else{r--;c++;}
                }
                else
                {
                    if(r==m-1){c++;dir=true;}
                    else if(c==0){r++;dir=true;}
                    else{r++;c--;}
                }
            }
            return arr;
            
        }
    }
}
