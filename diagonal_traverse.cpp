// Time : O(m*n)
// space : o(1). Output is not counted in space complexity

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int direction = 1; // up = 1, down = -1
        int r = 0;
        int c = 0;
        vector<int> answer(mat.size()*mat[0].size()); 

        for(int i = 0 ;i < answer.size(); i++)
        {
            answer[i] = mat[r][c];

            if(direction == 1) // up
            {
                if(r ==0 && c != mat[0].size() -1)
                {
                    c++;
                    direction = -1; //change to down
                }
                else if(c == mat[0].size()-1)
                {
                    r++;
                    direction = -1; // change to down
                }
                else
                {
                    r--; c++;
                }
            }
            else // down
            {
                if(c ==0 && r != mat.size() -1)
                {
                    r++;
                    direction = 1; //change to up
                }
                else if(r == mat.size()-1)
                {
                    c++;
                    direction = 1; // change to up
                }
                else
                {
                    r++; c--;
                }
            }
        }

        return answer;

        
    }
};