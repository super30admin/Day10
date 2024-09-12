//time complexity O(m x n)
//space complexity O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int T = 0;
        int B = m - 1;
        int L = 0;
        int R = n - 1;
        while(L <= R && B >= T){
            //Top row
            for(int i = L; i <= R; i++){
                result.add(matrix[T][i]);
            }
            T++;

            //Right column
            for(int j = T; j <= B; j++){
                result.add(matrix[j][R]);
            }
            R--;

            //Bottom row
            //we need to check these conditions again because
            //the top has changed
            if(T <= B){
                for(int k = R; k >= L; k--){
                    result.add(matrix[B][k]);
                }
            }
            B--;


            //Left column
            //we need to check these conditions again because
            //the right has changed
            if(L <= R){
                for(int l = B; l >= T; l--){
                    result.add(matrix[l][L]);
                }
            }
            L++;
        }
        return result;
    }
}
