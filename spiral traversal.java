class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int i=0,j=0,c=0;
        while(c<(m*n)){
            while(j<m && matrix[i][j]!=-1000){
                res.add(matrix[i][j]);
                matrix[i][j++]=-1000;
                c++;
            }
            i++;j--;
            while(i<n && matrix[i][j]!=-1000){
                res.add(matrix[i][j]);
                matrix[i++][j]=-1000;
                c++;
            }
            j--;i--;
            while(j>=0 && matrix[i][j]!=-1000){
                res.add(matrix[i][j]);
                matrix[i][j--]=-1000;
                c++;
            }
            i--;j++;
            while(i>=0 && matrix[i][j]!=-1000){
                res.add(matrix[i][j]);
                matrix[i--][j]=-1000;
                c++;
            }
            j++;i++;
            
        }
        return res;
    }
}
