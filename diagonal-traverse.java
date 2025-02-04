// Time Complexity :O(m*n)+O(m+n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach:brueteforce approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> sMap=new HashMap<>();
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];
        
        for(int i=0;i<m;i++){ // O(m)
            for(int j=0;j<n;j++){// O(n)
            int count = i+j ;
            if(!sMap.containsKey(count)){
                sMap.put(count,new ArrayList<>());
            }
                sMap.get(count).add(mat[i][j]);
            }
        }
        int countinueIndex = 0;
        for(int k=0;k<m+n-1;k++){ O(m+n)
             List<Integer> sample=sMap.get(k);
              
               if(k%2 == 0){
              for(int i =sample.size()-1;i>=0;i--){
                    result[countinueIndex++] = sample.get(i);
                   
                  } 
               } else{
                   for(int i =0;i<sample.size();i++){
                   result[countinueIndex++]= sample.get(i);
                    
                  }
               }   
        }
        return result;
    }
}




// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach:i have implementedthis by using two direction and checking edge cases and chanaging corresponding direction changes by filling resultant array;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
       int n=mat[0].length;
       int[] result=new int[m*n];
       boolean dir=true;
       int r=0;int c=0;
       
       for(int i=0;i<m*n;i++){ //O(m*n)
        result[i]=mat[r][c];
       if(dir){
         if(r==0 && c!=n-1){
            c++;
            dir=false;
        }else if(c == n-1){
            r++;
            dir=false;
        }
        else{
         r--;c++;
        }
       }else{
        if(c== 0&&r != m-1){
            r++;
            dir=true;
        }else if(r == m-1){
            c++;
            dir=true;
        }
        else{
            r++;c--;
        }
       }
       }
        return result;
    }
}