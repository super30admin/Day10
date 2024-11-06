// Time Complexity : O(n*m)
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach - created an arraylist to store
//the values based on r+c value. And then just altrnated between up and down before storing to
//array


import java.util.*;
/**
 * DiagonalTraverse : DiagonalTraverse
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 06, 2024)
 * @since : 1.0 (Nov 06, 2024)
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int N = matrix.length;
        int M = matrix[0].length;
        int result[] = new int[N*M];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int r = 0; r < N; r++){
            for(int c = 0; c < M ; c++){
                int val = r + c;
                if(list.size() <= val){
                    list.add(val, new ArrayList<>());
                }
                list.get(val).add(matrix[r][c]);
            }
        }
        int i = 0, j = 0;
        for(ArrayList<Integer> l: list){
            if(i % 2 == 0){
                Collections.reverse(l);

            }
            for(int k = 0; k < l.size(); k++){
                result[j++] = l.get(k);
            }
            i++;
        }

        return result;
    }
}
