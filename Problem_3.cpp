/*
Time Complexity: O(m*n)

Space Complexity: O(1) 
*/

#include<iostream>
#include<vector>


class Solution {
public:
    std::vector<int> spiralOrder(std::vector<std::vector<int>>& matrix) {
        int left = 0;
        int right = matrix[0].size()-1;
        int top = 0;
        int bottom = matrix.size()-1;
        std::vector<int> result;
        while(top<=bottom && left<=right){
            for(int j = left; j <= right; j++){
                result.push_back(matrix[top][j]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                result.push_back(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int j = right; j>=left; j--){
                    result.push_back(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }
};

int main(){
    Solution sol = Solution();
    std::vector<std::vector<int>> arr {{1,2,3},{4,5,6},{7,8,9}};
    std::vector<int> vexp_res = {1,2,3,6,9,8,7,4,5};
    std::vector<int> vres = sol.spiralOrder(arr);
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
    vexp_res = {1,2,4,3};
    vres = sol.spiralOrder(arr);
    for(int i= 0; i<vexp_res.size(); i++){ 
        int res = vres[i];
        int exp_res = vexp_res[i];
        if (res == exp_res){
            std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
        } else {
            std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
        }
    }

    arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    vexp_res = {1,2,3,4,8,12,11,10,9,5,6,7};
    vres = sol.spiralOrder(arr);
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

