// as done in class
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        int m = matrix.size();
        int n = matrix[0].size();

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while(top <= bottom && left <= right) {
            if(top <= bottom && left <= right) {
                for(int j = left; j <= right; j++) {
                    result.push_back(matrix[top][j]);
                }
                top++;
            }
            if(top <= bottom && left <= right) {
                for(int i = top; i <= bottom; i++) {
                    result.push_back(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom && left <= right) {
                for(int j = right; j >= left; j--) {
                    result.push_back(matrix[bottom][j]);
                }
                bottom--;
            }
            if(top <= bottom && left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
};