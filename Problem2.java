// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
//https://leetcode.com/problems/diagonal-traverse/description/
// Your code here along with comments explaining your approach
class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        //direction
        boolean isUp = true;
        int size = mat.length* mat[0].length;
        int[] result = new int[size];


        //move diagonally in the boundry based on direction
        int r=0;
        int c=0;
        for(int i=0;i<result.length;i++){
            result[i] =  mat[r][c];
            if(isUp){
                //going up

                if(c == mat[0].length -1){
                    r++;
                    isUp=false;
                }else if(r== 0){
                    c++;
                    isUp=false;

                }
                else{
                    r--;
                    c++;
                }

            }else{
                if(r==mat.length-1){
                    c++;
                    isUp=true;
                }else if(c==0){
                    r++;
                    isUp=true;
                }
                else{
                    r++;
                    c--;
                }


            }
        }

        return result;
    }


}