// TC = O(m + n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

    class Solution {
    public:
        vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
            // null
            if(mat.size() == 0) return vector<int>(0,0);
            int m = mat.size(), n = mat[0].size(), dir = 1, idx = 0, i = 0, j = 0;
            vector<int> result(m * n);
            while(idx < (m * n)) {
                result[idx++] = mat[i][j];
                if(dir == 1) {
                    if(i == 0 && j != (n - 1)) {
                        j++; dir = -1;
                    }
                    else if(j == (n - 1)) {
                        i++; dir = -1;
                    }
                    else {
                        i--; j++;
                    }
                }
                else {
                    if(j == 0 &&  i!= (m - 1)) {
                        i++; dir = 1;
                    }
                    else if(i == (m - 1)) {
                        j++; dir = 1;
                    }
                    else {
                        j--; i++;
                    }
                }
            }
            return result;
        }
    };