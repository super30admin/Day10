class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean UpDir=true;
        
        int[] result=new int[m*n];
        int r=0, c=0;
        
        for(int i=0;i<m*n;i++){
            result[i]=mat[r][c];
            if(UpDir){ //up
                if(r==0 && c!=n-1){
                    c++;
                    UpDir=false;
                }else if(c==n-1){
                    r++;
                    UpDir=false;
                }else{
                    r--;
                    c++;
                }
            }else{ //down
                if(c==0 && r!=m-1){
                    r++;
                    UpDir=true;
                }else if(r==m-1){
                    c++;
                    UpDir=true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}