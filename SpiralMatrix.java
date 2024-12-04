class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int l=0;
        int r= matrix[0].length-1;
        int u=0;
        int d= matrix.length-1;

        while(l<=r && u<=d){
            for(int i=l;i<=r;i++){
                list.add(matrix[u][i]);
            }
            u++;
            for(int i=u;i<=d;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if (u<=d){
            for(int i=r;i>=l;i--){
                list.add(matrix[d][i]);
            }
            }
            if (l <= r){
         for(int i=d-1;i>=u;i--){
            list.add(matrix[i][l]);
         }
            }
            d--;
         l++;


        } 
         return list;
}
        
}