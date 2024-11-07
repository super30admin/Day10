// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Approach : created four pointers top bottom left and right to create boundaries for each iteration.
// each spiral can be treated a iteration, after each iteration, these top,bottom,right ,left values decreases.
// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0,r=n-1,t=0,b=m-1;
        List<Integer> arr=new ArrayList<>();
        int i;
        while(l<=r&&t<=b)
        {
            for(i=l;i<=r;i++)
            {
                arr.add(matrix[t][i]);
            }
            t++;
            for(i=t;i<=b;i++)
            {
                arr.add(matrix[i][r]);
            }
            r--;
            if(l<=r&&t<=b){
                for(i=r;i>=l;i--)
                {
                    arr.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r&&t<=b){
                for(i=b;i>=t;i--)
                {
                    arr.add(matrix[i][l]);
                }
                l++;
            }
        }
        return arr;
    }
}
}
