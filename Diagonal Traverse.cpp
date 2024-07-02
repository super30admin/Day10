// as done in class
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int> result;
        int r = 0, c = 0;
        bool dir = true;
        int idx = 0;
        while(idx < m*n) {
            result.push_back(mat[r][c]);
            idx++;
            if(dir) {
                if(c == n-1) {
                    r++;
                    dir = false;
                }
                else if(r == 0) {
                    c++;
                    dir = false;

                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if(r == m-1) {
                    c++;
                    dir = true;
                }
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
};