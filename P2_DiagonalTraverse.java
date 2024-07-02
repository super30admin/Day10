/*  
using hashmap
TC: O(n*m)
SC: O(1)
Did this code successfully run on Leetcode :yes
Approach: 
take a boolean direction and keep on checking whether we need to traverse in upwards or downwards direction.
apply conditions to check when exactly we need to switch directions
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length; // m
        int cols = mat[0].length; // n
        int row=0; int col=0;
        int[] result = new int[rows*cols];
        int resIndex = 0;
        boolean direction = true; //up
        while(resIndex < rows*cols) {
            result[resIndex] = mat[row][col];
            resIndex++;
            if(direction) {
                if(col == cols-1) {
                    row++;
                    direction = false;
                } else if(row == 0) {
                    col++;
                    direction = false;
                } else {
                    row--;
                    col++;
                } 
            } else {
                if(row == rows-1) {
                    col++;
                    direction = true;
                } else if(col == 0) {
                    row++;
                    direction = true;
                } else {
                    row++;
                    col--;
                } 
            }
        }
        return result;
    }
}
/*  
using hashmap
TC: O(n*m)
SC: O((n+m - 1)*m)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];

        int j=0;
        for(int row=0 ; row<rows ; row++) { 
            for(int col=0 ; col<cols ; col++) {
                ArrayList<Integer> list = new ArrayList<>();
                if(map.containsKey(row+col)) {
                    list = map.get(row+col);
                    list.add(mat[row][col]);
                    map.put(row+col, list);
                } else {
                    list.add(mat[row][col]);
                    map.put(row+col, list);
                }
            }
        }
        for (int key : map.keySet())  {
            if(key%2 != 0) {
                for(int v : map.get(key)) {
                    res[j++] = v;
                }
            } else {
                int size = map.get(key).size();
                int[] temp = new int[size];
                int k = size-1;
                for(int v : map.get(key)) {
                    temp[k--] = v;
                }
                for(int i=0;i<size;i++) {
                    res[j++] = temp[i];
                }
            }
        }
        return res;
    }
}