class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int dir=1;
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int i=0;
         int r=0;
        int c=0;
        while(i< m*n){
          result[i]= mat[r][c];
          i++;
          if(dir==1){
              if(c==n-1){
                  r++; dir=-1;
              }
              else if(r==0){
                  c++; dir=-1;
              }else {
                  r--; c++;
              }
          }
            else{
                if(r== m-1){
                    c++; dir=1;
                }
                else if(c==0){
                    r++; dir=1;
                }
                else{
                      r++; c--; 
                }
                
            }
            
        }
        return result;
    }
}