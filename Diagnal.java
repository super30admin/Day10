//Using hashmap to solve this problem

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        
        int m = mat.length;      // Number of rows
        int n = mat[0].length;   // Number of columns
        

        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;  
                if (!diagonals.containsKey(key)) {
                    diagonals.put(key, new ArrayList<>());
                }
                diagonals.get(key).add(mat[i][j]);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int key : diagonals.keySet()) {
            List<Integer> diagonal = diagonals.get(key);
            if (key % 2 == 0) {
  
                result.addAll(diagonal);
            } else {

                Collections.reverse(diagonal);
                result.addAll(diagonal);
            }
        }
        

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        
        return output;
    }
}
