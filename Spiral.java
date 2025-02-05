//Tracking vosoted nodes and looping through the array in spiral
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix[0].length;  
        int n = matrix.length;     
        
        if (n == 0 || m == 0) return new ArrayList<>();  
        
        String direction = "Right";
        boolean[][] visited = new boolean[n][m];  
        List<Integer> returnArr = new ArrayList<>();
        
        int i = 0, j = 0;
        int counter = 0;
        
        while (counter < m * n) {  
            returnArr.add(matrix[i][j]);
            visited[i][j] = true;  
            counter++;
            
            if (direction.equals("Right")) {
                if (j == m - 1 || visited[i][j + 1]) {
                    direction = "Down";
                    i++;  
                } else {
                    j++;  
                }
            }
            else if (direction.equals("Down")) {
                if (i == n - 1 || visited[i + 1][j]) {
                    direction = "Left";
                    j--;  
                } else {
                    i++;  
                }
            }
            else if (direction.equals("Left")) {
                if (j == 0 || visited[i][j - 1]) {
                    direction = "Up";
                    i--;  // Move up
                } else {
                    j--;  // Move left
                }
            }
            else if (direction.equals("Up")) {
                if (i == 0 || visited[i - 1][j]) {
                    direction = "Right";
                    j++;  // Move right
                } else {
                    i--;  // Move up
                }
            }
        }
        
        return returnArr;
    }
}
