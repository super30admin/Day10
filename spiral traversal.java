class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int i=0,j=0,top=0,right=m-1,left=0, bottom=n-1;
        while(top<=bottom && left<=right){
            while(j<=right){
                res.add(matrix[i][j++]);         
            }
            i++;j--;top++;

            while(i<=bottom){
                res.add(matrix[i++][j]);
            }
            j--;i--;right--;

            while(j>=left && top<=bottom){
                res.add(matrix[i][j--]);
            }
            i--;j++;bottom--;
            while(i>=top && left<=right){
                res.add(matrix[i--][j]);
            }
            j++;i++;left++;
            
        }
        return res;
    }
}
