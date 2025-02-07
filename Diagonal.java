// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
Start from r=0,c=0. Start moving along diagonal in up direction. If you hit the roof, change the direction downwards. 
Start moving down diagonally and store elements in array in the result. Once you hit left corner again change the direction and move up diagonally. 
Keep on repeating this until all the elements in array has been covered.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        //all the elements will be stored in result
        int[] result = new int[m * n];
        
        if(mat == null)
            return result;

        //up == direction is going up
        boolean dir = true; 

        //we will always start at mat[0][0]
        int r = 0;
        int c = 0;
        int index = 0; //index of result

        while(index < m*n) {

            result[index++] = mat[r][c];
            //we are going up
            //direction changes at roof and right side
            if(dir) {
                
                //we are hitting right corner, so go to next row eg:-3
                if(c == n - 1) {

                    r++;
                    dir = false;
                }
                //eg:-1 , we are hitting roof, go to next col
                else if(r == 0) {

                    c++;
                    dir = false;
                }
                else{

                    r--;
                    c++;
                }
            }
            //we are going down
            //dir changes at bottom and left side
            else {

                //we are hitting left side
                if(r == m - 1) {

                    c++;
                    dir = true;
                }
                //we are hitting bottom
                else if(c == 0) {

                    r++;
                    dir = true;
                }
                else {

                    c--;
                    r++;
                }
            }
        }

        return result;
    }
}