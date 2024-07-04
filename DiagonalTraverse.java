/**
 * Time Complexity: O(m * n)
 * Space Complexity: O(m * n)
 */

import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        Map<Integer, ArrayList<Integer>> diagElements = new HashMap<>();

        int rows = mat.length;
        int cols = mat[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int key = i + j;
                if(!diagElements.containsKey(key)) {
                    diagElements.put(key, new ArrayList<>());
                }
                diagElements.get(key).add(mat[i][j]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();


        for(int i = 0; i < rows + cols -1; i++) {
            ArrayList<Integer> temp = diagElements.get(i);
            if(i %2 == 0) {
                for(int j = temp.size() - 1; j>= 0; j--) {
                    result.add(temp.get(j));
                }

            }
            else {
                result.addAll(temp);
            }
        }
        int index = 0;
        int[] diagResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            diagResult[index++] = result.get(i);
        }

        return diagResult;

    }
}