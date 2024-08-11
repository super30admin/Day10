// Time : o(mn)
// space : o(1) since output is not counted in space complexity

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int dir = 1; // right = 1, down = 2, left = 3, up = 4
        vector<int> answer(matrix.size()*matrix[0].size());


        int right_edge = matrix[0].size() - 1; // right most column 
        int down_edge = matrix.size() -1; // bottom most row
        int left_edge = 0; // left most column
        int up_edge = 0; // top most row

        int r = 0; 
        int c = 0;
        for(int i = 0; i < answer.size(); i++)
        {
            answer[i] = matrix[r][c];
            if(dir == 1) // right
            {
                if(c == right_edge)
                {
                    // change direction to down
                    dir = 2;
                    r++;
                    // change edge for upward traversal
                    up_edge++;
                }
                else
                {
                    c++;
                }

            }
            else if(dir == 2) // down
            {
                if(r == down_edge)
                {
                    // change direction to left
                    dir = 3;
                    c--;
                    // change edge for right traversal
                    right_edge--;
                }
                else
                {
                    r++;
                }

            }
            else if(dir == 3) // left
            {
                if(c == left_edge)
                {
                    // change direction to up
                    dir = 4;
                    r--;
                    // change edge for down traversal
                    down_edge--;
                }
                else
                {
                    c--;
                }
            }
            else // up
            {
                if(r == up_edge)
                {
                    // change direction to right
                    dir = 1;
                    c++;
                    // change edge for left traversal
                    left_edge++;
                }
                else
                {
                    r--;
                }

            }
        }
    return answer;
    }
    
};