// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,temp=1, n=nums.length;
        int ans[] = new int[n];
        for(i=0;i<n;i++){
            ans[i]=temp;
            temp = temp * nums[i];
        }
        temp =1;
        for(i=(n-1);i>=0;i--){
            ans[i]=ans[i]*temp;
            temp = temp *nums[i];
        }
        return ans;
    }
}


// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix==null || matrix.length==0)
            return ans;
        int i = 0, j = 0, m = matrix.length, n = matrix[0].length;
        while(i<m && j<n){
            for(int k=j;k<n;k++){
                ans.add(matrix[i][k]);
            }
            i++;
            for(int k=i;k<m;k++){
                ans.add(matrix[k][n-1]);
            }
            n--;
            if (i<m){
                for(int k=(n-1);k>=j;k--){
                    ans.add(matrix[m-1][k]);
                }
                m--;
            }
            if(j<n){
                for(int k=(m-1);k>=i;k--){
                    ans.add(matrix[k][j]);
                }
            }
            j++;
        }
        return ans;
    }
}


// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        
        int m = mat.length, n = mat[0].length;
        int[] arr = new int[m * n];
        int i = 0, j = 0, k = 0;
        boolean asc = true;

        while (k < m * n) {
            arr[k++] = mat[i][j];

            if (asc) {
                if (j == n - 1) { 
                    i++; 
                    asc = false; 
                } else if (i == 0) { 
                    j++; 
                    asc = false; 
                } else { 
                    i--; 
                    j++; 
                }
            } else {
                if (i == m - 1) { 
                    j++; 
                    asc = true; 
                } else if (j == 0) { 
                    i++; 
                    asc = true; 
                } else { 
                    i++; 
                    j--; 
                }
            }
        }
        
        return arr;
    }
}



