// Time Complexity : O(mxn)
// Space Complexity : O(1) I used output array.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I used the same logic Jaspinder explained. 
// Used 4 pointers as the boundaries changes when go through the matrix.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int result [] = new int [m*n];
        int t = 0, l = 0, r = n - 1, b = m - 1;

        while(l<=r && t<=b){
            //top
            for(int i = l; i <= r; i++){
                list.add(matrix[t][i]);
            }
            t++;

            //right
            if(t<=b){
                for(int i = t; i <= b; i++){
                    list.add(matrix[i][r]);
                }
                r--;
            }
            //bottom
            if(t<=b){
                for(int i = r;i>=l; i--){
                    list.add(matrix[b][i]);
                }
                b--;
            }
            

            //left
            if(l<=r){
                for(int i = b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }
            
        }
        return list;
    }
}