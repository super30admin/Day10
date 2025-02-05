class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        if(mat == null) return result;
        boolean dir = true;
        int i=0;//matrix location
        int j=0;//matrix location
        int idx =0;
        while(idx < m*n){

            result[idx]=mat[i][j];
            idx++;
//up
            if(dir){

               if(j==n-1){
                    i=i+1;
                    dir=false;
                
               }  else if(i==0){

                j=j+1;
                dir=false;
               }   else{
                i=i-1;
                j=j+1;
               }


            }
//down


   else {

               if(i==m-1){
                    j=j+1;
                    dir=true;
                
               }  else if(j==0){

                i=i+1;
                dir=true;
               }   else{
                i=i+1;
                j=j-1;
               }


            }


            
        }
     return result;   
        
    }
}
