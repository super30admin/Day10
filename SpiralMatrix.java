class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int dir=1;//right
        List<Integer> result = new ArrayList<>();
        int top=0;
        int bottom=m-1;
        int right = n-1;
        int left = 0;
        while(top<=bottom && left <=right){
            //top
if(top<=bottom && left <=right){


            for(int j =left;j<=right;j++){

                result.add(matrix[top][j]);
            }
                top++;

}
                //right

    if(top<=bottom && left <=right){
            for(int i =top;i<=bottom;i++){

                result.add(matrix[i][right]);
            }
                right--;
}
                //bottom
                if(top<=bottom && left <=right){
            for(int j =right;j>=left;j--){

                result.add(matrix[bottom][j]);
            }
                bottom--;
                }
                        //left

if(top<=bottom && left <=right){
            for(int i =bottom;i>=top;i--){

                result.add(matrix[i][left]);
            }
                left++;



        }

        }


      return result;  
    }
}
