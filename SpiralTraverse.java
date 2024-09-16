class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        int dir=1;
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        List<Integer> list = new ArrayList<Integer>();
        int j=0;
        int top=0;
        int bottom = m-1;
        int left=0;
        int right = n-1;
        while(left <= right && top <= bottom ){
           if(j< m*n){
             for(int i=left; i<=right; i++){
                list.add(mat[top][i]);
                j++;
            }
            top++;  
           }
             if(j< m*n){
             for(int i=top; i<=bottom; i++){
                list.add(mat[i][right]);
                 j++;
            }
            right--;
             }
             if(j< m*n){
             for(int i=right; i>=left; i--){
                list.add(mat[bottom][i]);
                 j++;
            }
            bottom--;
             }
             if(j< m*n){
            for(int i=bottom; i>=top; i--){
                list.add(mat[i][left]);
                j++;
            }
            left++;
             }
            System.out.println("ArrayList : " + list.toString());
          
            
        }
        return list;
    }
}