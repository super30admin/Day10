// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Traversing as following simulation. Took care of repetition by incrementing respective 
pointers and also checked boundary condition inside loop also to avoid extra elements (or unnecessary
traversal in case of only row and only column).  */
// Your code here along with comments explaining your approach

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();

        vector<int> ans;

        int top=0;
        int bottom = m-1;
        int left =0;
        int right = n-1;

        //until top has breached bottom and left has breached right.process continues
        while(top <= bottom && left <= right){
            
            //go from left to right
            for(int i =left; i<=right; i++){
                ans.push_back(matrix[top][i]); //top row
            }
                top++; //to avoid repetition of element (eg 3)
            
            //go from top to bottom
            if(left<=right){
            for(int i =top; i<=bottom; i++){
                    ans.push_back(matrix[i][right]); //right column
            }
                right--; //to avoid repetition of element (eg 9)
            }
            
            //go from right to left
            if(top<=bottom){
                for(int i =right; i>=left; i--){
                    ans.push_back(matrix[bottom][i]); //bottom row
                } 
                bottom--;  //to avoid repetition of element (eg 7)
            }

            //go from bottom to top
            if(left<=right){
                for(int i =bottom; i>=top; i--){
                    ans.push_back(matrix[i][left]); //left column
                }
                left++;
            }
        }
        return ans;
    }
};