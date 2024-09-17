// Time Complexity : O(Columns * rows)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * Once a matrix memeber is visited it is replaced with 101 as the question says -100 <= elements <= 100
 * Then the directions are changed accordingly  
 */

// Your code here along with comments explaining your approach

import java.util.*;

class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
        int i = 0;
        int j = -1;
        String dir = "right";
        while (count < ((matrix.length) * (matrix[0].length))) {
            if (dir == "right" && j < n) {
                if (matrix[i][j + 1] == 101) {
                    dir = "down";
                    i++;
                } else
                    j++;
            } else if (dir == "right" && j == n) {
                i++;
                dir = "down";
            } else if (dir == "down" && i < m) {
                if (matrix[i + 1][j] == 101) {
                    j--;
                    dir = "left";
                } else
                    i++;
            } else if (dir == "down" && i == m) {
                j--;
                dir = "left";
            } else if (dir == "left" && j > 0) {
                if (matrix[i][j - 1] == 101) {
                    i--;
                    dir = "up";
                } else
                    j--;
            } else if (dir == "left" && j == 0) {
                i--;
                dir = "up";
            } else if (dir == "up" && i > 0) {
                if (matrix[i - 1][j] == 101) {
                    dir = "right";
                    j++;
                } else
                    i--;
            } else if (dir == "up" && i == 0) {
                dir = "right";
                j++;
            }

            result.add(matrix[i][j]);
            matrix[i][j] = 101;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Spiral sp = new Spiral();
        System.out.println(sp.spiralOrder(mat).toString());
    }
}