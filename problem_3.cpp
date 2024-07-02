/*
 *                  Spiral Matrix
 *
 * Leetcode : https://leetcode.com/problems/spiral-matrix/description/
 * Time complexity : O(m * n)
 * Space complexity : O(m * n)
 * Approach :
 *      Using recursion
 */

#include<iostream>
#include<vector>

using namespace std;



vector<int> spiral_matrix(vector<vector<int> >& matrix) {

}

int main() {
    vector<vector<int> > matrix;
    // Creating the first row [1, 2, 3]
    vector<int> row1;
    row1.push_back(1);
    row1.push_back(2);
    row1.push_back(3);
    matrix.push_back(row1);

    // Creating the second row [4, 5, 6]
    vector<int> row2;
    row2.push_back(4);
    row2.push_back(5);
    row2.push_back(6);
    matrix.push_back(row2);

    // Creating the third row [7, 8, 9]
    vector<int> row3;
    row3.push_back(7);
    row3.push_back(8);
    row3.push_back(9);
    matrix.push_back(row3);

    int m = matrix.size();
    int n = matrix[0].size();
    vector<int> result(m*n);

    result = spiral_matrix(matrix);

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}