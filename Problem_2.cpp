/*
Time Complexity: O(m*n)

Space Complexity: O(1) 
*/

#include<iostream>
#include<vector>

class Solution {
public:
    std::vector<int> findDiagonalOrder(std::vector<std::vector<int>>& mat) {
        bool up = true;
        int row = 0;
        int column = 0;
        int numOfRows = mat.size();
        int numOfColumns = mat[0].size();
        std::vector<int> result;
        int idx = 0;
        while(idx < numOfRows*numOfColumns){
            result.push_back(mat[row][column]);
            idx++;
            if (up){
                if(column == numOfColumns-1){
                    row++;
                    up=false;
                }
                else if (row == 0){
                    column++;
                    up=false;
                }
                else{
                    row--;
                    column++;
                }
            }
            else{
                if(row == numOfRows-1){
                    column++;
                    up=true;
                }
                else if (column == 0){
                    row++;
                    up=true;
                }
                else{
                    column--;
                    row++;
                }
            }
        }
        return result;
    }
};



int main(){
    Solution sol = Solution();
    std::vector<std::vector<int>> arr {{1,2,3},{4,5,6},{7,8,9}};
    std::vector<int> vexp_res = {1,2,4,7,5,3,6,8,9};
    std::vector<int> vres = sol.findDiagonalOrder(arr);
    for(int i= 0; i<vexp_res.size(); i++){ 
        int res = vres[i];
        int exp_res = vexp_res[i];
        if (res == exp_res){
            std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
        } else {
            std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
        }
    }

    arr = {{1,2}, {3,4}};
    vexp_res = {1,2,3,4};
    vres = sol.findDiagonalOrder(arr);
    for(int i= 0; i<vexp_res.size(); i++){ 
        int res = vres[i];
        int exp_res = vexp_res[i];
        if (res == exp_res){
            std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
        } else {
            std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
        }
    }
}