// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        vector<int>ans;

        while (left <= right && top<= bottom) {
            //update top
            if (left <= right && top<= bottom){
            for (int i=left; i<=right; i++){
                ans.push_back(matrix[top][i]);
            }
            top++;
            }
            // update right
            if(left <= right && top<= bottom) {
            for (int i=top; i<=bottom; i++) {
                ans.push_back(matrix[i][right]);
            }
            right--;}

            // update bottom
            if (left <= right && top<= bottom) {
            for (int i=right; i>=left; i--) {
                ans.push_back(matrix[bottom][i]);
            }
            bottom--;}

            // update left
            if (left <= right && top<= bottom) {
            for (int i=bottom; i>=top; i--) {
                ans.push_back(matrix[i][left]);
            }
            left++;}

        }
        return ans;

    }
};