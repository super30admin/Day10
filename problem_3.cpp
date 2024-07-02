/*
 *                  Spiral Matrix
 *
 * Leetcode : https://leetcode.com/problems/spiral-matrix/description/
 * Time complexity : O(m * n)
 * Space complexity : O(m * n)
 * Approach :
 *      Iterative traversal using boundary markers (left, right, top, bottom) to 
 *      track the current edge of the spiral.
 */

#include<iostream>
#include<vector>

using namespace std;

vector<int> spiral_matrix(vector<vector<int> >& matrix) {
    vector<int> result;

    int m = matrix.size();
    int n = matrix[0].size();

    int left  = 0;
    int right = n - 1;
    int top = 0; 
    int bottom  = m - 1;

    while (top <= bottom && left <= right) {
        //top row
        for(int j = left; j <= right; j++) {
            result.push_back(matrix[top][j]);
        }
        top++;
        //right column
        for(int i = top; i <= bottom; i++) {
            result.push_back(matrix[i][right]);
        }
        right--;
        //bottom row
        if (top <= bottom) {
            for(int j = right; j >= left; j--) {
                result.push_back(matrix[bottom][j]);
            }
            bottom--;
        }
        //left column
        if (left <= right) {
            for(int i = bottom; i >= top; i--) {
                result.push_back(matrix[i][left]);
            }
            left++;
        }
    }
    return result;
}

int main() {
    vector<vector<int> > matrix;
    // Creating the first row [1, 2, 3]
    vector<int> row1;
    row1.push_back(1);
    row1.push_back(2);
    row1.push_back(3);
    row1.push_back(4);
    matrix.push_back(row1);

    // Creating the second row [4, 5, 6]
    vector<int> row2;
    row2.push_back(5);
    row2.push_back(6);
    row2.push_back(7);
    row2.push_back(8);
    matrix.push_back(row2);

    // Creating the third row [7, 8, 9]
    vector<int> row3;
    row3.push_back(9);
    row3.push_back(10);
    row3.push_back(11);
    row3.push_back(12);
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