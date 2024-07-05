// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Travel 4 directions and update the range of high and low index accordingly to avoid re-iteration or unbound loop

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int il = 0;
        int jl = 0;
        int ih = mat.length-1;
        int jh = mat[0].length-1;
        List<Integer> res = new ArrayList<Integer>();
        while(res.size()<mat.length*mat[0].length){
            // left right
            if(ih>=0 && il <mat.length && jh>=0 && jl<mat[0].length && res.size()<mat.length*mat[0].length){
                for(int j = jl;j<=jh;j++){
                    res.add(mat[il][j]);
                }

            }
            il++;


            // top down
            if(ih>=0 && il <mat.length && jh>=0 && jl<mat[0].length && res.size()<mat.length*mat[0].length){
                for(int i=il;i<=ih;i++){
                    res.add(mat[i][jh]);
                }

            }
            jh--;


            if(ih>=0 && il <mat.length && jh>=0 && jl<mat[0].length && res.size()<mat.length*mat[0].length){
                for(int j = jh;j>=jl;j--){
                    res.add(mat[ih][j]);
                }


            }
            ih--;

            if(ih>=0 && il <mat.length && jh>=0 && jl<mat[0].length && res.size()<mat.length*mat[0].length){
                for(int i = ih;i>=il;i--){
                    res.add(mat[i][jl]);
                }

            }
            jl++;


        }
        return res;

    }
}